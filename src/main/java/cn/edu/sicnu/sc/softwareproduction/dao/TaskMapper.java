package cn.edu.sicnu.sc.softwareproduction.dao;

import cn.edu.sicnu.sc.softwareproduction.model.Task;
import cn.edu.sicnu.sc.softwareproduction.model.TaskExample;
import cn.edu.sicnu.sc.softwareproduction.model.TaskWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskMapper {
    long countByExample(TaskExample example);

    int deleteByExample(TaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaskWithBLOBs record);

    int insertSelective(TaskWithBLOBs record);

    List<TaskWithBLOBs> selectByExampleWithBLOBs(TaskExample example);

    List<Task> selectByExample(TaskExample example);

    TaskWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TaskWithBLOBs record, @Param("example") TaskExample example);

    int updateByExampleWithBLOBs(@Param("record") TaskWithBLOBs record, @Param("example") TaskExample example);

    int updateByExample(@Param("record") Task record, @Param("example") TaskExample example);

    int updateByPrimaryKeySelective(TaskWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TaskWithBLOBs record);

    int updateByPrimaryKey(Task record);
}