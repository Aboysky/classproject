package cn.edu.sicnu.sc.softwareproduction.dao;

import cn.edu.sicnu.sc.softwareproduction.model.Softwarefile;
import cn.edu.sicnu.sc.softwareproduction.model.SoftwarefileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SoftwarefileMapper {
    long countByExample(SoftwarefileExample example);

    int deleteByExample(SoftwarefileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Softwarefile record);

    int insertSelective(Softwarefile record);

    List<Softwarefile> selectByExample(SoftwarefileExample example);

    Softwarefile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Softwarefile record, @Param("example") SoftwarefileExample example);

    int updateByExample(@Param("record") Softwarefile record, @Param("example") SoftwarefileExample example);

    int updateByPrimaryKeySelective(Softwarefile record);

    int updateByPrimaryKey(Softwarefile record);
}