package cn.edu.sicnu.sc.softwareproduction.model;

public class Userview {
    private String account;

    private String task;

    private String workorders;

    private String userorders;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task == null ? null : task.trim();
    }

    public String getWorkorders() {
        return workorders;
    }

    public void setWorkorders(String workorders) {
        this.workorders = workorders == null ? null : workorders.trim();
    }

    public String getUserorders() {
        return userorders;
    }

    public void setUserorders(String userorders) {
        this.userorders = userorders == null ? null : userorders.trim();
    }
}