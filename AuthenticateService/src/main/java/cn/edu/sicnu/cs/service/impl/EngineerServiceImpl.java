package cn.edu.sicnu.cs.service.impl;


import cn.edu.sicnu.cs.service.EngineerService;
import cn.edu.sicnu.cs.model.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineerServiceImpl implements EngineerService {
    @Override
    public int FindSelfTaskCntByType(String uid, String type) {
        return 0;
    }

    @Override
    public int FindSelfWorkOrderCntByType(String uid, String type) {
        return 0;
    }

    @Override
    public List<Task> FindSelfTaskList(String uid) {
        return null;
    }

    @Override
    public List<Task> FindSelfWorkOrderListByType(String uid, String s) {
        return null;
    }

    @Override
    public List<Task> FindWorkOrderByWid(String wid) {
        return null;
    }

    @Override
    public List<Task> FindTaskList(String uid) {
        return null;
    }

    @Override
    public List<Task> FindTaskListByType(String uid, String type) {
        return null;
    }

    @Override
    public Task FindTaskByTid(String uid) {
        return null;
    }
}
