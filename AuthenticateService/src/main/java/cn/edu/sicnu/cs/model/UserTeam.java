package cn.edu.sicnu.cs.model;

public class UserTeam {
    private Long utid;

    private Integer utTid;

    private Integer utUid;

    private Integer tedays;

    private Float tehours;

    private Integer teestimate;

    public Long getUtid() {
        return utid;
    }

    public void setUtid(Long utid) {
        this.utid = utid;
    }

    public Integer getUtTid() {
        return utTid;
    }

    public void setUtTid(Integer utTid) {
        this.utTid = utTid;
    }

    public Integer getUtUid() {
        return utUid;
    }

    public void setUtUid(Integer utUid) {
        this.utUid = utUid;
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