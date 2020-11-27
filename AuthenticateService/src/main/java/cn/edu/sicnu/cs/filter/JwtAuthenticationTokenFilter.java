package cn.edu.sicnu.cs.filter;

/**
 * @Classname JwtAuthenticationTokenFilter
 * @Description TODO
 * @Date 2020/11/16 22:06
 * @Created by Huan
 */
import cn.edu.sicnu.cs.service.impl.UserDetailsServiceImpl;
import cn.edu.sicnu.cs.utils.JwtTokenUtil;
import cn.edu.sicnu.cs.utils.SpringUtil;
import io.netty.util.concurrent.BlockingOperationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

    private final static Logger logger = LoggerFactory.getLogger(JwtAuthenticationTokenFilter.class);

    @Autowired
    SpringUtil springUtil;

    @Resource
    JwtTokenUtil jwtTokenUtil ;

    @Autowired
    UserDetailsServiceImpl userDetailsService;

    public static JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter;

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain)
            throws ServletException, IOException {

        if (logger.isDebugEnabled()){
            logger.debug("JwtAuthenticationTokenFilter 拦截了 "+request.getRequestURI());
        }

        String jwtToken = request.getHeader(jwtTokenUtil.getTokenHead());

        if (logger.isDebugEnabled()){
            logger.debug("JwtAuthenticationTokenFilter  jwtToken =  "+jwtToken);
        }

        if(!StringUtils.isEmpty(jwtToken)){
            String username = jwtTokenUtil.getUserNameFromToken(jwtToken);
            if(username != null &&
                    SecurityContextHolder.getContext().getAuthentication() == null){
                UserDetails userDetails = userDetailsService.loadUserByUsername(username);
                if(jwtTokenUtil.validateToken(jwtToken,userDetails)){
                    //给使用该JWT令牌的用户进行授权
                    UsernamePasswordAuthenticationToken authenticationToken
                            = new UsernamePasswordAuthenticationToken(username,null,userDetails.getAuthorities());
                    SecurityContextHolder.getContext().setAuthentication(authenticationToken);

                    if (logger.isDebugEnabled()){
                        logger.debug("JwtAuthenticationTokenFilter 由token得到了authentication,并且将authentication放入了Security容器 authentication:  "+authenticationToken);
                    }

                }
            }
        }
        if (logger.isDebugEnabled()){
            logger.debug("JwtAuthenticationTokenFilter 放行了 "+request.getRequestURI());
        }
        filterChain.doFilter(request,response);
    }
}