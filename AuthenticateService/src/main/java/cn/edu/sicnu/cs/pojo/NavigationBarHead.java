package cn.edu.sicnu.cs.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class NavigationBarHead {
    private Integer id;
    private String name;
    private String path;
    private List<NavigationBar> childs;

    public NavigationBarHead(String name, String path) {
        this.name = name;
        this.path = path;
    }
}
