package cn.edu.sicnu.sc.softwareproduction.dao;

import cn.edu.sicnu.sc.softwareproduction.model.Sysuserquery;
import cn.edu.sicnu.sc.softwareproduction.model.SysuserqueryExample;
import cn.edu.sicnu.sc.softwareproduction.model.SysuserqueryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysuserqueryMapper {
    long countByExample(SysuserqueryExample example);

    int deleteByExample(SysuserqueryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysuserqueryWithBLOBs record);

    int insertSelective(SysuserqueryWithBLOBs record);

    List<SysuserqueryWithBLOBs> selectByExampleWithBLOBs(SysuserqueryExample example);

    List<Sysuserquery> selectByExample(SysuserqueryExample example);

    SysuserqueryWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysuserqueryWithBLOBs record, @Param("example") SysuserqueryExample example);

    int updateByExampleWithBLOBs(@Param("record") SysuserqueryWithBLOBs record, @Param("example") SysuserqueryExample example);

    int updateByExample(@Param("record") Sysuserquery record, @Param("example") SysuserqueryExample example);

    int updateByPrimaryKeySelective(SysuserqueryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysuserqueryWithBLOBs record);

    int updateByPrimaryKey(Sysuserquery record);
}