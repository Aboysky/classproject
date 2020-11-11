package cn.edu.sicnu.sc.softwareproduction.dao;

import cn.edu.sicnu.sc.softwareproduction.model.Userorders;
import cn.edu.sicnu.sc.softwareproduction.model.UserordersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserordersMapper {
    long countByExample(UserordersExample example);

    int deleteByExample(UserordersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Userorders record);

    int insertSelective(Userorders record);

    List<Userorders> selectByExampleWithBLOBs(UserordersExample example);

    List<Userorders> selectByExample(UserordersExample example);

    Userorders selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Userorders record, @Param("example") UserordersExample example);

    int updateByExampleWithBLOBs(@Param("record") Userorders record, @Param("example") UserordersExample example);

    int updateByExample(@Param("record") Userorders record, @Param("example") UserordersExample example);

    int updateByPrimaryKeySelective(Userorders record);

    int updateByPrimaryKeyWithBLOBs(Userorders record);

    int updateByPrimaryKey(Userorders record);
}