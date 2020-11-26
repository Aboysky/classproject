package cn.edu.sicnu.cs.dao;

import cn.edu.sicnu.cs.model.Userform;
import cn.edu.sicnu.cs.model.UserformExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserformMapper {

    List<Userform> todayUserFormCnt(long cid,String type,String today);

    List<Map<String,Object>> findUserFormList(long cid, long page, long pagenum, String status);

    long countByExample(UserformExample example);

    int deleteByExample(UserformExample example);

    int deleteByPrimaryKey(Long fzid);

    int insert(Userform record);

    int insertSelective(Userform record);

    List<Userform> selectByExampleWithBLOBs(UserformExample example);

    List<Userform> selectByExample(UserformExample example);

    Userform selectByPrimaryKey(Long fzid);

    int updateByExampleSelective(@Param("record") Userform record, @Param("example") UserformExample example);

    int updateByExampleWithBLOBs(@Param("record") Userform record, @Param("example") UserformExample example);

    int updateByExample(@Param("record") Userform record, @Param("example") UserformExample example);

    int updateByPrimaryKeySelective(Userform record);

    int updateByPrimaryKeyWithBLOBs(Userform record);

    int updateByPrimaryKey(Userform record);

    List<Map<String,Object>> findHotUserFormList(String page);

    List<Userform> findSelfUserFormList(String uid);

    long findUserFormCnt(long cid, String status);
}