package cn.edu.sicnu.cs.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Classname NavigationBarHead
 * @Description TODO
 * @Date 2020/11/23 12:38
 * @Created by Huan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NavigationBarHeadVo implements Serializable {
    private static final long serialVersionUID = -782704021022967305L;
    private Integer id;
    private String name;
    private String path;
    private List<NavigationBarVo> childs;

    public NavigationBarHeadVo(String name, String path) {
        this.name = name;
        this.path = path;
    }
}
