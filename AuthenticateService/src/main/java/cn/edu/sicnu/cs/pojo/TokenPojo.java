package cn.edu.sicnu.cs.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Classname TokenPojo
 * @Description TODO
 * @Date 2020/11/21 23:13
 * @Created by Huan
 */
@Data
@NoArgsConstructor
public class TokenPojo implements Serializable {
    private static final long serialVersionUID = 257692594404506255L;
    private String token;
    private String refreshtoken;
    private Date date;
}
