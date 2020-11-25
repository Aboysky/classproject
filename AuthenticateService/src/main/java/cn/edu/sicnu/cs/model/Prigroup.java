package cn.edu.sicnu.cs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prigroup  implements Serializable {
    private static final long serialVersionUID = 8451458377523136870L;
    private Integer pgid;

    private String prigroupname;

    private String prigroupdesc;

    public Prigroup(String prigroupname, String prigroupdesc) {
        this.prigroupname = prigroupname;
        this.prigroupdesc = prigroupdesc;
    }

    public Integer getPgid() {
        return pgid;
    }

    public void setPgid(Integer pgid) {
        this.pgid = pgid;
    }

    public String getPrigroupname() {
        return prigroupname;
    }

    public void setPrigroupname(String prigroupname) {
        this.prigroupname = prigroupname == null ? null : prigroupname.trim();
    }

    public String getPrigroupdesc() {
        return prigroupdesc;
    }

    public void setPrigroupdesc(String prigroupdesc) {
        this.prigroupdesc = prigroupdesc == null ? null : prigroupdesc.trim();
    }
}