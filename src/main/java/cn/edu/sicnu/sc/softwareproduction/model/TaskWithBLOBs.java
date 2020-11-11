package cn.edu.sicnu.sc.softwareproduction.model;

public class TaskWithBLOBs extends Task {
    private String desc;

    private String mailto;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getMailto() {
        return mailto;
    }

    public void setMailto(String mailto) {
        this.mailto = mailto == null ? null : mailto.trim();
    }
}