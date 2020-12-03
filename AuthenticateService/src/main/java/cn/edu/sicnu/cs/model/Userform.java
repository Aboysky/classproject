package cn.edu.sicnu.cs.model;

import java.util.Date;

public class Userform {
    private Long fzid;

    private Long fid;

    private Integer fuserId;

    private Integer fassignedtoId;

    private String ftitle;

    private String ftype;

    private String fusertype;

    private Integer fcompanyId;

    private Date fcreatetime;

    private Integer fversionId;

    private String faccessory;

    private String fpriority;

    private String fcontactname;

    private String fmobile;

    private String femail;

    private String fstatus;

    private Date ffinisheddate;

    private Integer fviews;

    private String fcontent;

    public Long getFzid() {
        return fzid;
    }

    public void setFzid(Long fzid) {
        this.fzid = fzid;
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public Integer getFuserId() {
        return fuserId;
    }

    public void setFuserId(Integer fuserId) {
        this.fuserId = fuserId;
    }

    public Integer getFassignedtoId() {
        return fassignedtoId;
    }

    public void setFassignedtoId(Integer fassignedtoId) {
        this.fassignedtoId = fassignedtoId;
    }

    public String getFtitle() {
        return ftitle;
    }

    public void setFtitle(String ftitle) {
        this.ftitle = ftitle == null ? null : ftitle.trim();
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype == null ? null : ftype.trim();
    }

    public String getFusertype() {
        return fusertype;
    }

    public void setFusertype(String fusertype) {
        this.fusertype = fusertype == null ? null : fusertype.trim();
    }

    public Integer getFcompanyId() {
        return fcompanyId;
    }

    public void setFcompanyId(Integer fcompanyId) {
        this.fcompanyId = fcompanyId;
    }

    public Date getFcreatetime() {
        return fcreatetime;
    }

    public void setFcreatetime(Date fcreatetime) {
        this.fcreatetime = fcreatetime;
    }

    public Integer getFversionId() {
        return fversionId;
    }

    public void setFversionId(Integer fversionId) {
        this.fversionId = fversionId;
    }

    public String getFaccessory() {
        return faccessory;
    }

    public void setFaccessory(String faccessory) {
        this.faccessory = faccessory == null ? null : faccessory.trim();
    }

    public String getFpriority() {
        return fpriority;
    }

    public void setFpriority(String fpriority) {
        this.fpriority = fpriority == null ? null : fpriority.trim();
    }

    public String getFcontactname() {
        return fcontactname;
    }

    public void setFcontactname(String fcontactname) {
        this.fcontactname = fcontactname == null ? null : fcontactname.trim();
    }

    public String getFmobile() {
        return fmobile;
    }

    public void setFmobile(String fmobile) {
        this.fmobile = fmobile == null ? null : fmobile.trim();
    }

    public String getFemail() {
        return femail;
    }

    public void setFemail(String femail) {
        this.femail = femail == null ? null : femail.trim();
    }

    public String getFstatus() {
        return fstatus;
    }

    public void setFstatus(String fstatus) {
        this.fstatus = fstatus == null ? null : fstatus.trim();
    }

    public Date getFfinisheddate() {
        return ffinisheddate;
    }

    public void setFfinisheddate(Date ffinisheddate) {
        this.ffinisheddate = ffinisheddate;
    }

    public Integer getFviews() {
        return fviews;
    }

    public void setFviews(Integer fviews) {
        this.fviews = fviews;
    }

    public String getFcontent() {
        return fcontent;
    }

    public void setFcontent(String fcontent) {
        this.fcontent = fcontent == null ? null : fcontent.trim();
    }
}