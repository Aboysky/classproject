package cn.edu.sicnu.cs.controller;



import cn.edu.sicnu.cs.model.User;
import cn.edu.sicnu.cs.service.JwtService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname JwtController
 * @Description TODO
 * @Date 2020/11/15 12:21
 * @Created by Huan
 */
@RestController
@Api(tags = "JWT",description = "Jwt认证相关接口")
public class JwtController {

    private final Logger logger = LoggerFactory.getLogger(JwtController.class);

    @Autowired
    JwtService jwtService;

    @ApiOperation(value = "authenticate api",notes = "jwt认证接口",httpMethod = "POST")
    @PostMapping("authenticate")
    public String  authentication(@RequestBody User user){

        logger.info("==============>>>username = "+user.getUsername());
        logger.info("==============>>>username = "+user.getPassword());

        if (StringUtils.isNotEmpty(user.getUsername()) && StringUtils.isNotEmpty(user.getPassword())){
            return jwtService.login(user.getUsername(), user.getPassword());
        }
        return "密码错误";
    }


//    @RequestMapping(value = "/refreshtoken")
//    public AjaxResponse refresh(@RequestHeader("${jwt.header}") String token){
//        return AjaxResponse.success(jwtService.(token));
//    }
@RequestMapping("hello")
public String  hello(){

    return "Hello";

}
}
