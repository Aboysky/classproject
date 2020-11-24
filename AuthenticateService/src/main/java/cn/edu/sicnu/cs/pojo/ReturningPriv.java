package cn.edu.sicnu.cs.pojo;

import cn.edu.sicnu.cs.model.Metaoperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname ReturningPriv
 * @Description TODO
 * @Date 2020/11/24 10:46
 * @Created by Huan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReturningPriv {
    private Integer id;
    private String authName;
    private String path;

    public ReturningPriv(Metaoperation metaoperation){
        this.id = metaoperation.getMoid();
        this.authName = metaoperation.getMoname();
        this.path = metaoperation.getMolurl();
    }
}
