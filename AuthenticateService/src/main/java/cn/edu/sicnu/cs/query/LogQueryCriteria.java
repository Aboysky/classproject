package cn.edu.sicnu.cs.query;

import cn.edu.sicnu.cs.anotations.Query;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * 日志查询类
 */
@Data
public class LogQueryCriteria {

    // 多字段模糊
    @Query(blurry = "username,description,address,requestIp,method,params")
    private String blurry;

    @Query
    private String logType;

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;

}
