package cn.edu.sicnu.cs.model;

import java.io.Serializable;

public class Company implements Serializable {
    private static final long serialVersionUID = -4402535744016846329L;
    private Integer cid;

    private String cname;

    private String cmobile;

    private String caddress;

    private String czipcode;

    private String cwebsite;

    private String cdeleted;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCmobile() {
        return cmobile;
    }

    public void setCmobile(String cmobile) {
        this.cmobile = cmobile == null ? null : cmobile.trim();
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress == null ? null : caddress.trim();
    }

    public String getCzipcode() {
        return czipcode;
    }

    public void setCzipcode(String czipcode) {
        this.czipcode = czipcode == null ? null : czipcode.trim();
    }

    public String getCwebsite() {
        return cwebsite;
    }

    public void setCwebsite(String cwebsite) {
        this.cwebsite = cwebsite == null ? null : cwebsite.trim();
    }

    public String getCdeleted() {
        return cdeleted;
    }

    public void setCdeleted(String cdeleted) {
        this.cdeleted = cdeleted == null ? null : cdeleted.trim();
    }
}