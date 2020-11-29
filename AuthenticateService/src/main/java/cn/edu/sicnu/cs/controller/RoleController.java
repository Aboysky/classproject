package cn.edu.sicnu.cs.controller;

import cn.edu.sicnu.cs.constant.ResultCode;
import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Role;
import cn.edu.sicnu.cs.pojo.ReturningRolePriv;
import cn.edu.sicnu.cs.pojo.ReturningRoleWithprivsgroup;
import cn.edu.sicnu.cs.service.MetaOperationService;
import cn.edu.sicnu.cs.service.RolePrivService;
import cn.edu.sicnu.cs.service.RoleService;
import cn.edu.sicnu.cs.utils.JsonUtils;
import cn.edu.sicnu.cs.utils.ResUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Classname RoleController"
 * @Description TODO
 * @Date 2020/11/20 19:43
 * @Created by Huan
 */
@RestController
@Api(value = "role",description = "管理角色和权限的接口",tags = {"role","priv","privgroup"})
public class RoleController {

    private final static Logger logger = LoggerFactory.getLogger(RoleController.class);

    @Autowired
    RoleService roleService;

    @Autowired
    RolePrivService rolePrivService;

    @Autowired
    MetaOperationService metaOperationService;

//    @PostMapping("${soft_version}/role/{roleid}")
//    @ApiOperation(tags = "role",notes = "添加一个角色",code = 200, value = "add Role")
//    public String addRole(@ApiParam(name = "roleid",required = true,value = "角色id")@PathVariable Integer roleid, @ApiParam(value = "角色对象",name = "role") @RequestParam Role role){
//        if (roleid==null||roleid==0||role==null||role.getRid()==null||role.getRname()==null){
//            return ResUtil.getJsonStr(417, "请求参数不正确");
//        }
//        role.setRid(roleid);
//        role.setRcreatetime(new Date());
//        roleService.insert(role);
//        return ResUtil.getSucDes("创建角色成功,roleid:"+roleid);
//    };

//    @GetMapping("${soft_version}/_roles")
//    @ApiOperation(value = "get_All_Roles",tags = "role",notes = "得到所有角色信息")
//    public String getAllRoles(){
//        List<Role> roles = roleService.selectAllRoles();
//        List<ReturningRoleWithprivsgroup> returningRoleWithprivs = new ArrayList<>();
//        for (Role role : roles) {
//            if (role!=null){
//                returningRoleWithprivs.add(new ReturningRoleWithprivsgroup(role,roleService.selectPrivilegesByRid(role.getRid())));
//            }
//        }
//        return JsonUtils.serialize(ResUtil.getJson(ResultCode.OK,"获取所有的角色信息成功",returningRoleWithprivs));
//    }

    @GetMapping("${soft_version}/role/{roleid}/_privs")
    @ApiOperation(value = "get_All_Priv_By_rid",tags = {"role","priv"},notes = "获得对应角色的所有权限")
    public String getAllPrivsByRoleId(@PathVariable("roleid") Integer roleid){
        if (roleid !=null&&roleid!=0){
            List<Metaoperation> metaoperations = roleService.selectPrivilegesByRid(roleid);
            if (!metaoperations.isEmpty()){
                return JsonUtils.serialize(ResUtil.getJson(ResultCode.OK,"获取所有的角色信息成功",metaoperations));
            }else return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST,"此角色不存在");
        }
        return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING,"必要参数不正确");
    }

    @PostMapping("${soft_version}/role")
    @ApiOperation(tags = "role",notes = "新增角色",code = 200, value = "add_Role")
    public String addRole(HttpServletRequest request,
                          HttpServletResponse response) throws IOException {
        //从json中获取username和password
        String body = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
        String rname = null, rdesc = null;
        if(StringUtils.hasText(body)) {
            JSONObject jsonObj = JSON.parseObject(body);
            rname = jsonObj.getString("rname");
            rdesc = jsonObj.getString("rdesc");
        }
        logger.debug("RoleController:addrole   rname : "+rname+"   rdesc : "+rdesc);

        if (rname == null || rname.equals("")) {
            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING,"角色名不能为空");
        }
        if (rdesc == null) {
            rdesc = "";
        }
        Role role = new Role(rname,rdesc,new Date());
        Role role2 = roleService.selectRoleByRoleName(rname);
        if (role2!=null){
            return ResUtil.getJsonStr(ResultCode.COMMIT_RESOURCE_HAD_EXIST,"角色已经存在");
        }
        int insert = roleService.insert(role);
        if (insert==1){
            Role role1 = roleService.selectRoleByRoleName(rname);
            return ResUtil.getJsonStr(ResultCode.OK,"角色创建成功",role1);
        }
        return ResUtil.getJsonStr(ResultCode.COMMIT_RESOURCE_HAD_EXIST,"角色已经存在");
    };


    @PutMapping("${soft_version}/role/{roleid}")
    @ApiOperation(tags = "role",notes = "修改角色信息",value = "update_role")
    public String updateRole(HttpServletRequest request,
                          @PathVariable("roleid") int roleid) throws IOException {
        //从json中获取username和password
        String body = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
        String rname = null, rdesc = null;
        if(StringUtils.hasText(body)) {
            JSONObject jsonObj = JSON.parseObject(body);
            rname = jsonObj.getString("rname");
            rdesc = jsonObj.getString("rdesc");
        }
        logger.debug("RoleController:addrole   rname : "+rname+"   rdesc : "+rdesc);

        if (StringUtils.hasText(rname)){
            if (!StringUtils.hasText(rdesc)) {
                rdesc = "";
                rname="ROLE_"+rname.toUpperCase();
                Role role = new Role(rname,rdesc,null);
                Role role3 = roleService.selectRoleByRoleName(rname);

                if (role3!=null&&role3.getRid()!=roleid){
                    return ResUtil.getJsonStr(ResultCode.COMMIT_RESOURCE_HAD_EXIST,"此角色名已经存在");
                }
                role.setRid(roleid);
                Role role2 = roleService.selectByPrimaryKey(roleid);
                if (role2==null){
                    return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST,"此id的角色不存在");
                }
                int i = roleService.updateRoleByPrimaryKey(roleid, role);
                if (i>=1){
                    Role role1 = roleService.selectByPrimaryKey(roleid);
                    return ResUtil.getJsonStr(ResultCode.OK,"角色修改成功",role1);
                }

            }else{
                rname="ROLE_"+rname.toUpperCase();
                Role role = new Role(rname,rdesc,null);
                Role role3 = roleService.selectRoleByRoleName(rname);

                if (role3!=null&&role3.getRid()!=roleid){
                    return ResUtil.getJsonStr(ResultCode.COMMIT_RESOURCE_HAD_EXIST,"此角色名已经存在");
                }
                role.setRid(roleid);
                Role role2 = roleService.selectByPrimaryKey(roleid);
                if (role2==null){
                    return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST,"此id的角色不存在");
                }
                int i = roleService.updateRoleByPrimaryKey(roleid, role);
                if (i>=1){
                    Role role1 = roleService.selectByPrimaryKey(roleid);
                    return ResUtil.getJsonStr(ResultCode.OK,"角色修改成功",role1);
                }
            }

        }
        if (!StringUtils.hasText(rdesc)) {
            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "请求参数不正确");
        }
        Role role = new Role(null,rdesc,null);



        role.setRid(roleid);
        Role role2 = roleService.selectByPrimaryKey(roleid);
        if (role2==null){
            return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST,"此id的角色不存在");
        }
        int i = roleService.updateRoleByPrimaryKey(roleid, role);
        if (i>=1){
            Role role1 = roleService.selectByPrimaryKey(roleid);
            return ResUtil.getJsonStr(ResultCode.OK,"角色修改成功",role1);
        }
        return ResUtil.getJsonStr(ResultCode.OK,"未对角色进行改动");
    };

    @DeleteMapping("${soft_version}/role/{roleid}")
    @ApiOperation(tags = "role",notes = "删除角色",code = 200, value = "delete_Role")
    public String deleteRole(@ApiParam(name = "roleid",required = true,value = "角色id")@PathVariable Integer roleid){
        if (roleid==null||roleid==0){
            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "请求参数不正确");
        }
        int i = roleService.deleteByPrimaryKey(roleid);
        if (i>=0){
            return ResUtil.getSucDes("删除角色成功,roleid:"+roleid);

        }
        return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST,"没有id为"+roleid+"的角色");
    };

    @GetMapping("${soft_version}/role/{roleid}")
    @ApiOperation(tags = "role",notes = "查询角色",code = 200, value = "select_Role")
    public String getRole(@ApiParam(name = "roleid",required = true,value = "角色id")@PathVariable Integer roleid){
        if (roleid==null||roleid==0){
            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "请求参数不正确");
        }
        Role role = roleService.selectByPrimaryKey(roleid);
        if (role!=null){
            List<Metaoperation> metaoperations = roleService.selectPrivilegesByRid(roleid);
            ReturningRolePriv returningRolePriv = new ReturningRolePriv(role.getRid(),role.getRname(),role.getRdesc(),role.getRcreatetime(),metaoperations);
            return JsonUtils.serialize(ResUtil.getJson(ResultCode.OK, "查询角色成功", returningRolePriv));
        }
        return JsonUtils.serialize(ResUtil.getJson(ResultCode.RESOURCE_NOT_EXIST,"没有id为"+roleid+"的角色"));
    };

    @PostMapping("${soft_version}/role/{roleid}/priv/{privid}")
    @ApiOperation(value = "add_Priv_To_role",tags = {"role","priv"},notes = "为此角色添加权限")
    public String addPrivToRoleId(@PathVariable("roleid") Integer roleid,@PathVariable("privid") Integer privid) {
        if (roleid !=null&&roleid!=0 && privid!=null&&privid!=0){

            // 判断角色是否存在
            Role role = roleService.selectByPrimaryKey(roleid);
            if (role==null){
                return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST,"此角色不存在");
            }
            // 判断权限是否存在
            Metaoperation metaoperation = metaOperationService.selectByPrimaryKey(privid);
            if (metaoperation!=null){

                if(rolePrivService.selectIsExistByRidAndPid(roleid,privid)){
                    return ResUtil.getJsonStr(ResultCode.COMMIT_RESOURCE_HAD_EXIST,"此角色已经具有此权限");
                }

                // 为角色添加权限
                int insert = 0;
                try {
                    insert = rolePrivService.insert(roleid, privid);
                } catch (Exception e) {


                }
                if (insert>=1){
                    return ResUtil.getJsonStr(ResultCode.OK,"为角色添加权限成功" );
                }
                else ResUtil.getJsonStr(ResultCode.BAD_REQUEST,"请求错误");
            }else return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST,"添加的权限不存在");

        }
        return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING,"必要参数不正确");
    }

    @DeleteMapping("${soft_version}/role/{roleid}/priv/{privid}")
    @ApiOperation(value = "delete_Priv_To_role",tags = {"role","priv"},notes = "删除此角色某权限")
    public String deletePrivToRoleId(@PathVariable("roleid") Integer roleid,@PathVariable("privid") Integer privid){
        if (roleid !=null&&roleid!=0 && privid!=null&&privid!=0){
            // 判断角色是否存在
            Role role = roleService.selectByPrimaryKey(roleid);
            if (role==null){
                return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST,"此角色不存在");
            }
            // 判断权限是否存在
            Metaoperation metaoperation = metaOperationService.selectByPrimaryKey(privid);
            if (metaoperation!=null){
                // 为角色添加权限
                int i = rolePrivService.deleteByRidAndPid(roleid, privid);
                if (i>=1){
                    return ResUtil.getJsonStr(ResultCode.OK,"已删除此角色的此项权限");
                }else return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST, "此角色没有此项权限");
            }else return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST,"删除的权限不存在");

        }
        return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING,"必要参数不正确");
    }
    @PostMapping("/${soft_version}/role/{roleid}/batchupdate")
    @ApiOperation(tags = "role",notes = "批量修改角色信息",value = "batch_update_role")
    public String batchUpdateRole(HttpServletRequest request,
                             @PathVariable("roleid") int roleid) throws IOException {
        //从json中获取username和password
        String body = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
        String rids = null;
        if(StringUtils.hasText(body)) {
            JSONObject jsonObj = JSON.parseObject(body);
            rids = jsonObj.getString("rids");
        }
//        logger.debug("RoleController:addrole   rname : "+rname+"   rdesc : "+rdesc);

        System.out.println("\n\n\n\n\n---------------------->>"+rids);
       if (rids==null||rids.isEmpty()){
           return ResUtil.getJsonStr(ResultCode.BAD_REQUEST, "修改权限id不能为空");
       }
        String[] split = rids.split(",");
        for (String s : split) {
            System.out.println("  "+s+" "+Integer.parseInt(s));
        }
        rolePrivService.deleteByRid(roleid);
        for (String s : split) {
            if (Integer.parseInt(s)<10000){

                try{
                    Metaoperation metaoperation1 = metaOperationService.selectByPrimaryKey(Integer.parseInt(s));
                    System.out.println(metaoperation1);;
                    if (metaoperation1!=null){
                        int insert = rolePrivService.insert(roleid, Integer.parseInt(s));
                        System.out.println(insert);
                    }

                }catch (Exception e){
                    return ResUtil.getJsonStr(ResultCode.BAD_REQUEST,"权限修改失败");
                }

            }
        }
        return ResUtil.getJsonStr(ResultCode.OK,"权限修改成功");
    };



}
