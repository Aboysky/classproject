package cn.edu.sicnu.cs.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Classname NavigationBarChilren
 * @Description TODO
 * @Date 2020/11/23 16:32
 * @Created by Huan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NavigationBarChilren implements Serializable {
    private static final long serialVersionUID = -8377735627273030468L;
    private Integer id;
    private String name;
    private String addr;
    private boolean isActive;
}
