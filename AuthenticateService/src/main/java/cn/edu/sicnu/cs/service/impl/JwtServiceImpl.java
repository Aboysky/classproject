package cn.edu.sicnu.cs.service.impl;


import cn.edu.sicnu.cs.service.AuthService;
import cn.edu.sicnu.cs.utils.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Classname JwtService
 * @Description TODO
 * @Date 2020/11/15 13:29
 * @Created by Huan
 */
@Service
public class JwtServiceImpl implements AuthService {
    private final Logger logger = LoggerFactory.getLogger(JwtServiceImpl.class);

    @Resource
    AuthenticationManager authenticationManager;

    @Resource
    UserDetailsService userService;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public String login(String username,String password){
        try {
            UsernamePasswordAuthenticationToken upToken =
                    new UsernamePasswordAuthenticationToken(username, password);
            Authentication authentication = authenticationManager.authenticate(upToken);
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }catch (AuthenticationException e){
            logger.info("==============>>>用户名或者密码错误");
        }

        UserDetails userDetails = userService.loadUserByUsername(username);
        return jwtTokenUtil.generateToken(userDetails);
    }

}
