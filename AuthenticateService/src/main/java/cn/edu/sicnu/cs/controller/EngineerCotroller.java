package cn.edu.sicnu.cs.controller;


import cn.edu.sicnu.cs.model.Task;
import cn.edu.sicnu.cs.service.impl.EngineerServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/engineer/")
@Api(tags = "engineer",value = "工程师")
public class EngineerCotroller {


    @Autowired
    EngineerServiceImpl engineerService;

    @GetMapping("index/task/cnt")
    @ApiOperation(value = "FindSelfTaskCntByType",notes = "查询自己的任务数量")
    public Map<String,Object> FindSelfTaskCntByType(String uid){

        Map<String,Object> map = new HashMap<>();
        map.put("untrated",engineerService.FindSelfTaskCntByType(uid,"0"));
        map.put("processing",engineerService.FindSelfTaskCntByType(uid,"1"));
        map.put("finished",engineerService.FindSelfTaskCntByType(uid,"2"));
        map.put("",engineerService.FindSelfWorkOrderCntByType(uid,"2"));

        return map;

    }

    @ApiOperation(value = "FindSelfTaskList",notes = "查询自己正在参与的未完成的任务列表")
    @GetMapping("index/task/list/{uid}")
    public List<Task> FindSelfTaskList(@PathVariable String uid){
        List<Task> list =  engineerService.FindSelfTaskList(uid);
        return list ;
    }

    @ApiOperation(value = "FindDoingWorkOrderList",notes = "查询自己正在参与的未完成的工单列表")
    @GetMapping("index/order/list/{uid}")
    public List<Task> FindDoingWorkOrderList(@PathVariable String uid){
        List<Task> list =  engineerService.FindSelfWorkOrderListByType(uid,"2");
        return list ;
    }


    @ApiOperation(value = "FindSelfWorkOrderList",notes = "查询自己关联的工单列表")
    @GetMapping("order/list/{uid}")
    public List<Task> FindSelfWorkOrderList(@PathVariable String uid){

        List<Task> list =  engineerService.FindSelfTaskList(uid);
        return list ;

    }

    @ApiOperation(value = "FindSelfWorkOrderList",notes = "根据状态查询自己关联的工单列表")
    @GetMapping("order/list/{uid}/{type}")
    public List<Task> FindSelfWorkOrderListByType(@PathVariable String uid,@PathVariable String type){
        List<Task> list =  engineerService.FindSelfWorkOrderListByType(uid,type);
        return list ;
    }

    @ApiOperation(value = "FindWorkOrderByWid",notes = "查看工单详情")
    @GetMapping("order/{wid}")
    public List<Task> FindWorkOrderByWid(@PathVariable String wid){
        List<Task> list =  engineerService.FindWorkOrderByWid(wid);
        return list ;
    }

    @ApiOperation(value = "FindTaskList",notes = "查询自己的任务列表")
    @GetMapping("task/list/{uid}")
    public List<Task> FindTaskList(@PathVariable String uid){
        List<Task> list =  engineerService.FindTaskList(uid);
        return list ;
    }

    @ApiOperation(value = "FindTaskListByType",notes = "根据状态查询自己的任务列表")
    @GetMapping("task/list/{uid}/{type}")
    public List<Task> FindTaskListByType(@PathVariable String uid,@PathVariable String type){
        List<Task> list =  engineerService.FindTaskListByType(uid,type);
        return list ;
    }

    @ApiOperation(value = "FindTaskByTid",notes = "根据状态查询自己的任务列表")
    @GetMapping("task/{uid}")
    public Task FindTaskByTid(@PathVariable String uid){
        Task task=  engineerService.FindTaskByTid(uid);
        return task ;
    }

    @ApiOperation(value = "FinishTaskByTid",notes = "完成任务")
    @PostMapping("task/finish/{uid}")
    public Task FinishTaskByTid(@PathVariable String uid,@RequestBody Map<String, Object> map){
        Task task=  new Task();

        return task ;
    }
    @ApiOperation(value = "UpdateTaskByTid",notes = "完成任务")
    @PostMapping("task/update/{uid}")
    public Task UpdateTaskByTid(@PathVariable String uid,@RequestBody Map<String, Object> map){
        Task task=  new Task();

        return task ;
    }
}
