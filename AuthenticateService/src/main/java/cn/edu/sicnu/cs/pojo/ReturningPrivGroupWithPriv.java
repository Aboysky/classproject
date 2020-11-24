package cn.edu.sicnu.cs.pojo;

import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Prigroup;
import cn.edu.sicnu.cs.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname ReturingPrivGroupWithPriv
 * @Description TODO
 * @Date 2020/11/24 11:21
 * @Created by Huan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturningPrivGroupWithPriv {
    private Integer id;
    //权限组名称
    private String authName;
    private String path = null;
    private List<ReturningPriv> children = new ArrayList<>();

    public ReturningPrivGroupWithPriv(Prigroup prigroup, List<Metaoperation> privs) {
        this.id = prigroup.getPgid();
        this.authName = prigroup.getPrigroupname();
        this.path = null;
        for (Metaoperation priv : privs) {
            if (priv != null) {
                children.add(new ReturningPriv(priv));
            }
        }
    }

    public ReturningPrivGroupWithPriv(ReturningPrivGroupWithPriv privs) {
        this.id = privs.getId();
        this.authName = privs.authName;
        this.children = privs.getChildren();
        this.path = privs.getPath();
    }
}
