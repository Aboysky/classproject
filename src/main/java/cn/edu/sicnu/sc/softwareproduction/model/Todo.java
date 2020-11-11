package cn.edu.sicnu.sc.softwareproduction.model;

import java.util.Date;

public class Todo {
    private Integer id;

    private String account;

    private Date date;

    private Short begin;

    private Short end;

    private String type;

    private Byte cycle;

    private Integer idvalue;

    private Byte pri;

    private String name;

    private String status;

    private Boolean private;

    private String config;

    private String assignedto;

    private String assignedby;

    private Date assigneddate;

    private String finishedby;

    private Date finisheddate;

    private String closedby;

    private Date closeddate;

    private String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Short getBegin() {
        return begin;
    }

    public void setBegin(Short begin) {
        this.begin = begin;
    }

    public Short getEnd() {
        return end;
    }

    public void setEnd(Short end) {
        this.end = end;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Byte getCycle() {
        return cycle;
    }

    public void setCycle(Byte cycle) {
        this.cycle = cycle;
    }

    public Integer getIdvalue() {
        return idvalue;
    }

    public void setIdvalue(Integer idvalue) {
        this.idvalue = idvalue;
    }

    public Byte getPri() {
        return pri;
    }

    public void setPri(Byte pri) {
        this.pri = pri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Boolean getPrivate() {
        return private;
    }

    public void setPrivate(Boolean private) {
        this.private = private;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
    }

    public String getAssignedto() {
        return assignedto;
    }

    public void setAssignedto(String assignedto) {
        this.assignedto = assignedto == null ? null : assignedto.trim();
    }

    public String getAssignedby() {
        return assignedby;
    }

    public void setAssignedby(String assignedby) {
        this.assignedby = assignedby == null ? null : assignedby.trim();
    }

    public Date getAssigneddate() {
        return assigneddate;
    }

    public void setAssigneddate(Date assigneddate) {
        this.assigneddate = assigneddate;
    }

    public String getFinishedby() {
        return finishedby;
    }

    public void setFinishedby(String finishedby) {
        this.finishedby = finishedby == null ? null : finishedby.trim();
    }

    public Date getFinisheddate() {
        return finisheddate;
    }

    public void setFinisheddate(Date finisheddate) {
        this.finisheddate = finisheddate;
    }

    public String getClosedby() {
        return closedby;
    }

    public void setClosedby(String closedby) {
        this.closedby = closedby == null ? null : closedby.trim();
    }

    public Date getCloseddate() {
        return closeddate;
    }

    public void setCloseddate(Date closeddate) {
        this.closeddate = closeddate;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}