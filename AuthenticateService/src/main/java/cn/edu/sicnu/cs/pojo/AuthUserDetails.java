package cn.edu.sicnu.cs.pojo;

import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Role;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

/**
 * @author Huan
 * @Classname AuthUserDetails
 * @Description TODO
 * @Date 2020/11/19 22:40
 * @Created by Huan
 */
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthUserDetails extends UserPojo implements UserDetails {


    private static final long serialVersionUID = -8386426014287215209L;

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

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public Role getRoleInfo() {
        return super.getRoleInfo();
    }

    @Override
    public String getUlocked() {
        return super.getUlocked();
    }

    @Override
    public String getDeleted() {
        return super.getDeleted();
    }

    @Override
    public Date getUlasttime() {
        return super.getUlasttime();
    }

    @Override
    public List<Metaoperation> getOperations() {
        return super.getOperations();
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    @Override
    public void setUsername(String username) {
        super.setUsername(username);
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    @Override
    public void setRoleInfo(Role roleInfo) {
        super.setRoleInfo(roleInfo);
    }

    @Override
    public void setUlocked(String ulocked) {
        super.setUlocked(ulocked);
    }

    @Override
    public void setDeleted(String deleted) {
        super.setDeleted(deleted);
    }

    @Override
    public void setUlasttime(Date ulasttime) {
        super.setUlasttime(ulasttime);
    }

    @Override
    public void setOperations(List<Metaoperation> operations) {
        super.setOperations(operations);
    }
}
