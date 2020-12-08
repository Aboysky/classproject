package cn.edu.sicnu.cs.controller;

import cn.edu.sicnu.cs.anotations.Log;
import cn.edu.sicnu.cs.pojo.engineer;
import cn.edu.sicnu.cs.service.EngineerManagerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname EngineerManagerController
 * @Description TODO
 * @Date 2020/11/19 13:54
 * @Created by Songyz
 */
@Controller
@RequestMapping("/engmanager")
@Api(tags = "EngineerManager",value = "工程师管理员")
public class EngineerManagerController {

    @Resource
    EngineerManagerService engineerManagerService;


    @PostMapping("/index")
    @ApiOperation(value = "GetIndex",notes = "界面数据")
    @ResponseBody
    @Log("获取工程师管理员数据")
    public List<engineer> GetIndex(){
        return engineerManagerService.FindEngineer();
    }

    @PostMapping("/index/add")
    @ApiOperation(value = "AddEngineer",notes = "添加工程师")
    @ResponseBody
    @Log("添加工程师")
    public String AddEngineer(String username){
        engineerManagerService.updateRoleByEngManager(username,"工程师");
        return username;
    }

    @PostMapping("/index/setrole")
    @ApiOperation(value = "SetRole",notes = "改变工程师职务")
    @ResponseBody
    @Log("改变工程师职务")
    public int SetRole(String username,String rolename){
        return 1;
    }
}
