package cn.edu.sicnu.cs.controller;

import cn.edu.sicnu.cs.constant.RequestConstant;
import cn.edu.sicnu.cs.constant.ResultCode;
import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Prigroup;
import cn.edu.sicnu.cs.model.Role;
import cn.edu.sicnu.cs.service.MetaOperationService;
import cn.edu.sicnu.cs.service.PriGroupRelationService;
import cn.edu.sicnu.cs.service.PrigroupService;
import cn.edu.sicnu.cs.utils.ResUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @Classname PrivGroupController
 * @Description TODO
 * @Date 2020/11/22 14:51
 * @Created by Huan
 */
@RestController
public class PrivGroupController {

    private static final Logger logger  = LoggerFactory.getLogger(PrivGroupController.class);

    @Autowired
    PrigroupService prigroupService;

    @Autowired
    MetaOperationService metaOperationService;

    @Autowired
    PriGroupRelationService priGroupRelationService;

    @GetMapping("${soft_version}/privgroup/{privgroupid}")
    @ApiOperation(value = "select_privgroup",tags = {"privgroup","select"},notes = "查询权限组详细信息")
    public String selectPrivGroup(@PathVariable("privgroupid") Integer pgid){
        if (pgid!=null&&pgid!=0){
            Prigroup prigroup = prigroupService.selectByPrimaryKey(pgid);
            if (prigroup!=null){
                return ResUtil.getJsonStr(ResultCode.OK,"查询权限组成功",prigroup);
            }
            return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST,"此权限组不存在");
        }
        return ResUtil.getJsonStr(ResultCode.BAD_REQUEST, "请求错误");
    }

    @DeleteMapping("${soft_version}/privgroup/{privgroupid}")
    @ApiOperation(value = "delete_privgroup",tags = {"privgroup","delete"},notes = "删除权限组")
    public String deletePrivGroup(@PathVariable("privgroupid") Integer pgid){
        if (pgid!=null&&pgid!=0){
            Prigroup prigroup = prigroupService.selectByPrimaryKey(pgid);
            if (prigroup!=null){
                int i = prigroupService.deleteByPrimaryKey(pgid);
                if (i>=1){
                    return ResUtil.getJsonStr(ResultCode.OK,"删除权限组成功");
                }
                return ResUtil.getJsonStr(ResultCode.INTERNAL_SERVER_ERROR,"删除权限组失败");
            }
            return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST,"此权限组不存在");
        }
        return ResUtil.getJsonStr(ResultCode.BAD_REQUEST, "请求错误");
    }

    @PostMapping("${soft_version}/privgroup")
    @ApiOperation(value = "add_privgroup",tags = {"privgroup","add"},notes = "添加权限组")
    public String addPrivGroup(HttpServletRequest request) throws IOException {

        String body = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
        String prigroupname = null, prigroupdesc = null;
        if (StringUtils.hasText(body)){
            JSONObject jsonObject = JSON.parseObject(body);
            prigroupname = jsonObject.getString("prigroupname");
            prigroupdesc = jsonObject.getString("prigroupdesc");
        }
        if (StringUtils.hasText(prigroupname)){
            if (prigroupdesc.isEmpty()){
                prigroupdesc="";
            }
            Prigroup prigroup = new Prigroup(prigroupname,prigroupdesc);
            int insert = prigroupService.insert(prigroup);
            if (insert>=1){
                Prigroup prigroup1 = prigroupService.selectByPrivName(prigroupname);
                return ResUtil.getJsonStr(ResultCode.OK,"添加权限组成功",prigroup1);
            }
        }
        return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING,"必要参数不正确");

    }

    @PutMapping("${soft_version}/privgroup/{privgroupid}")
    @ApiOperation(value = "update_privgroup",tags = {"privgroup","update"},notes = "修改权限组信息")
    public String updatePrivGroup(HttpServletRequest request,@PathVariable("privgroupid") Integer privgroupid) throws IOException {

        String body = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
        String prigroupname = null, prigroupdesc = null;
        if (StringUtils.hasText(body)){
            JSONObject jsonObject = JSON.parseObject(body);
            prigroupname = jsonObject.getString("prigroupname");
            prigroupdesc = jsonObject.getString("prigroupdesc");
        }
        if (StringUtils.hasText(prigroupname)||StringUtils.hasText(prigroupdesc)){
            Prigroup prigroup = new Prigroup();
            prigroup.setPrigroupdesc(prigroupdesc);
            prigroup.setPrigroupname(prigroupname);
            prigroup.setPgid(privgroupid);
            if (StringUtils.hasText(prigroupname)&&prigroupService.selectByPrivName(prigroupname)!=null){
                return ResUtil.getJsonStr(ResultCode.COMMIT_RESOURCE_HAD_EXIST,"此权限组名已经存在");
            }
            int insert = prigroupService.updateByPrimaryKey(prigroup);
            if (insert>=1){
                Prigroup prigroup1 = prigroupService.selectByPrivName(prigroupname);
                return ResUtil.getJsonStr(ResultCode.OK,"成功修改权限组信息",prigroup1);
            }
        }
        return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING,"请求参数不能为空");

    }

    @PostMapping("${soft_version}/privgroup/{privgroupid}/priv/{privid}")
    @ApiOperation(value = "add_priv_to_privgroup",tags = {"privgroup","add","priv"},notes = "给权限组添加某权限")
    public String addPrivToPrivGroup(@PathVariable("privgroupid") Integer privgroupid,
                                     @PathVariable("privid") Integer privid) throws IOException {
        if (privgroupid != null && privgroupid != 0 && privid != null && privid != 0) {

            // 判断角色是否存在
            Prigroup prigroup = prigroupService.selectByPrimaryKey(privgroupid);
            if (prigroup == null) {
                return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST, "此权限组不存在");
            }
            // 判断权限是否存在
            Metaoperation metaoperation = metaOperationService.selectByPrimaryKey(privid);
            if (metaoperation != null) {
                if(priGroupRelationService.selectIsExistByPidAndPriGroupId(privid, privgroupid)){
                    return ResUtil.getJsonStr(ResultCode.COMMIT_RESOURCE_HAD_EXIST, "此权限组已经拥有此权限");
                }

                int insert = priGroupRelationService.insert(privgroupid, privid);
                if (insert >= 1) {
                    return ResUtil.getJsonStr(ResultCode.OK, "给权限组添加权限成功");
                } else ResUtil.getJsonStr(ResultCode.INTERNAL_SERVER_ERROR, "请求错误");
            } else return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST, "添加的权限不存在");

//            return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST, "此角色不存在");
        }
        return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "必要参数不正确");
    }

    @DeleteMapping("${soft_version}/privgroup/{privgroupid}/priv/{privid}")
    @ApiOperation(value = "add_priv_to_privgroup",tags = {"privgroup","delete","priv"},notes = "将某权限从某权限组组中删除")
    public String deletePrivToPrivGroup(@PathVariable("privgroupid") Integer privgroupid,
                                     @PathVariable("privid") Integer privid) throws IOException {
        if (privgroupid != null && privgroupid != 0 && privid != null && privid != 0) {

            // 判断权限组是否存在
            Prigroup prigroup = prigroupService.selectByPrimaryKey(privgroupid);
            if (prigroup == null) {
                return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST, "此权限组不存在");
            }
            // 判断权限是否存在
            if (priGroupRelationService.selectIsExistByPidAndPriGroupId(privid, privgroupid)) {
                // 为角色添加权限
                int i = priGroupRelationService.deleteByPrimaryKey(privid, privgroupid);
                if (i >= 1) {
                    return ResUtil.getJsonStr(ResultCode.OK, "将某权限从某权限组组中删除成功");
                } else ResUtil.getJsonStr(ResultCode.INTERNAL_SERVER_ERROR, "请求错误");
            } else return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST, "此权限组中没有此权限");

//            return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST, "此角色不存在");
        }
        return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "必要参数不正确");
    }


    @GetMapping("${soft_version}/privgroup/{privgroupid}/_privs")
    @ApiOperation(value = "get_privs_And_privgroup",tags = {"privgroup","select","priv","all"},notes = "查询角色组所拥有的权限集合")
    public String selectPrivsFromPrivGroup(@PathVariable("privgroupid") Integer privgroupid) throws IOException {
        if (privgroupid != null && privgroupid != 0) {

            // 判断角色组是否存在
            Prigroup prigroup = prigroupService.selectByPrimaryKey(privgroupid);
            if (prigroup == null) {
                return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST, "此权限组不存在");
            }
            List<Metaoperation> metaoperations = prigroupService.selectPrivilegesByPrimaryKey(privgroupid);

            return ResUtil.getJsonStr(ResultCode.OK,"查询权限组所有权限成功",metaoperations);

        }
        return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_NOT_NULL_OR_NOTIING, "必要参数不正确");
    }


}
