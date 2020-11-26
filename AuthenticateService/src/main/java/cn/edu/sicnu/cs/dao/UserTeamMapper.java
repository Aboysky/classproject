package cn.edu.sicnu.cs.dao;

import cn.edu.sicnu.cs.model.UserTeam;
import cn.edu.sicnu.cs.model.UserTeamExample;
import java.util.List;

import cn.edu.sicnu.cs.pojo.UserInTeam;
import org.apache.ibatis.annotations.Param;

public interface UserTeamMapper {
    List<UserInTeam> selectTeamByName(String fzname);

    String selectFznameByUid(int uid);

    void insertUserTeam(int teamid,int userid,int days,float hours);

    long countByExample(UserTeamExample example);

    int deleteByExample(UserTeamExample example);

    int deleteByPrimaryKey(Long utid);

    int insert(UserTeam record);

    int insertSelective(UserTeam record);

    List<UserTeam> selectByExample(UserTeamExample example);

    UserTeam selectByPrimaryKey(Long utid);

    int updateByExampleSelective(@Param("record") UserTeam record, @Param("example") UserTeamExample example);

    int updateByExample(@Param("record") UserTeam record, @Param("example") UserTeamExample example);

    int updateByPrimaryKeySelective(UserTeam record);

    int updateByPrimaryKey(UserTeam record);
}