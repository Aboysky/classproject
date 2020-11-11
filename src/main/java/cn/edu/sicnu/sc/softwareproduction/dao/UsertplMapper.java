package cn.edu.sicnu.sc.softwareproduction.dao;

import cn.edu.sicnu.sc.softwareproduction.model.Usertpl;
import cn.edu.sicnu.sc.softwareproduction.model.UsertplExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsertplMapper {
    long countByExample(UsertplExample example);

    int deleteByExample(UsertplExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Usertpl record);

    int insertSelective(Usertpl record);

    List<Usertpl> selectByExampleWithBLOBs(UsertplExample example);

    List<Usertpl> selectByExample(UsertplExample example);

    Usertpl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Usertpl record, @Param("example") UsertplExample example);

    int updateByExampleWithBLOBs(@Param("record") Usertpl record, @Param("example") UsertplExample example);

    int updateByExample(@Param("record") Usertpl record, @Param("example") UsertplExample example);

    int updateByPrimaryKeySelective(Usertpl record);

    int updateByPrimaryKeyWithBLOBs(Usertpl record);

    int updateByPrimaryKey(Usertpl record);
}