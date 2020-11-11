package cn.edu.sicnu.sc.softwareproduction.model;

import java.util.Date;

public class Action {
    private Integer id;

    private String objecttype;

    private Integer objectid;

    private Integer workoders;

    private Integer useroders;

    private Integer task;

    private String actor;

    private String action;

    private Date date;

    private String read;

    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObjecttype() {
        return objecttype;
    }

    public void setObjecttype(String objecttype) {
        this.objecttype = objecttype == null ? null : objecttype.trim();
    }

    public Integer getObjectid() {
        return objectid;
    }

    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    public Integer getWorkoders() {
        return workoders;
    }

    public void setWorkoders(Integer workoders) {
        this.workoders = workoders;
    }

    public Integer getUseroders() {
        return useroders;
    }

    public void setUseroders(Integer useroders) {
        this.useroders = useroders;
    }

    public Integer getTask() {
        return task;
    }

    public void setTask(Integer task) {
        this.task = task;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor == null ? null : actor.trim();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRead() {
        return read;
    }

    public void setRead(String read) {
        this.read = read == null ? null : read.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}