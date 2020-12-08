package cn.edu.sicnu.cs.dto;

import cn.edu.sicnu.cs.model.Metaoperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Classname ReturningPriv
 * @Description TODO
 * @Date 2020/11/24 10:46
 * @Created by Huan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrivDto implements Serializable {
    private static final long serialVersionUID = -2177230972627419732L;
    private Integer id;
    private String authName;
    private String path;

    public PrivDto(Metaoperation metaoperation){
        this.id = metaoperation.getMoid();
        this.authName = metaoperation.getMoname();
        this.path = metaoperation.getMolurl();
    }
}
