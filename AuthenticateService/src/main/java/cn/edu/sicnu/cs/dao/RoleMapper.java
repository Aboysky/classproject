package cn.edu.sicnu.cs.dao;

import cn.edu.sicnu.cs.model.Role;
import cn.edu.sicnu.cs.model.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface RoleMapper {
    long countByExample(RoleExample example);
    @Transactional
    int deleteByExample(RoleExample example);
    @Transactional
    int deleteByPrimaryKey(Integer rid);
    @Transactional
    int insert(Role record);
    @Transactional
    int insertSelective(Role record);
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<Role> selectByExample(RoleExample example);
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    Role selectByPrimaryKey(Integer rid);
    @Transactional
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);
    @Transactional
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);
    @Transactional
    int updateByPrimaryKeySelective(Role record);
    @Transactional
    int updateByPrimaryKey(Role record);
}