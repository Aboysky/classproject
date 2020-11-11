package cn.edu.sicnu.sc.softwareproduction.model;

public class SoftwareWithBLOBs extends Software {
    private String acl;

    private String desc;

    public String getAcl() {
        return acl;
    }

    public void setAcl(String acl) {
        this.acl = acl == null ? null : acl.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}