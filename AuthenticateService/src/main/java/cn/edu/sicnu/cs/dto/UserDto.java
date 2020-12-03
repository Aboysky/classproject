package cn.edu.sicnu.cs.dto;

import cn.edu.sicnu.cs.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Classname ReturningUser
 * @Description TODO
 * @Date 2020/11/23 18:03
 * @Created by Huan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable {
    private static final long serialVersionUID = -6157793221485871880L;
    private Integer uid;

    private Integer ucompanyId;

    private String username;

    private String password;

    private Integer uroleId;

    private String urealname;

    private String ugender;

    private String email;

    private String mobile;

    private Date ujoin;

    private Integer uvisits;

    private String uip;

    private Date ulasttime;

    private String ulocked;

    private String udeleted;

    private String role_name;

    public UserDto(User user, String roledesc) {
        this.uid = user.getUid();
        this.ucompanyId = user.getUcompanyId();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.uroleId = user.getUroleId();
        this.urealname = user.getUrealname();
        this.ugender = user.getUgender();
        this.email = user.getUemail();
        this.mobile = user.getUmobile();
        this.ujoin = user.getUjoin();
        this.uvisits = user.getUvisits();
        this.uip = user.getUip();
        this.ulasttime = user.getUlasttime();
        this.ulocked = user.getUlocked();
        this.udeleted = user.getUdeleted();
        this.role_name=roledesc;
    }
}
