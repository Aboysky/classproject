package cn.edu.sicnu.cs.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkOrderPojo implements Serializable {
    private static final long serialVersionUID = 3109861994918892854L;
    private Integer wid;

    private String wname;

    private String wstatus;

    private String wprincipal_id;

    private Date wddl;

    private HashMap<String, String> operations = new HashMap<>();

}
