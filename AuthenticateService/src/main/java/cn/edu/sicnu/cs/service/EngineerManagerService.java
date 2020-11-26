package cn.edu.sicnu.cs.service;

import cn.edu.sicnu.cs.model.Workorders;
import cn.edu.sicnu.cs.pojo.engineer;

import java.util.List;
import java.util.Map;

public interface EngineerManagerService {

    List<engineer> FindEngineer();

    List<Workorders> selectWorkorders();

    void updateRoleByEngManager(String username,String rolename);
}
