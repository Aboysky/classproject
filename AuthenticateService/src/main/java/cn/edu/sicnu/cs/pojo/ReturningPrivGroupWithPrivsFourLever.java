package cn.edu.sicnu.cs.pojo;

import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Prigroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
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
public class ReturningPrivGroupWithPrivsFourLever {
    private Integer id;
    //权限组名称
    private String authName;
    private String path = null;
    private List<ReturningPrivFourLevel> children;

    public ReturningPrivGroupWithPrivsFourLever(Prigroup prigroup, List<ReturningPrivFourLevel> privs) {
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
