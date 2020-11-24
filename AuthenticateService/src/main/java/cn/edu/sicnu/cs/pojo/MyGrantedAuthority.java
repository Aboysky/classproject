package cn.edu.sicnu.cs.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

/**
 * @Classname MyGrantedAuthority
 * @Description TODO
 * @Date 2020/11/17 8:25
 * @Created by Huan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyGrantedAuthority implements GrantedAuthority {
    private String url;
    private String method;

    @Override
    public String getAuthority() {
        return this.url + ";" + this.method;
    }

}
