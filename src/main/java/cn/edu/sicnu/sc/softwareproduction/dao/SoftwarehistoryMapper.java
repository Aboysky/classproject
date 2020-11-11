package cn.edu.sicnu.sc.softwareproduction.dao;

import cn.edu.sicnu.sc.softwareproduction.model.Softwarehistory;
import cn.edu.sicnu.sc.softwareproduction.model.SoftwarehistoryExample;
import cn.edu.sicnu.sc.softwareproduction.model.SoftwarehistoryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SoftwarehistoryMapper {
    long countByExample(SoftwarehistoryExample example);

    int deleteByExample(SoftwarehistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SoftwarehistoryWithBLOBs record);

    int insertSelective(SoftwarehistoryWithBLOBs record);

    List<SoftwarehistoryWithBLOBs> selectByExampleWithBLOBs(SoftwarehistoryExample example);

    List<Softwarehistory> selectByExample(SoftwarehistoryExample example);

    SoftwarehistoryWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SoftwarehistoryWithBLOBs record, @Param("example") SoftwarehistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") SoftwarehistoryWithBLOBs record, @Param("example") SoftwarehistoryExample example);

    int updateByExample(@Param("record") Softwarehistory record, @Param("example") SoftwarehistoryExample example);

    int updateByPrimaryKeySelective(SoftwarehistoryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SoftwarehistoryWithBLOBs record);

    int updateByPrimaryKey(Softwarehistory record);
}