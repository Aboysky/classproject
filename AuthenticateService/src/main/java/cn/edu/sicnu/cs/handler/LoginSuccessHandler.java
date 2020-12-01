package cn.edu.sicnu.cs.handler;

import cn.edu.sicnu.cs.constant.ResultCode;
import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.User;
import cn.edu.sicnu.cs.pojo.AuthUserDetails;
import cn.edu.sicnu.cs.pojo.RoleInfo;
import cn.edu.sicnu.cs.service.RoleService;
import cn.edu.sicnu.cs.service.UserService;
import cn.edu.sicnu.cs.utils.ResUtil;
import cn.edu.sicnu.cs.utils.ResponseUtil;
import cn.edu.sicnu.cs.utils.TokenUtil;
import com.alibaba.fastjson.JSON;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName LoginSuccessHandlerFilter
 * @Description 登陆认证成功处理过滤器
 * @Author liuheming
 * @Date 2019/5/6 16:27
 * @Version 1.0
 **/
@Component
public class LoginSuccessHandler implements AuthenticationSuccessHandler {
    @Autowired
    private TokenUtil tokenUtil;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;
    /**
     * @Author liuheming
     * @Description 用户认证成功后 生成token并返回
     * @Date 8:50 2019/5/7
     * @Param [request, response, authentication]
     * @return void
     **/
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        AuthUserDetails authUserDetails=(AuthUserDetails)authentication.getPrincipal();//从内存中获取当前认证用户信息
        String userName =authentication.getName();

        //在redis中查询用户之前是否登入
        String oldToken=stringRedisTemplate.opsForValue().get("token_"+userName );
        if(!StringUtils.isBlank(oldToken)){
            //清除旧Token
            stringRedisTemplate.delete("token_"+userName );
        }

        String roleInfosMapPermission=stringRedisTemplate.opsForValue().get("authentication:roleinfos:permissions");


        if(StringUtils.isBlank(roleInfosMapPermission)){
            //将角色与权限关系存入redis
            List<RoleInfo> roleInfos= roleService.selectAllRoleAndMetaoperations();
            stringRedisTemplate.opsForValue().set("authentication:roleinfos:permissions", JSON.toJSONString(roleInfos),480,TimeUnit.MINUTES);
        }

        //创建token
        String accessToken = tokenUtil.createAccessJwtToken(authUserDetails);

        int roleid = authUserDetails.getRoleInfo().getRid();

        //存入redis
        stringRedisTemplate.opsForValue().set("token_"+userName ,accessToken,480,TimeUnit.MINUTES);

        HashMap<String,String> map=new HashMap<>();
        map.put("roleid", String.valueOf(roleid));
        map.put("accessToken",accessToken);
        Map<String,String> menu = new HashMap<>();
        if (roleid!=1){
            map.put("path","/insider");
        }else {
            map.put("path","/user");
        }
        map.put("uid",userService.selectUserByUsername(userName ).getUid().toString());
        map.put("urealname",userService.selectUserByUsername(userName ).getUrealname());

        ResponseUtil.out(response, ResUtil.getJsonStr(ResultCode.OK,"登录成功",map));
    }

}
