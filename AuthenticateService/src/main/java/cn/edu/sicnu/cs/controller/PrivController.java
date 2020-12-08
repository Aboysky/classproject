package cn.edu.sicnu.cs.controller;

import cn.edu.sicnu.cs.constant.RequestConstant;
import cn.edu.sicnu.cs.constant.ResultCode;
import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Role;
import cn.edu.sicnu.cs.service.MetaOperationService;
import cn.edu.sicnu.cs.service.RolePrivService;
import cn.edu.sicnu.cs.utils.JsonUtils;
import cn.edu.sicnu.cs.utils.ResUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;

/**
 * @Classname PrivController
 * @Description TODO
 * @Date 2020/11/22 0:38
 * @Created by Huan
 */
@RestController
public class PrivController {

    private final static Logger logger = LoggerFactory.getLogger(PrivController.class);

    @Autowired
    MetaOperationService metaOperationService;

    @Autowired
    RolePrivService rolePrivService;

    @GetMapping("${soft_version}/_privs")
    public String getAllPrivs(@RequestParam("group") String isGroup){
        if (isGroup!=null&&isGroup.toLowerCase().equals("true")){
            return getAllPrivsByGroup();
        }
        List<Metaoperation> metaoperations = metaOperationService.selectAll();
        return JsonUtils.serialize(ResUtil.getJson(ResultCode.OK,"成功拿到所有权限信息", metaoperations));
    }

    public String getAllPrivsByGroup(){
        List<Metaoperation> metaoperations = metaOperationService.selectAll();
        return JsonUtils.serialize(ResUtil.getJson(ResultCode.OK,"成功拿到所有权限信息", metaoperations));
    }

    @PostMapping("${soft_version}/priv")
    @ApiOperation(value = "add_Priv",notes = "新增权限",tags = {"priv"})
    public String addPriv(HttpServletRequest request) throws IOException {
        //从json中获取username和password
        String body = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
        String moname = null, modesc = null,molurl = null,momethod = null;
        if(StringUtils.hasText(body)) {
            JSONObject jsonObj = JSON.parseObject(body);
            moname = jsonObj.getString("moname");
            modesc = jsonObj.getString("modesc");
            molurl = jsonObj.getString("molurl");
            momethod = jsonObj.getString("momethod");
        }
        logger.debug("RoleController:addrole   moname : "+moname+"   modesc : "+modesc+"molurl : "+molurl+"   momethod : "+momethod);

        if (moname == null || molurl == null || molurl.equals("")|| moname.equals("")) {
            return ResUtil.getJsonStr(ResultCode.COMMIT_RESOURCE_HAD_EXIST,"权限必要参数不能为空");
        }
        if (!RequestConstant.isLegalHttpMethod(momethod)){
            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_TYPE_OR_FORMAT_ERROR,"权限方法不合法");
        }

        if (modesc == null) {
            modesc = "";
        }

        Metaoperation metaoperation = new Metaoperation(moname,molurl,momethod,modesc);
        Metaoperation metaoperation1 = metaOperationService.selectByOperationName(moname);
        if (metaoperation1!=null){
            return ResUtil.getJsonStr(ResultCode.COMMIT_RESOURCE_HAD_EXIST,"此权限名已经存在");
        }
        int insert = metaOperationService.insert(metaoperation);
        if (insert>=1){
            Metaoperation metaoperation2 = metaOperationService.selectByOperationName(moname);
            return ResUtil.getJsonStr(ResultCode.OK,"权限创建成功",metaoperation2);
        }
        return ResUtil.getJsonStr(ResultCode.BAD_REQUEST,"权限创建失败");
    }

    @GetMapping("${soft_version}/priv/{privid}")
    @ApiOperation(value = "get_Priv",notes = "获取对应权限信息",tags = {"priv"})
    public String getPriv(HttpServletRequest request, @PathVariable("privid") int privid) throws IOException {

        Metaoperation metaoperation1 = metaOperationService.selectByPrimaryKey(privid);
        if (metaoperation1==null){
            return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST,"此权限不存在");
        }
        return JsonUtils.serialize(ResUtil.getJson(ResultCode.OK,"获取权限成功",metaoperation1));
    }

    @PutMapping("${soft_version}/priv/{privid}")
    @ApiOperation(value = "update_Priv",notes = "更新对应权限信息",tags = {"priv"})
    public String updatePriv(HttpServletRequest request,@PathVariable("privid")int privid) throws IOException {
        //从json中获取username和password
        String body = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
        String moname = null, modesc = null,molurl = null,momethod = null;
        if(StringUtils.hasText(body)) {
            JSONObject jsonObj = JSON.parseObject(body);
            moname = jsonObj.getString("moname");
            modesc = jsonObj.getString("modesc");
            molurl = jsonObj.getString("molurl");
            momethod = jsonObj.getString("momethod");
        }
        logger.debug("RoleController:addrole   moname : "+moname+"   modesc : "+modesc+"molurl : "+molurl+"   momethod : "+momethod);

        if (moname == null || molurl == null || molurl.equals("")|| moname.equals("")) {
            return ResUtil.getJsonStr(ResultCode.COMMIT_RESOURCE_HAD_EXIST,"权限必要参数不能为空");
        }
        if (!RequestConstant.isLegalHttpMethod(momethod)){
            return ResUtil.getJsonStr(ResultCode.NECESSARY_PARAMETER_TYPE_OR_FORMAT_ERROR,"权限方法不合法");
        }

        if (modesc == null) {
            modesc = "";
        }

        Metaoperation metaoperation3 = metaOperationService.selectByOperationName(moname);
        if (metaoperation3!=null&&metaoperation3.getMoid()!=privid){
            return ResUtil.getJsonStr(ResultCode.COMMIT_RESOURCE_HAD_EXIST,"此权限名已经存在");
        }

        Metaoperation metaoperation = new Metaoperation(moname,molurl,momethod,modesc);
        Metaoperation metaoperation1 = metaOperationService.selectByPrimaryKey(privid);
        if (metaoperation1==null){
            return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST,"需要更改的权限不存在");
        }
        metaoperation.setMoid(metaoperation1.getMoid());
        int update = metaOperationService.updateByPrimaryKey(metaoperation);
        if (update>=1){
            Metaoperation metaoperation2 = metaOperationService.selectByOperationName(moname);
            return ResUtil.getJsonStr(ResultCode.OK,"权限更新成功",metaoperation2);
        }
        return ResUtil.getJsonStr(ResultCode.BAD_REQUEST,"权限更新失败");
    }

    @DeleteMapping("${soft_version}/priv/{privid}")
    @ApiOperation(value = "delete_Priv",notes = "删除对应权限",tags = {"priv"})
    public String deletePriv(HttpServletRequest request, @PathVariable("privid") int privid) throws IOException {

        Metaoperation metaoperation1 = metaOperationService.selectByPrimaryKey(privid);
        if (metaoperation1==null){
            return ResUtil.getJsonStr(ResultCode.RESOURCE_NOT_EXIST,"此权限不存在");
        }
        int i = metaOperationService.deleteByPrimaryKey(privid);
        int i1 = rolePrivService.deleteByPid(privid);
        if (i>=0){
            return ResUtil.getJsonStr(ResultCode.OK,"删除权限成功");
        }
        return ResUtil.getJsonStr(ResultCode.BAD_REQUEST,"删除权限失败");
    }

}
