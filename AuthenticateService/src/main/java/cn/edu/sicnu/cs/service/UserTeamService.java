package cn.edu.sicnu.cs.service;

import cn.edu.sicnu.cs.pojo.UserInTeam;

import java.util.List;

public interface UserTeamService {

    List<UserInTeam> findTeamByName(String name);

    int insertUserTeam(String fzname,String username,int days,float hours);

    int deleteUserTeam(String fzname,String username);
}
