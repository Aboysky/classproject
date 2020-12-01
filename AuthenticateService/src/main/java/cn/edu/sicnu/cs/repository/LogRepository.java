package cn.edu.sicnu.cs.repository;

import cn.edu.sicnu.cs.entity.Log;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * 日志
 */
@Repository
public interface LogRepository extends JpaRepository<Log, Long>, JpaSpecificationExecutor<Log> {

    /**
     * 获取一个时间段的IP记录
     */
    @Query(value = "select count(*) from (select requestip FROM log where createtime between ?1 and ?2 GROUP BY requestip) as s",nativeQuery = true)
    Long findIp(String date1, String date2);

    /**
     * 根据日志类型删除信息
     * @param logType
     */
    @Query(nativeQuery = true,value = "delete from log where log_type = ?1")
    @Modifying
    void deleteByLogType(String logType);

}
