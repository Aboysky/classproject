package cn.edu.sicnu.cs.utils;

import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.service.MetaOperationService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.stereotype.Component;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Classname RedisUtils
 * @Description TODO
 * @Date 2020/11/24 19:47
 * @Created by Huan
 */
@Component
public class RedisUtils {

    @Autowired
    static RedisTemplate redisTemplate;

    @Autowired
    static MetaOperationService metaOperationService;

    public static void delete(String key){
        redisTemplate.delete(key);
    }

    public static void addConfigrationPermissions(){
        Collection<ConfigAttribute> configAttributes=new ArrayList<>();
        List<Metaoperation> operations = metaOperationService.selectAll();
        for (Metaoperation operation:operations) {
            ConfigAttribute configAttribute=new SecurityConfig(operation.getMolurl()+" "+operation.getMomethod());
            configAttributes.add(configAttribute);
        }
        //将权限存入redis
        redisTemplate.opsForValue().set("configAttributes:permissions", JSON.toJSONString(operations),480, TimeUnit.MINUTES);
    }
}
