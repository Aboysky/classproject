package cn.edu.sicnu.cs.model;

public class Team {
    private Integer tezid;

    private Integer teDid;

    private Integer teUid;

    private Integer tedays;

    private Float tehours;

    private Integer teestimate;

    public Integer getTezid() {
        return tezid;
    }

    public void setTezid(Integer tezid) {
        this.tezid = tezid;
    }

    public Integer getTeDid() {
        return teDid;
    }

    public void setTeDid(Integer teDid) {
        this.teDid = teDid;
    }

    public Integer getTeUid() {
        return teUid;
    }

    public void setTeUid(Integer teUid) {
        this.teUid = teUid;
    }

    public Integer getTedays() {
        return tedays;
    }

    public void setTedays(Integer tedays) {
        this.tedays = tedays;
    }

    public Float getTehours() {
        return tehours;
    }

    public void setTehours(Float tehours) {
        this.tehours = tehours;
    }

    public Integer getTeestimate() {
        return teestimate;
    }

    public void setTeestimate(Integer teestimate) {
        this.teestimate = teestimate;
    }
}