package cn.edu.sicnu.sc.softwareproduction.dao;

import cn.edu.sicnu.sc.softwareproduction.model.Usercontact;
import cn.edu.sicnu.sc.softwareproduction.model.UsercontactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsercontactMapper {
    long countByExample(UsercontactExample example);

    int deleteByExample(UsercontactExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Usercontact record);

    int insertSelective(Usercontact record);

    List<Usercontact> selectByExampleWithBLOBs(UsercontactExample example);

    List<Usercontact> selectByExample(UsercontactExample example);

    Usercontact selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Usercontact record, @Param("example") UsercontactExample example);

    int updateByExampleWithBLOBs(@Param("record") Usercontact record, @Param("example") UsercontactExample example);

    int updateByExample(@Param("record") Usercontact record, @Param("example") UsercontactExample example);

    int updateByPrimaryKeySelective(Usercontact record);

    int updateByPrimaryKeyWithBLOBs(Usercontact record);

    int updateByPrimaryKey(Usercontact record);
}