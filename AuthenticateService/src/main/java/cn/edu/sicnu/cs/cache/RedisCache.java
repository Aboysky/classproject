package cn.edu.sicnu.cs.cache;

import cn.edu.sicnu.cs.utils.SpringUtil;
import org.apache.ibatis.cache.Cache;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @Classname RedisCache
 * @Description TODO
 * @Date 2020/11/20 8:54
 * @Created by Huan
 */
public class RedisCache implements Cache {
    private final String id;


    public RedisCache(String id) {
        this.id = id;
    }


    @Override
    public String getId() {
        return id;
    }

    @Override
    public void putObject(Object o, Object o1) {
        RedisTemplate redisTemplate = this.getRedisTemplate();
        redisTemplate.opsForHash().put(this.id, o.toString(), o1);
    }

    @Override
    public Object getObject(Object o) {
        RedisTemplate redisTemplate = this.getRedisTemplate();
        return redisTemplate.opsForHash().get(id, o.toString());
    }

    @Override
    public Object removeObject(Object o) {
        return null;
    }

    @Override
    public void clear() {
        RedisTemplate redisTemplate = this.getRedisTemplate();
        redisTemplate.delete(getId());
        redisTemplate.delete("configAttributes:*");
    }

    @Override
    public int getSize() {
        return 0;
    }

    private RedisTemplate getRedisTemplate(){
        RedisTemplate redisTemplate;
        redisTemplate = (RedisTemplate) SpringUtil.getBean("redisTemplate");
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        return redisTemplate;
    }
}
