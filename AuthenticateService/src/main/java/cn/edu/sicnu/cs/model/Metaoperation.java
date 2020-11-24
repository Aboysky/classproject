package cn.edu.sicnu.cs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Metaoperation  implements Serializable {
    private Integer moid;

    private String moname;

    private String molurl;

    public Metaoperation(String moname, String molurl, String momethod, String modesc) {
        this.moname = moname;
        this.molurl = molurl;
        this.momethod = momethod;
        this.modesc = modesc;
    }

    private String momethod;

    private String modesc;

    public Integer getMoid() {
        return moid;
    }

    public void setMoid(Integer moid) {
        this.moid = moid;
    }

    public String getMoname() {
        return moname;
    }

    public void setMoname(String moname) {
        this.moname = moname == null ? null : moname.trim();
    }

    public String getMolurl() {
        return molurl;
    }

    public void setMolurl(String molurl) {
        this.molurl = molurl == null ? null : molurl.trim();
    }

    public String getMomethod() {
        return momethod;
    }

    public void setMomethod(String momethod) {
        this.momethod = momethod == null ? null : momethod.trim();
    }

    public String getModesc() {
        return modesc;
    }

    public void setModesc(String modesc) {
        this.modesc = modesc == null ? null : modesc.trim();
    }
}