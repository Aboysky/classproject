package cn.edu.sicnu.cs.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
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
public class NavigationBarVo implements Serializable {
    private static final long serialVersionUID = 7742139297737698058L;   // Map(String,)
    private Integer id;
    private String name;
    private String addr;
    private boolean isActive;
    private boolean vertical_two;

}
