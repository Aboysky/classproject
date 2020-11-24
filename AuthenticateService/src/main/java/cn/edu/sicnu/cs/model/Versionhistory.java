package cn.edu.sicnu.cs.model;

import java.util.Date;

public class Versionhistory {
    private Integer vid;

    private String vbigversion;

    private String vversion;

    private Date vtime;

    private String vdesc;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getVbigversion() {
        return vbigversion;
    }

    public void setVbigversion(String vbigversion) {
        this.vbigversion = vbigversion == null ? null : vbigversion.trim();
    }

    public String getVversion() {
        return vversion;
    }

    public void setVversion(String vversion) {
        this.vversion = vversion == null ? null : vversion.trim();
    }

    public Date getVtime() {
        return vtime;
    }

    public void setVtime(Date vtime) {
        this.vtime = vtime;
    }

    public String getVdesc() {
        return vdesc;
    }

    public void setVdesc(String vdesc) {
        this.vdesc = vdesc == null ? null : vdesc.trim();
    }
}