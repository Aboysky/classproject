package cn.edu.sicnu.cs.model;

import java.util.Date;

public class Faq {
    private Integer qid;

    private String qname;

    private Integer qcreaterId;

    private Date qtime;

    private Date quptimestamp;

    private String qtype;

    private Integer qgood;

    private Integer qbad;

    private String qdec;

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname == null ? null : qname.trim();
    }

    public Integer getQcreaterId() {
        return qcreaterId;
    }

    public void setQcreaterId(Integer qcreaterId) {
        this.qcreaterId = qcreaterId;
    }

    public Date getQtime() {
        return qtime;
    }

    public void setQtime(Date qtime) {
        this.qtime = qtime;
    }

    public Date getQuptimestamp() {
        return quptimestamp;
    }

    public void setQuptimestamp(Date quptimestamp) {
        this.quptimestamp = quptimestamp;
    }

    public String getQtype() {
        return qtype;
    }

    public void setQtype(String qtype) {
        this.qtype = qtype == null ? null : qtype.trim();
    }

    public Integer getQgood() {
        return qgood;
    }

    public void setQgood(Integer qgood) {
        this.qgood = qgood;
    }

    public Integer getQbad() {
        return qbad;
    }

    public void setQbad(Integer qbad) {
        this.qbad = qbad;
    }

    public String getQdec() {
        return qdec;
    }

    public void setQdec(String qdec) {
        this.qdec = qdec == null ? null : qdec.trim();
    }
}