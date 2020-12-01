package cn.edu.sicnu.cs.model;

public class LogWithBLOBs extends Log {
    private String params;

    private String time;

    private String exceptiondetail;

    public LogWithBLOBs() {

    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public byte[] getExceptiondetail() {
        return exceptiondetail.getBytes();
    }

    public void setExceptiondetail(byte[] exceptiondetail) {
        this.exceptiondetail = exceptiondetail == null ? null : new String(exceptiondetail);
    }
    public LogWithBLOBs(String logType, Long time) {
        this.setLogtype(logType);
        this.setTime(time.toString());
    }
}