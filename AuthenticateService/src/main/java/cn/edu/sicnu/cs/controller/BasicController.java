package cn.edu.sicnu.cs.controller;

import cn.edu.sicnu.cs.model.PrigrouprelationKey;
import cn.edu.sicnu.cs.model.User;
import cn.edu.sicnu.cs.service.PriGroupRelationService;
import cn.edu.sicnu.cs.utils.JsonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Classname BasicController
 * @Description TODO
 * @Date 2020/11/15 16:47
 * @Created by Huan
 */
@Controller
@Api(value = "basic operation",description = "基本的登录,退出系统等接口")
public class BasicController {

    @ApiOperation(value = "hello test",notes = "hello world test")
    @GetMapping("hello")
    public String hello(){
        return "Hello world!";
    }

//    @ApiOperation("111")
//    @GetMapping("hello1")
//    @ResponseBody
//    public PrigrouprelationKey hello1(){
//        return new PrigrouprelationKey(1,2);
//    }

//    @ApiOperation(value = "testIsLogin",notes = "测试是否登录")
//    @GetMapping("testlogin")
//    public String testIsLogin(){
//        return JsonUtils.serialize(new Role(1,"admin","admin",new Date(),"1"));
//    }

    @RequestMapping("loginsuccess")
    public String loginsuccess(){
        return "loginsuccess.html";
    }
}
