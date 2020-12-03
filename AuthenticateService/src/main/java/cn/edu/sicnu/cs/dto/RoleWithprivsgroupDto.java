package cn.edu.sicnu.cs.dto;

import cn.edu.sicnu.cs.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname ReturningRoleWithprivs
 * @Description TODO
 * @Date 2020/11/24 10:44
 * @Created by Huan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleWithprivsgroupDto implements Serializable {
    private static final long serialVersionUID = -2600949807066118157L;
    private Integer id;

    private String roleName;

    private String roleDesc;

    private List<PrivGroupWithPrivDto> children = new ArrayList<>();

    public RoleWithprivsgroupDto(Role role, List<PrivGroupWithPrivDto> privsgroups){
        this.id = role.getRid();
        this.roleName = role.getRname();
        this.roleDesc = role.getRdesc();
        for (PrivGroupWithPrivDto priv : privsgroups) {
            if (priv!=null){
                children.add(new PrivGroupWithPrivDto(priv));
            }
        }
    }
}
