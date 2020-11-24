package cn.edu.sicnu.cs.model;

import java.util.Date;

public class Workorders {
    private Long wzid;

    private Long wid;

    private Long wuserformId;

    private String wname;

    private String worderto;

    private String wtype;

    private String wrepeat;

    private Integer wuserId;

    private Date wcreattime;

    private String waccessory;

    private String wos;

    private String wdb;

    private String wjdk;

    private String wpriority;

    private String wstatus;

    private String wmemo;

    private Integer wprincipalId;

    private Date wddl;

    private String wcontent;

    public Long getWzid() {
        return wzid;
    }

    public void setWzid(Long wzid) {
        this.wzid = wzid;
    }

    public Long getWid() {
        return wid;
    }

    public void setWid(Long wid) {
        this.wid = wid;
    }

    public Long getWuserformId() {
        return wuserformId;
    }

    public void setWuserformId(Long wuserformId) {
        this.wuserformId = wuserformId;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname == null ? null : wname.trim();
    }

    public String getWorderto() {
        return worderto;
    }

    public void setWorderto(String worderto) {
        this.worderto = worderto == null ? null : worderto.trim();
    }

    public String getWtype() {
        return wtype;
    }

    public void setWtype(String wtype) {
        this.wtype = wtype == null ? null : wtype.trim();
    }

    public String getWrepeat() {
        return wrepeat;
    }

    public void setWrepeat(String wrepeat) {
        this.wrepeat = wrepeat == null ? null : wrepeat.trim();
    }

    public Integer getWuserId() {
        return wuserId;
    }

    public void setWuserId(Integer wuserId) {
        this.wuserId = wuserId;
    }

    public Date getWcreattime() {
        return wcreattime;
    }

    public void setWcreattime(Date wcreattime) {
        this.wcreattime = wcreattime;
    }

    public String getWaccessory() {
        return waccessory;
    }

    public void setWaccessory(String waccessory) {
        this.waccessory = waccessory == null ? null : waccessory.trim();
    }

    public String getWos() {
        return wos;
    }

    public void setWos(String wos) {
        this.wos = wos == null ? null : wos.trim();
    }

    public String getWdb() {
        return wdb;
    }

    public void setWdb(String wdb) {
        this.wdb = wdb == null ? null : wdb.trim();
    }

    public String getWjdk() {
        return wjdk;
    }

    public void setWjdk(String wjdk) {
        this.wjdk = wjdk == null ? null : wjdk.trim();
    }

    public String getWpriority() {
        return wpriority;
    }

    public void setWpriority(String wpriority) {
        this.wpriority = wpriority == null ? null : wpriority.trim();
    }

    public String getWstatus() {
        return wstatus;
    }

    public void setWstatus(String wstatus) {
        this.wstatus = wstatus == null ? null : wstatus.trim();
    }

    public String getWmemo() {
        return wmemo;
    }

    public void setWmemo(String wmemo) {
        this.wmemo = wmemo == null ? null : wmemo.trim();
    }

    public Integer getWprincipalId() {
        return wprincipalId;
    }

    public void setWprincipalId(Integer wprincipalId) {
        this.wprincipalId = wprincipalId;
    }

    public Date getWddl() {
        return wddl;
    }

    public void setWddl(Date wddl) {
        this.wddl = wddl;
    }

    public String getWcontent() {
        return wcontent;
    }

    public void setWcontent(String wcontent) {
        this.wcontent = wcontent == null ? null : wcontent.trim();
    }
}