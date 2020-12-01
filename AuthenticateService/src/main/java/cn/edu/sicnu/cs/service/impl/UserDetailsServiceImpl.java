package cn.edu.sicnu.cs.service.impl;

import cn.edu.sicnu.cs.pojo.AuthUserDetails;
import cn.edu.sicnu.cs.pojo.UserPojo;
import cn.edu.sicnu.cs.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import springfox.documentation.annotations.Cacheable;

/**
 * @Classname UserDetailsServiceImpl
 * @Description TODO
 * @Date 2020/11/19 23:33
 * @Created by Huan
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    //登入重试时间
    @Value("${security.loginAfterTime}")
    private Integer loginAfterTime;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private UserService userService;

    @Override
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
//    @Cacheable()
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String flagKey = "loginFailFlag:"+username;
        String value = redisTemplate.opsForValue().get(flagKey);
        if(StringUtils.isNotBlank(value)){
            //超过限制次数
            throw new UsernameNotFoundException("登录错误次数超过限制，请"+loginAfterTime+"分钟后再试");
        }

        if (logger.isDebugEnabled()){
            logger.debug("UserDetailsServiceImpl 开始执行查询数据库");
            logger.debug("查询用户的用户名为:"+username);
        }

        //查询用户信息
        UserPojo authUserPoJo= userService.selectUserPojoByUsername(username);

        logger.debug(username+"尝试登录"+authUserPoJo);

        if(null==authUserPoJo){
            throw new UsernameNotFoundException("当前用户不存在");
        }
        if(authUserPoJo.getRoleInfo()==null){
            throw new UsernameNotFoundException("当前用户无角色");
        }
        return new AuthUserDetails(authUserPoJo);
    }
}
