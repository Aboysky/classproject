package cn.edu.sicnu.cs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User  implements Serializable {
    private static final long serialVersionUID = -4232661830177065839L;
    private Integer uid;

    private Integer ucompanyId;

    private String username;

    private String password;

    private Integer uroleId;

    private String urealname;

    private String ugender;

    private String uemail;

    private String umobile;

    private Date ujoin;

    private Integer uvisits;

    private String uip;

    private Date ulasttime;

    private String ulocked;

    private String udeleted;

    public User(String username, String urealname, String ugender, String uemail, String umobile) {
        this.username = username;
        this.urealname = urealname;
        this.ugender = ugender;
        this.uemail = uemail;
        this.umobile = umobile;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getUcompanyId() {
        return ucompanyId;
    }

    public void setUcompanyId(Integer ucompanyId) {
        this.ucompanyId = ucompanyId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getUroleId() {
        return uroleId;
    }

    public void setUroleId(Integer uroleId) {
        this.uroleId = uroleId;
    }

    public String getUrealname() {
        return urealname;
    }

    public void setUrealname(String urealname) {
        this.urealname = urealname == null ? null : urealname.trim();
    }

    public String getUgender() {
        return ugender;
    }

    public void setUgender(String ugender) {
        this.ugender = ugender == null ? null : ugender.trim();
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail == null ? null : uemail.trim();
    }

    public String getUmobile() {
        return umobile;
    }

    public void setUmobile(String umobile) {
        this.umobile = umobile == null ? null : umobile.trim();
    }

    public Date getUjoin() {
        return ujoin;
    }

    public void setUjoin(Date ujoin) {
        this.ujoin = ujoin;
    }

    public Integer getUvisits() {
        return uvisits;
    }

    public void setUvisits(Integer uvisits) {
        this.uvisits = uvisits;
    }

    public String getUip() {
        return uip;
    }

    public void setUip(String uip) {
        this.uip = uip == null ? null : uip.trim();
    }

    public Date getUlasttime() {
        return ulasttime;
    }

    public void setUlasttime(Date ulasttime) {
        this.ulasttime = ulasttime;
    }

    public String getUlocked() {
        return ulocked;
    }

    public void setUlocked(String ulocked) {
        this.ulocked = ulocked == null ? null : ulocked.trim();
    }

    public String getUdeleted() {
        return udeleted;
    }

    public void setUdeleted(String udeleted) {
        this.udeleted = udeleted == null ? null : udeleted.trim();
    }
}