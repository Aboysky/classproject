package cn.edu.sicnu.cs.pojo;

import cn.edu.sicnu.cs.model.Metaoperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname ReturningPrivFourLevel
 * @Description TODO
 * @Date 2020/11/28 9:08
 * @Created by Huan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReturningPrivFourLevel implements Serializable {
    private static final long serialVersionUID = -3747710663124700178L;
    private Integer id;
    private String authName;
    private String path;
    private List<ReturningPriv> children = new ArrayList<>();

    public ReturningPrivFourLevel(Metaoperation metaoperation){
        this.id = metaoperation.getMoid();
        this.authName = metaoperation.getMoname();
        this.path = metaoperation.getMolurl();
    }
}
