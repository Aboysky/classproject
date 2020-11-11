package cn.edu.sicnu.sc.softwareproduction.dao;

import cn.edu.sicnu.sc.softwareproduction.model.Workorders;
import cn.edu.sicnu.sc.softwareproduction.model.WorkordersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkordersMapper {
    long countByExample(WorkordersExample example);

    int deleteByExample(WorkordersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Workorders record);

    int insertSelective(Workorders record);

    List<Workorders> selectByExampleWithBLOBs(WorkordersExample example);

    List<Workorders> selectByExample(WorkordersExample example);

    Workorders selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Workorders record, @Param("example") WorkordersExample example);

    int updateByExampleWithBLOBs(@Param("record") Workorders record, @Param("example") WorkordersExample example);

    int updateByExample(@Param("record") Workorders record, @Param("example") WorkordersExample example);

    int updateByPrimaryKeySelective(Workorders record);

    int updateByPrimaryKeyWithBLOBs(Workorders record);

    int updateByPrimaryKey(Workorders record);
}