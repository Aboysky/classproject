package cn.edu.sicnu.sc.softwareproduction.dao;

import cn.edu.sicnu.sc.softwareproduction.model.Userview;
import cn.edu.sicnu.sc.softwareproduction.model.UserviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserviewMapper {
    long countByExample(UserviewExample example);

    int deleteByExample(UserviewExample example);

    int insert(Userview record);

    int insertSelective(Userview record);

    List<Userview> selectByExampleWithBLOBs(UserviewExample example);

    List<Userview> selectByExample(UserviewExample example);

    int updateByExampleSelective(@Param("record") Userview record, @Param("example") UserviewExample example);

    int updateByExampleWithBLOBs(@Param("record") Userview record, @Param("example") UserviewExample example);

    int updateByExample(@Param("record") Userview record, @Param("example") UserviewExample example);
}