package cn.edu.sicnu.cs.constant;

/**
 * @Classname SecurityConstant
 * @Description TODO
 * @Date 2020/11/16 21:48
 * @Created by Huan
 */
public interface SecurityConstant {
    /**
     * token参数头
     */
    String HEADER = "Authorization";

    /**
     * token分割
     */
    String TOKEN_SPLIT = "Bearer ";

    /**
     * token中自定义权限标识
     */
    String AUTHORITIES = "rolename";
    /**
     * token失效时间
     */
    Integer tokenExpirationTime = 360;

    /**
     * Token 发行人
     */
    String tokenIssuer = "huan";

    /**
     * JWT签名加密key
     */
    String tokenSigningKey = "cn.edu.sicnu.cs.AuthenticateService";

    /**
     * 刷新Token时间
     */
    Integer refreshTokenExpTime = 720;

}
