package cn.edu.sicnu.cs.pojo;

import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Classname SysUserPojo
 * @Description TODO
 * @Date 2020/11/17 9:15
 * @Created by Huan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPojo implements Serializable {
    private static final long serialVersionUID = -6405984731673512249L;
    private Integer id;

    private String username;

    private String password;

    private Role roleInfo;

    private String ulocked;

    private String deleted;

    private Date ulasttime;

    private List<Metaoperation> operations;

}
