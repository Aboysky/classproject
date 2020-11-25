package cn.edu.sicnu.cs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role  implements Serializable {
    private static final long serialVersionUID = 6814809896618995502L;
    private Integer rid;

    private String rname;

    private String rdesc;

    private Date rcreatetime;

    public Role(String rname, String rdesc, Date date) {
        this.rname=rname;
        this.rdesc=rdesc;
        this.rcreatetime=date;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getRdesc() {
        return rdesc;
    }

    public void setRdesc(String rdesc) {
        this.rdesc = rdesc == null ? null : rdesc.trim();
    }

    public Date getRcreatetime() {
        return rcreatetime;
    }

    public void setRcreatetime(Date rcreatetime) {
        this.rcreatetime = rcreatetime;
    }
}