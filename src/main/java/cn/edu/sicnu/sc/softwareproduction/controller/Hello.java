package cn.edu.sicnu.sc.softwareproduction.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname Hello
 * @Description TODO
 * @Date 2020/11/11 13:34
 * @Created by Huan
 */
@RestController
@RequestMapping("/")
@Api(tags = "Hello",value = "你好")
public class Hello {
    @RequestMapping("hello")
    @ApiOperation(value = "helloWorld",notes = "你好,世界!")
    public String helloWorld(){
        return "Hello World!";
    }
}
