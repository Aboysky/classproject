package cn.edu.sicnu.cs.model;

public class Department {
    private Integer did;

    private String dname;

    private String dmobile;

    private String ddeleted;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getDmobile() {
        return dmobile;
    }

    public void setDmobile(String dmobile) {
        this.dmobile = dmobile == null ? null : dmobile.trim();
    }

    public String getDdeleted() {
        return ddeleted;
    }

    public void setDdeleted(String ddeleted) {
        this.ddeleted = ddeleted == null ? null : ddeleted.trim();
    }
}