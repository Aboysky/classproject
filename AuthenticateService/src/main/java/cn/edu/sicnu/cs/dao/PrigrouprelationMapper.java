package cn.edu.sicnu.cs.dao;

import cn.edu.sicnu.cs.model.PrigrouprelationExample;
import cn.edu.sicnu.cs.model.PrigrouprelationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface PrigrouprelationMapper {
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    long countByExample(PrigrouprelationExample example);
    @Transactional
    int deleteByExample(PrigrouprelationExample example);
    @Transactional
    int deleteByPrimaryKey(PrigrouprelationKey key);
    @Transactional
    int insert(PrigrouprelationKey record);
    @Transactional
    int insertSelective(PrigrouprelationKey record);
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<PrigrouprelationKey> selectByExample(PrigrouprelationExample example);
    @Transactional
    int updateByExampleSelective(@Param("record") PrigrouprelationKey record, @Param("example") PrigrouprelationExample example);
    @Transactional
    int updateByExample(@Param("record") PrigrouprelationKey record, @Param("example") PrigrouprelationExample example);
}