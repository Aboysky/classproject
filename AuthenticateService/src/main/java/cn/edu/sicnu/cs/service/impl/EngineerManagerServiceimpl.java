package cn.edu.sicnu.cs.service.impl;

import cn.edu.sicnu.cs.dao.UserMapper;
import cn.edu.sicnu.cs.dao.UserTeamMapper;
import cn.edu.sicnu.cs.dao.WorkordersMapper;
import cn.edu.sicnu.cs.model.Workorders;
import cn.edu.sicnu.cs.pojo.engineer;
import cn.edu.sicnu.cs.service.EngineerManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EngineerManagerServiceimpl implements EngineerManagerService {

    @Resource
    UserMapper userMapper;

    @Resource
    WorkordersMapper workordersMapper;

    @Resource
    UserTeamMapper userTeamMapper;
    @Override
    public List<engineer> FindEngineer() {
        List<engineer> engineers = userMapper.selectUidByRolename("工程师");
        engineers.addAll(userMapper.selectUidByRolename("负责人"));
        for(int i = 0;i < engineers.size();i++){
            int uid = engineers.get(i).getUid();
            engineers.get(i).setFzname(userTeamMapper.selectFznameByUid(uid));
        }
        return engineers;
    }

    @Override
    public List<Workorders> selectWorkorders() {
        List<Workorders> workorders1 = workordersMapper.selectByStatus("2");
        List<Workorders> workorders2 = workordersMapper.selectByStatus("3");
        workorders1.addAll(workorders2);
        return workorders1;
    }

    @Override
    public void updateRoleByEngManager(String username, String rolename) {
        userMapper.updateRoleByUsername(username,rolename);
    }
}
