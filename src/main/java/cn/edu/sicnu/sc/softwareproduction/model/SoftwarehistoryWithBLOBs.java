package cn.edu.sicnu.sc.softwareproduction.model;

public class SoftwarehistoryWithBLOBs extends Softwarehistory {
    private String acl;

    private String newfunction;

    private String solve;

    public String getAcl() {
        return acl;
    }

    public void setAcl(String acl) {
        this.acl = acl == null ? null : acl.trim();
    }

    public String getNewfunction() {
        return newfunction;
    }

    public void setNewfunction(String newfunction) {
        this.newfunction = newfunction == null ? null : newfunction.trim();
    }

    public String getSolve() {
        return solve;
    }

    public void setSolve(String solve) {
        this.solve = solve == null ? null : solve.trim();
    }
}