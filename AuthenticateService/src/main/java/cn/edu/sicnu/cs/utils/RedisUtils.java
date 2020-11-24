package cn.edu.sicnu.cs.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.security.PublicKey;

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

    public static void delete(String key){
        redisTemplate.delete(key);
    }
}
