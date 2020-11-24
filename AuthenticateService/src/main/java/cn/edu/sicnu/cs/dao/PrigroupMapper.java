package cn.edu.sicnu.cs.dao;

import cn.edu.sicnu.cs.model.Prigroup;
import cn.edu.sicnu.cs.model.PrigroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface PrigroupMapper {
    long countByExample(PrigroupExample example);
    @Transactional
    int deleteByExample(PrigroupExample example);
    @Transactional
    int deleteByPrimaryKey(Integer pgid);
    @Transactional
    int insert(Prigroup record);
    @Transactional
    int insertSelective(Prigroup record);
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<Prigroup> selectByExample(PrigroupExample example);
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    Prigroup selectByPrimaryKey(Integer pgid);
    @Transactional
    int updateByExampleSelective(@Param("record") Prigroup record, @Param("example") PrigroupExample example);
    @Transactional
    int updateByExample(@Param("record") Prigroup record, @Param("example") PrigroupExample example);
    @Transactional
    int updateByPrimaryKeySelective(Prigroup record);
    @Transactional
    int updateByPrimaryKey(Prigroup record);
}