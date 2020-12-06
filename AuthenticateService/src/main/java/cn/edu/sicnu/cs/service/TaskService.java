package cn.edu.sicnu.cs.service;

import cn.edu.sicnu.cs.model.Task;

public interface TaskService {

    void FinishTask(Task task);

    void UpdateTask(Task task);

    void BeginTaskByTid(long tid);
}
