package cn.edu.sicnu.sc.softwareproduction.dao;

import cn.edu.sicnu.sc.softwareproduction.model.Sysusergroup;
import cn.edu.sicnu.sc.softwareproduction.model.SysusergroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysusergroupMapper {
    long countByExample(SysusergroupExample example);

    int deleteByExample(SysusergroupExample example);

    int insert(Sysusergroup record);

    int insertSelective(Sysusergroup record);

    List<Sysusergroup> selectByExample(SysusergroupExample example);

    int updateByExampleSelective(@Param("record") Sysusergroup record, @Param("example") SysusergroupExample example);

    int updateByExample(@Param("record") Sysusergroup record, @Param("example") SysusergroupExample example);
}