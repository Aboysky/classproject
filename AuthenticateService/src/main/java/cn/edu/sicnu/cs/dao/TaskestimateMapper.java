package cn.edu.sicnu.cs.dao;

import cn.edu.sicnu.cs.model.Taskestimate;
import cn.edu.sicnu.cs.model.TaskestimateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskestimateMapper {
    long countByExample(TaskestimateExample example);

    int deleteByExample(TaskestimateExample example);

    int deleteByPrimaryKey(Long tazid);

    int insert(Taskestimate record);

    int insertSelective(Taskestimate record);

    List<Taskestimate> selectByExampleWithBLOBs(TaskestimateExample example);

    List<Taskestimate> selectByExample(TaskestimateExample example);

    Taskestimate selectByPrimaryKey(Long tazid);

    int updateByExampleSelective(@Param("record") Taskestimate record, @Param("example") TaskestimateExample example);

    int updateByExampleWithBLOBs(@Param("record") Taskestimate record, @Param("example") TaskestimateExample example);

    int updateByExample(@Param("record") Taskestimate record, @Param("example") TaskestimateExample example);

    int updateByPrimaryKeySelective(Taskestimate record);

    int updateByPrimaryKeyWithBLOBs(Taskestimate record);

    int updateByPrimaryKey(Taskestimate record);
}