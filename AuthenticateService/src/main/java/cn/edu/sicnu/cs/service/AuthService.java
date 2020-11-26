package cn.edu.sicnu.cs.service;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @Classname AuthService
 * @Description TODO
 * @Date 2020/11/26 9:44
 * @Created by Huan
 */
public interface AuthService {
    public String login(String username,String password);
}
