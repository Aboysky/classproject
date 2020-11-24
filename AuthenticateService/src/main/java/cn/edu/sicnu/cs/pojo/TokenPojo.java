package cn.edu.sicnu.cs.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Classname TokenPojo
 * @Description TODO
 * @Date 2020/11/21 23:13
 * @Created by Huan
 */
@Data
@NoArgsConstructor
public class TokenPojo {
    private String token;
    private String refreshtoken;
    private Date date;
}
