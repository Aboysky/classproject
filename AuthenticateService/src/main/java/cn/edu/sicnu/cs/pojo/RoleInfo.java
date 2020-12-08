package cn.edu.sicnu.cs.pojo;

import cn.edu.sicnu.cs.model.Metaoperation;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Classname RoleInfo
 * @Description TODO
 * @Date 2020/11/19 22:59
 * @Created by Huan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleInfo  implements Serializable {
    private static final long serialVersionUID = -2557790578970486891L;
    // 角色id
    private int id;
    private String roleName;
    private List<Metaoperation> permissions;

}
