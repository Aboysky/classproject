package cn.edu.sicnu.cs.pojo;

public enum Scopes {
    REFRESH_TOKEN;
    public String authority() {
        return "ROLE_" + this.name();
    }
}
