package cn.edu.sicnu.cs.service.impl;

import cn.edu.sicnu.cs.dao.TeamMapper;
import cn.edu.sicnu.cs.dao.UserMapper;
import cn.edu.sicnu.cs.dao.UserTeamMapper;
import cn.edu.sicnu.cs.model.UserTeamExample;
import cn.edu.sicnu.cs.pojo.UserInTeam;
import cn.edu.sicnu.cs.service.UserTeamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserTeamServiceimpl implements UserTeamService {

    @Resource
    UserTeamMapper userTeamMapper;

    @Resource
    UserMapper userMapper;

    @Resource
    TeamMapper teamMapper;

    @Override
    public List<UserInTeam> findTeamByName(String name) {

        List<UserInTeam> userTeams = userTeamMapper.selectTeamByName(name);
        return userTeams;
    }

    @Override
    public int insertUserTeam(String fzname, String username, int days, float hours) {
        int teamid = teamMapper.selectTeidByFzname(fzname);
        int userid = userMapper.selectUidByUsername(username);
        userTeamMapper.insertUserTeam(teamid,userid,days,hours);
        return 1;
    }

    @Override
    public int deleteUserTeam(String fzname, String username) {
        int teamid = teamMapper.selectTeidByFzname(fzname);
        int userid = userMapper.selectUidByUsername(username);
        UserTeamExample userTeamExample = new UserTeamExample();
        UserTeamExample.Criteria criteria = userTeamExample.createCriteria();
        criteria.andUtTidEqualTo(teamid);
        criteria.andUtUidEqualTo(userid);
        userTeamMapper.deleteByExample(userTeamExample);
        return 1;
    }

}
