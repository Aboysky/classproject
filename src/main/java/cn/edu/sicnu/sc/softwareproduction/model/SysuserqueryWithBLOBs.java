package cn.edu.sicnu.sc.softwareproduction.model;

public class SysuserqueryWithBLOBs extends Sysuserquery {
    private String form;

    private String sql;

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form == null ? null : form.trim();
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql == null ? null : sql.trim();
    }
}