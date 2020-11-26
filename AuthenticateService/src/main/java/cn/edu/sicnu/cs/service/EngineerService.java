package cn.edu.sicnu.cs.service;

import cn.edu.sicnu.cs.model.Task;

import java.util.List;

public interface EngineerService {
    int FindSelfTaskCntByType(String uid, String type);

    int FindSelfWorkOrderCntByType(String uid, String type);

    List<Task> FindSelfTaskList(String uid);

    List<Task> FindSelfWorkOrderListByType(String uid, String s);

    List<Task> FindWorkOrderByWid(String wid);

    List<Task> FindTaskList(String uid);

    List<Task> FindTaskListByType(String uid, String type);

    Task FindTaskByTid(String uid);
}
