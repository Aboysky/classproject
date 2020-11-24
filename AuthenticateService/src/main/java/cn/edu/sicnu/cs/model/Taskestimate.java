package cn.edu.sicnu.cs.model;

public class Taskestimate {
    private Long tazid;

    private Long taid;

    private Float taconsumed;

    private String tawork;

    public Long getTazid() {
        return tazid;
    }

    public void setTazid(Long tazid) {
        this.tazid = tazid;
    }

    public Long getTaid() {
        return taid;
    }

    public void setTaid(Long taid) {
        this.taid = taid;
    }

    public Float getTaconsumed() {
        return taconsumed;
    }

    public void setTaconsumed(Float taconsumed) {
        this.taconsumed = taconsumed;
    }

    public String getTawork() {
        return tawork;
    }

    public void setTawork(String tawork) {
        this.tawork = tawork == null ? null : tawork.trim();
    }
}