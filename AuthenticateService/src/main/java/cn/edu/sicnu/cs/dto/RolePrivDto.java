package cn.edu.sicnu.cs.dto;

import cn.edu.sicnu.cs.model.Metaoperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Classname ReturningRolePriv
 * @Description TODO
 * @Date 2020/11/23 15:59
 * @Created by Huan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RolePrivDto implements Serializable {
    private static final long serialVersionUID = 7566798501089359991L;
    private Integer rid;

    private String rname;

    private String rdesc;

    private Date rcreatetime;

    private List<Metaoperation> children;
}
