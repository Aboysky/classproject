package cn.edu.sicnu.cs.pojo;

import cn.edu.sicnu.cs.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname ReturningRoleWithprivgroupFourLever
 * @Description TODO
 * @Date 2020/11/28 11:20
 * @Created by Huan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReturningRoleWithprivgroupFourLever implements Serializable {
    private static final long serialVersionUID = -2416449720189466115L;
    private Integer id;

    private String roleName;

    private String roleDesc;

    private List<ReturningPrivGroupWithPrivsFourLever> children;

    public ReturningRoleWithprivgroupFourLever(Role role, List<ReturningPrivGroupWithPrivsFourLever> privsgroups){
        this.id = role.getRid();
        this.roleName = role.getRname();
        this.roleDesc = role.getRdesc();
        this.children = privsgroups;
    }

}
