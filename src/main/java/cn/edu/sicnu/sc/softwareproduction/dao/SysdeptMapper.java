package cn.edu.sicnu.sc.softwareproduction.dao;

import cn.edu.sicnu.sc.softwareproduction.model.Sysdept;
import cn.edu.sicnu.sc.softwareproduction.model.SysdeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysdeptMapper {
    long countByExample(SysdeptExample example);

    int deleteByExample(SysdeptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sysdept record);

    int insertSelective(Sysdept record);

    List<Sysdept> selectByExample(SysdeptExample example);

    Sysdept selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sysdept record, @Param("example") SysdeptExample example);

    int updateByExample(@Param("record") Sysdept record, @Param("example") SysdeptExample example);

    int updateByPrimaryKeySelective(Sysdept record);

    int updateByPrimaryKey(Sysdept record);
}