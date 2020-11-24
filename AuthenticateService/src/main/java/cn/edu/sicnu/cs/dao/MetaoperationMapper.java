package cn.edu.sicnu.cs.dao;

import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.MetaoperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface MetaoperationMapper {
    long countByExample(MetaoperationExample example);
    @Transactional
    int deleteByExample(MetaoperationExample example);
    @Transactional
    int deleteByPrimaryKey(Integer moid);
    @Transactional
    int insert(Metaoperation record);
    @Transactional
    int insertSelective(Metaoperation record);
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<Metaoperation> selectByExample(MetaoperationExample example);
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    Metaoperation selectByPrimaryKey(Integer moid);
    @Transactional
    int updateByExampleSelective(@Param("record") Metaoperation record, @Param("example") MetaoperationExample example);
    @Transactional
    int updateByExample(@Param("record") Metaoperation record, @Param("example") MetaoperationExample example);
    @Transactional
    int updateByPrimaryKeySelective(Metaoperation record);
    @Transactional
    int updateByPrimaryKey(Metaoperation record);
}