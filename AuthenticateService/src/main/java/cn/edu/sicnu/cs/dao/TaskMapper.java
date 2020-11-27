package cn.edu.sicnu.cs.dao;

import cn.edu.sicnu.cs.model.Task;
import cn.edu.sicnu.cs.model.TaskExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TaskMapper {
    long countByExample(TaskExample example);

    int deleteByExample(TaskExample example);

    int deleteByPrimaryKey(Long tzid);

    int insert(Task record);

    int insertSelective(Task record);

    List<Task> selectByExampleWithBLOBs(TaskExample example);

    List<Task> selectByExample(TaskExample example);

    Task selectByPrimaryKey(Long tzid);

    int updateByExampleSelective(@Param("record") Task record, @Param("example") TaskExample example);

    int updateByExampleWithBLOBs(@Param("record") Task record, @Param("example") TaskExample example);

    int updateByExample(@Param("record") Task record, @Param("example") TaskExample example);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKeyWithBLOBs(Task record);

    int updateByPrimaryKey(Task record);

    int findSelfTaskCntByStatus(long uid, String status);



    List<Map<String,Object>> findSelfTaskListByStatus(long uid, long page, long pagenum, String status);


    List<Task> findWorkOrderListByStatus(String status);

}