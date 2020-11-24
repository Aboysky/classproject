package cn.edu.sicnu.cs.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Classname NavigationBar
 * @Description TODO
 * @Date 2020/11/23 12:03
 * @Created by Huan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NavigationBar {   // Map(String,)
    private Integer id;
    private String name;
    private String addr;
    private boolean isActive;
    private boolean vertical_two;

}
