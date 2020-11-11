package cn.edu.sicnu.sc.softwareproduction.dao;

import cn.edu.sicnu.sc.softwareproduction.model.Software;
import cn.edu.sicnu.sc.softwareproduction.model.SoftwareExample;
import cn.edu.sicnu.sc.softwareproduction.model.SoftwareWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SoftwareMapper {
    long countByExample(SoftwareExample example);

    int deleteByExample(SoftwareExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SoftwareWithBLOBs record);

    int insertSelective(SoftwareWithBLOBs record);

    List<SoftwareWithBLOBs> selectByExampleWithBLOBs(SoftwareExample example);

    List<Software> selectByExample(SoftwareExample example);

    SoftwareWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SoftwareWithBLOBs record, @Param("example") SoftwareExample example);

    int updateByExampleWithBLOBs(@Param("record") SoftwareWithBLOBs record, @Param("example") SoftwareExample example);

    int updateByExample(@Param("record") Software record, @Param("example") SoftwareExample example);

    int updateByPrimaryKeySelective(SoftwareWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SoftwareWithBLOBs record);

    int updateByPrimaryKey(Software record);
}