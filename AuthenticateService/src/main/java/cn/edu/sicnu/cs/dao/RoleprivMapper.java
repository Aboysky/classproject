package cn.edu.sicnu.cs.dao;

import cn.edu.sicnu.cs.model.Rolepriv;
import cn.edu.sicnu.cs.model.RoleprivExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface RoleprivMapper {
    long countByExample(RoleprivExample example);
    @Transactional
    int deleteByExample(RoleprivExample example);
    @Transactional
    int deleteByPrimaryKey(Integer rpid);
    @Transactional
    int insert(Rolepriv record);
    @Transactional
    int insertSelective(Rolepriv record);
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<Rolepriv> selectByExample(RoleprivExample example);
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    Rolepriv selectByPrimaryKey(Integer rpid);
    @Transactional
    int updateByExampleSelective(@Param("record") Rolepriv record, @Param("example") RoleprivExample example);
    @Transactional
    int updateByExample(@Param("record") Rolepriv record, @Param("example") RoleprivExample example);
    @Transactional
    int updateByPrimaryKeySelective(Rolepriv record);
    @Transactional
    int updateByPrimaryKey(Rolepriv record);
}