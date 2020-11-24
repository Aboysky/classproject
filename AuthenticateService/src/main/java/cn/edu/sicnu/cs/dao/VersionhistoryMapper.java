package cn.edu.sicnu.cs.dao;

import cn.edu.sicnu.cs.model.Versionhistory;
import cn.edu.sicnu.cs.model.VersionhistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VersionhistoryMapper {
    long countByExample(VersionhistoryExample example);

    int deleteByExample(VersionhistoryExample example);

    int deleteByPrimaryKey(Integer vid);

    int insert(Versionhistory record);

    int insertSelective(Versionhistory record);

    List<Versionhistory> selectByExampleWithBLOBs(VersionhistoryExample example);

    List<Versionhistory> selectByExample(VersionhistoryExample example);

    Versionhistory selectByPrimaryKey(Integer vid);

    int updateByExampleSelective(@Param("record") Versionhistory record, @Param("example") VersionhistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") Versionhistory record, @Param("example") VersionhistoryExample example);

    int updateByExample(@Param("record") Versionhistory record, @Param("example") VersionhistoryExample example);

    int updateByPrimaryKeySelective(Versionhistory record);

    int updateByPrimaryKeyWithBLOBs(Versionhistory record);

    int updateByPrimaryKey(Versionhistory record);

    List<Versionhistory> findVersionHistoryVBIG();

    List<Versionhistory> findVersionHistoryListByVBIG();

    List<Versionhistory> findVersionHistoryByVersion(String version);
}