package cn.edu.sicnu.cs.model;

import java.util.Date;

public class Task {
    private Long tzid;

    private Long tid;

    private Long tfromid;

    private String tmodule;

    private String tname;

    private String ttype;

    private String tpririty;

    private Integer tuserbyId;

    private Date tcreatedate;

    private Float testimate;

    private Float tconsumed;

    private Float tleft;

    private Date tdeadline;

    private Integer tassignedtoId;

    private Date teststarted;

    private Date trealstarted;

    private Date tfinisheddate;

    private Integer tclosedbyId;

    private Date tcloseddate;

    private String tclosedreason;

    private String tstatus;

    private String tdesc;

    public Long getTzid() {
        return tzid;
    }

    public void setTzid(Long tzid) {
        this.tzid = tzid;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTfromid() {
        return tfromid;
    }

    public void setTfromid(Long tfromid) {
        this.tfromid = tfromid;
    }

    public String getTmodule() {
        return tmodule;
    }

    public void setTmodule(String tmodule) {
        this.tmodule = tmodule == null ? null : tmodule.trim();
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getTtype() {
        return ttype;
    }

    public void setTtype(String ttype) {
        this.ttype = ttype == null ? null : ttype.trim();
    }

    public String getTpririty() {
        return tpririty;
    }

    public void setTpririty(String tpririty) {
        this.tpririty = tpririty == null ? null : tpririty.trim();
    }

    public Integer getTuserbyId() {
        return tuserbyId;
    }

    public void setTuserbyId(Integer tuserbyId) {
        this.tuserbyId = tuserbyId;
    }

    public Date getTcreatedate() {
        return tcreatedate;
    }

    public void setTcreatedate(Date tcreatedate) {
        this.tcreatedate = tcreatedate;
    }

    public Float getTestimate() {
        return testimate;
    }

    public void setTestimate(Float testimate) {
        this.testimate = testimate;
    }

    public Float getTconsumed() {
        return tconsumed;
    }

    public void setTconsumed(Float tconsumed) {
        this.tconsumed = tconsumed;
    }

    public Float getTleft() {
        return tleft;
    }

    public void setTleft(Float tleft) {
        this.tleft = tleft;
    }

    public Date getTdeadline() {
        return tdeadline;
    }

    public void setTdeadline(Date tdeadline) {
        this.tdeadline = tdeadline;
    }

    public Integer getTassignedtoId() {
        return tassignedtoId;
    }

    public void setTassignedtoId(Integer tassignedtoId) {
        this.tassignedtoId = tassignedtoId;
    }

    public Date getTeststarted() {
        return teststarted;
    }

    public void setTeststarted(Date teststarted) {
        this.teststarted = teststarted;
    }

    public Date getTrealstarted() {
        return trealstarted;
    }

    public void setTrealstarted(Date trealstarted) {
        this.trealstarted = trealstarted;
    }

    public Date getTfinisheddate() {
        return tfinisheddate;
    }

    public void setTfinisheddate(Date tfinisheddate) {
        this.tfinisheddate = tfinisheddate;
    }

    public Integer getTclosedbyId() {
        return tclosedbyId;
    }

    public void setTclosedbyId(Integer tclosedbyId) {
        this.tclosedbyId = tclosedbyId;
    }

    public Date getTcloseddate() {
        return tcloseddate;
    }

    public void setTcloseddate(Date tcloseddate) {
        this.tcloseddate = tcloseddate;
    }

    public String getTclosedreason() {
        return tclosedreason;
    }

    public void setTclosedreason(String tclosedreason) {
        this.tclosedreason = tclosedreason == null ? null : tclosedreason.trim();
    }

    public String getTstatus() {
        return tstatus;
    }

    public void setTstatus(String tstatus) {
        this.tstatus = tstatus == null ? null : tstatus.trim();
    }

    public String getTdesc() {
        return tdesc;
    }

    public void setTdesc(String tdesc) {
        this.tdesc = tdesc == null ? null : tdesc.trim();
    }
}