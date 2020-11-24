package cn.edu.sicnu.cs.utils;

import cn.edu.sicnu.cs.constant.SecurityConstant;
import cn.edu.sicnu.cs.pojo.AuthUserDetails;
import cn.edu.sicnu.cs.pojo.Scopes;
import com.alibaba.fastjson.JSON;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

/**
 *
 */
@Component
public class TokenUtil {
    /**
     * 根据传入的用户认证详细对象创建一个对应的token
     * @param authUserDetails 认证用户详细对象
     * @return 对应token的String类型
     */
    public String createAccessJwtToken(AuthUserDetails authUserDetails) {
        if (StringUtils.isBlank(authUserDetails.getUsername())) {
            throw new IllegalArgumentException("用户名为空无法创建token");
        }

        Claims claims = Jwts.claims().setSubject(authUserDetails.getUsername());

        //存入角色信息
        List<String> rolename=new ArrayList<>();
        Collection<? extends GrantedAuthority> authorities = authUserDetails.getAuthorities();
        rolename.add(authUserDetails.getRoleInfo().getRname());

        claims.put(SecurityConstant.AUTHORITIES, JSON.toJSONString(rolename));

        LocalDateTime currentTime = LocalDateTime.now();

        String token = Jwts.builder()
                .setClaims(claims)
                .setIssuer(SecurityConstant.tokenIssuer)
                .setIssuedAt(Date.from(currentTime.atZone(ZoneId.systemDefault()).toInstant()))
                .setExpiration(Date.from(currentTime
                        .plusMinutes(SecurityConstant.tokenExpirationTime)
                        .atZone(ZoneId.systemDefault()).toInstant()))
                .signWith(SignatureAlgorithm.HS512, SecurityConstant.tokenSigningKey)
                .compact();

        return token;
    }

    /**
     * 刷新token
     * @param authUserDetails 认证对象
     * @return 刷新token字符串
     */
    public String createRefreshToken(AuthUserDetails authUserDetails) {
        if (StringUtils.isBlank(authUserDetails.getUsername())) {
            throw new IllegalArgumentException("用户名为空无法创建token");
        }

        LocalDateTime currentTime = LocalDateTime.now();

        Claims claims = Jwts.claims().setSubject(authUserDetails.getUsername());
        claims.put(SecurityConstant.AUTHORITIES, Arrays.asList(Scopes.REFRESH_TOKEN.authority()));

        String token = Jwts.builder()
                .setClaims(claims)
                .setIssuer(SecurityConstant.tokenIssuer)
                .setId(UUID.randomUUID().toString())
                .setIssuedAt(Date.from(currentTime.atZone(ZoneId.systemDefault()).toInstant()))
                .setExpiration(Date.from(currentTime
                        .plusMinutes(SecurityConstant.refreshTokenExpTime)
                        .atZone(ZoneId.systemDefault()).toInstant()))
                .signWith(SignatureAlgorithm.HS512, SecurityConstant.tokenSigningKey)
                .compact();

        return token;
    }

}
