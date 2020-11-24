package cn.edu.sicnu.cs.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname NavigationBarChilren
 * @Description TODO
 * @Date 2020/11/23 16:32
 * @Created by Huan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NavigationBarChilren {
    private Integer id;
    private String name;
    private String addr;
    private boolean isActive;
}
