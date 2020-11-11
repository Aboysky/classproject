package cn.edu.sicnu.sc.softwareproduction.dao;

import cn.edu.sicnu.sc.softwareproduction.model.Grouppriv;
import cn.edu.sicnu.sc.softwareproduction.model.GroupprivExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupprivMapper {
    long countByExample(GroupprivExample example);

    int deleteByExample(GroupprivExample example);

    int insert(Grouppriv record);

    int insertSelective(Grouppriv record);

    List<Grouppriv> selectByExample(GroupprivExample example);

    int updateByExampleSelective(@Param("record") Grouppriv record, @Param("example") GroupprivExample example);

    int updateByExample(@Param("record") Grouppriv record, @Param("example") GroupprivExample example);
}