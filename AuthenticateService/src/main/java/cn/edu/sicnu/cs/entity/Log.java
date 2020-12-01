package cn.edu.sicnu.cs.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @Classname Log
 * @Description TODO
 * @Date 2020/11/30 9:37
 * @Created by Huan
 */

@Entity(name = "log")
@Data
public class Log implements Serializable {

    private static final long serialVersionUID = 6011942559901935687L;
    @Id
    @GeneratedValue()
    private Long id;

    // 操作用户
    private String username;

    // 描述
    private String description;

    // 方法名
    private String method;

    // 参数
    @Column(columnDefinition = "text")
    private String params;

    // 日志类型
    @Column(name = "logtype")
    private String logType;

    // 请求ip
    @Column(name = "requestip")
    private String requestIp;

    @Column(name = "address")
    private String address;

    private String browser;

    // 请求耗时
    private Long time;

    // 异常详细
    @Column(name = "exceptiondetail", columnDefinition = "text")
    private byte[] exceptionDetail;

    // 创建日期
    @CreationTimestamp
    @Column(name = "createtime")
    private Timestamp createTime;

    public Log(String logType, Long time) {
        this.logType = logType;
        this.time = time;
    }

    public Log() {
    }
}

