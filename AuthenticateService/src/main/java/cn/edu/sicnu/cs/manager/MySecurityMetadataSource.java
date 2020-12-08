package cn.edu.sicnu.cs.manager;

import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.service.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 权限资源管理器
 * 为权限决断器提供支持
 */

@Component
public class MySecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
//    @Resource
//    private MetaOperationService metaOperationServiceImpl;
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private MetaOperationService metaOperationService;

    /**
     * 此方法判定用户请求的url 是否在权限表中，如果在权限表中，则返回给 MyAccessDecisionManager的decide 方法，
     * 如果不在权限表中则放行。
     * @param o
     * @return
     * @throws IllegalArgumentException
     */
    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        Collection<ConfigAttribute> configAttributes=new ArrayList<>();
        //从reids中获取角色与权限数据
        String redisConfigAttributesPermission= stringRedisTemplate.opsForValue().get("configAttributes:permissions");
        if(StringUtils.isBlank(redisConfigAttributesPermission)){
            List<Metaoperation> operations = metaOperationService.selectAll();
            for (Metaoperation operation:operations) {
                ConfigAttribute configAttribute=new SecurityConfig(operation.getMolurl()+" "+operation.getMomethod());
                configAttributes.add(configAttribute);
            }
            //将权限存入redis
            stringRedisTemplate.opsForValue().set("configAttributes:permissions", JSON.toJSONString(operations),480, TimeUnit.MINUTES);
        }else{
            JSONArray array= JSONObject.parseArray(redisConfigAttributesPermission);
            for (int i=0;i<array.size();i++) {
                JSONObject jsonObject=array.getJSONObject(i);
                ConfigAttribute configAttribute=new SecurityConfig(jsonObject.getString("molurl")+" "+jsonObject.getString("momethod"));
                configAttributes.add(configAttribute);
            }
        }

        //Object中包含用户请求request
        String url = ((FilterInvocation) o).getRequestUrl();
        String method=((FilterInvocation) o).getRequest().getMethod();
        String authPath=url+" "+method;//REST风格  根据方法判断权限

        PathMatcher pathMatcher = new AntPathMatcher();

        for (ConfigAttribute configAttribute:configAttributes) {
            if(StringUtils.isNotBlank(configAttribute.getAttribute())&&pathMatcher.match(configAttribute.getAttribute(),authPath)){
                return configAttributes;
            }
        }
        return null;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
