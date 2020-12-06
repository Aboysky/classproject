package cn.edu.sicnu.cs.service.impl;

import cn.edu.sicnu.cs.dao.TaskMapper;
import cn.edu.sicnu.cs.model.Task;
import cn.edu.sicnu.cs.model.TaskExample;
import cn.edu.sicnu.cs.service.TaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TaskServiceImpl implements TaskService {

    @Resource
    TaskMapper taskMapper;

    @Override
    public void FinishTask(Task task) {
        taskMapper.updateByPrimaryKeySelective(task);
    }

    @Override
    public void UpdateTask(Task task) {
        taskMapper.updateByPrimaryKeySelective(task);
    }

    @Override
    public void BeginTaskByTid(long tid) {

        TaskExample taskExample = new TaskExample();
        taskExample.createCriteria()
                .andTidEqualTo(tid);
        Task task = new Task();
        task.setTstatus("1");
        taskMapper.updateByExampleSelective(task,taskExample);
    }
}
