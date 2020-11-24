package cn.edu.sicnu.cs.pojo;

import cn.edu.sicnu.cs.model.Metaoperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class ReturningRolePriv {
    private Integer rid;

    private String rname;

    private String rdesc;

    private Date rcreatetime;

    private List<Metaoperation> children;
}
