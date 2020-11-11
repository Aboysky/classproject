package cn.edu.sicnu.sc.softwareproduction.model;

public class Sysusergroup {
    private String account;

    private Integer group;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }
}