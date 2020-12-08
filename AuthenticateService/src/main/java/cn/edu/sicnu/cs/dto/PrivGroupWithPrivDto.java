package cn.edu.sicnu.cs.dto;

import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Prigroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Huan
 * @Classname ReturingPrivGroupWithPriv
 * @Description TODO
 * @Date 2020/11/24 11:21
 * @Created by Huan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrivGroupWithPrivDto implements Serializable {
    private static final long serialVersionUID = -6934241902874535978L;
    private Integer id;
    //权限组名称
    private String authName;
    private String path = null;
    private List<PrivDto> children = new ArrayList<>();

    public PrivGroupWithPrivDto(Prigroup prigroup, List<Metaoperation> privs) {
        this.id = prigroup.getPgid();
        this.authName = prigroup.getPrigroupname();
        this.path = null;
        for (Metaoperation priv : privs) {
            if (priv != null) {
                children.add(new PrivDto(priv));
            }
        }
    }

    public PrivGroupWithPrivDto(PrivGroupWithPrivDto privs) {
        this.id = privs.getId();
        this.authName = privs.authName;
        this.children = privs.getChildren();
        this.path = privs.getPath();
    }
}
