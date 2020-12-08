package cn.edu.sicnu.cs.dto;

import cn.edu.sicnu.cs.model.Prigroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Classname ReturningPrivGroupWithPrivsFourLever
 * @Description TODO
 * @Date 2020/11/28 11:17
 * @Created by Huan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrivGroupWithPrivsGradationalDto implements Serializable {
    private static final long serialVersionUID = 4750577246347125419L;
    private Integer id;
    //权限组名称
    private String authName;
    private String path = null;
    private List<PrivGradationalDto> children;

    public PrivGroupWithPrivsGradationalDto(Prigroup prigroup, List<PrivGradationalDto> privs) {
        this.id = prigroup.getPgid();
        this.authName = prigroup.getPrigroupname();
        this.path = prigroup.getPrigroupdesc();
        this.children = privs;
    }

//    public ReturningPrivGroupWithPrivsFourLever(ReturningPrivGroupWithPriv privs) {
//        this.id = privs.getId();
//        this.authName = privs.authName;
//        this.children = privs.getChildren();
//        this.path = privs.getPath();
//    }
}
