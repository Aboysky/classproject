package cn.edu.sicnu.sc.softwareproduction.model;

import java.util.Date;

public class Task {
    private Integer id;

    private Long taid;

    private Integer parent;

    private Long fromwoid;

    private String module;

    private String name;

    private String type;

    private Byte pri;

    private String openedby;

    private Date openeddate;

    private Float estimate;

    private Float consumed;

    private Float left;

    private Date deadline;

    private String assignedto;

    private Date assigneddate;

    private Date eststarted;

    private Date realstarted;

    private Date finisheddate;

    private String closedby;

    private Date closeddate;

    private String closedreason;

    private String lasteditedby;

    private Date lastediteddate;

    private String status;

    private String deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getTaid() {
        return taid;
    }

    public void setTaid(Long taid) {
        this.taid = taid;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Long getFromwoid() {
        return fromwoid;
    }

    public void setFromwoid(Long fromwoid) {
        this.fromwoid = fromwoid;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Byte getPri() {
        return pri;
    }

    public void setPri(Byte pri) {
        this.pri = pri;
    }

    public String getOpenedby() {
        return openedby;
    }

    public void setOpenedby(String openedby) {
        this.openedby = openedby == null ? null : openedby.trim();
    }

    public Date getOpeneddate() {
        return openeddate;
    }

    public void setOpeneddate(Date openeddate) {
        this.openeddate = openeddate;
    }

    public Float getEstimate() {
        return estimate;
    }

    public void setEstimate(Float estimate) {
        this.estimate = estimate;
    }

    public Float getConsumed() {
        return consumed;
    }

    public void setConsumed(Float consumed) {
        this.consumed = consumed;
    }

    public Float getLeft() {
        return left;
    }

    public void setLeft(Float left) {
        this.left = left;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getAssignedto() {
        return assignedto;
    }

    public void setAssignedto(String assignedto) {
        this.assignedto = assignedto == null ? null : assignedto.trim();
    }

    public Date getAssigneddate() {
        return assigneddate;
    }

    public void setAssigneddate(Date assigneddate) {
        this.assigneddate = assigneddate;
    }

    public Date getEststarted() {
        return eststarted;
    }

    public void setEststarted(Date eststarted) {
        this.eststarted = eststarted;
    }

    public Date getRealstarted() {
        return realstarted;
    }

    public void setRealstarted(Date realstarted) {
        this.realstarted = realstarted;
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

    public String getClosedreason() {
        return closedreason;
    }

    public void setClosedreason(String closedreason) {
        this.closedreason = closedreason == null ? null : closedreason.trim();
    }

    public String getLasteditedby() {
        return lasteditedby;
    }

    public void setLasteditedby(String lasteditedby) {
        this.lasteditedby = lasteditedby == null ? null : lasteditedby.trim();
    }

    public Date getLastediteddate() {
        return lastediteddate;
    }

    public void setLastediteddate(Date lastediteddate) {
        this.lastediteddate = lastediteddate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }
}