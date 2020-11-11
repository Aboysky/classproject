package cn.edu.sicnu.sc.softwareproduction.dao;

import cn.edu.sicnu.sc.softwareproduction.model.Promble;
import cn.edu.sicnu.sc.softwareproduction.model.PrombleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrombleMapper {
    long countByExample(PrombleExample example);

    int deleteByExample(PrombleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Promble record);

    int insertSelective(Promble record);

    List<Promble> selectByExampleWithBLOBs(PrombleExample example);

    List<Promble> selectByExample(PrombleExample example);

    Promble selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Promble record, @Param("example") PrombleExample example);

    int updateByExampleWithBLOBs(@Param("record") Promble record, @Param("example") PrombleExample example);

    int updateByExample(@Param("record") Promble record, @Param("example") PrombleExample example);

    int updateByPrimaryKeySelective(Promble record);

    int updateByPrimaryKeyWithBLOBs(Promble record);

    int updateByPrimaryKey(Promble record);
}