package cn.edu.sicnu.cs.pojo;

import cn.edu.sicnu.cs.model.Metaoperation;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Classname AuthUserDetails
 * @Description TODO
 * @Date 2020/11/19 22:40
 * @Created by Huan
 */
public class AuthUserDetails extends UserPojo implements UserDetails {


    public AuthUserDetails(UserPojo userPojo){
        if (userPojo!=null){
            this.setId(userPojo.getId());
            this.setUsername(userPojo.getUsername());
            this.setPassword(userPojo.getPassword());
            this.setUlocked(userPojo.getUlocked());
            this.setDeleted(userPojo.getDeleted());
            this.setOperations(userPojo.getOperations());
            this.setUlasttime(userPojo.getUlasttime());
            this.setRoleInfo(userPojo.getRoleInfo());
        }
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<MyGrantedAuthority> authorities = new ArrayList<>();
        List<Metaoperation> operations = this.getOperations();
        for (Metaoperation operation : operations) {
            authorities.add(new MyGrantedAuthority(operation.getMolurl(),operation.getMomethod()));
        }
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return "0".equals(this.getUlocked());
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return "0".equals(this.getDeleted());
    }
}
