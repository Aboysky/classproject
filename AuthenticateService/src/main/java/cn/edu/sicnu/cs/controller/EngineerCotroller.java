package cn.edu.sicnu.cs.controller;


import cn.edu.sicnu.cs.model.Task;
import cn.edu.sicnu.cs.model.User;
import cn.edu.sicnu.cs.model.Workorders;
import cn.edu.sicnu.cs.service.TaskService;
import cn.edu.sicnu.cs.service.UserService;
import cn.edu.sicnu.cs.service.impl.EngineerServiceImpl;
import cn.edu.sicnu.cs.service.impl.TaskServiceImpl;
import cn.edu.sicnu.cs.utils.ResUtil;
import com.sun.jmx.snmp.tasks.TaskServer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/engineer/")
@Api(tags = "engineer",value = "工程师")
public class EngineerCotroller {


    @Autowired
    EngineerServiceImpl engineerService;

    @Autowired
    UserService userService;

    @GetMapping("task/cnt")
    @ApiOperation(value = "FindSelfTaskCnt",notes = "查询自己的任务数量")
    public String FindSelfTaskCnt(long uid){

        Map<String,Object> map = new HashMap<>();

        User user = userService.selectUserByUid((int)uid);
        map.put("username",user.getUsername());

        map.put("untreated",engineerService.FindSelfTaskCntByStatus(uid,"0")+engineerService.FindSelfTaskCntByStatus(uid,"1"));

        map.put("finished",engineerService.FindSelfTaskCntByStatus(uid,"2"));
        map.put("wprocessing",engineerService.FindSelfWorkOrderCntByStatus(uid,"1"));


        return ResUtil.getJsonStr(1, "成功", map);

    }

    @ApiOperation(value = "FindSelfTaskList",notes = "查询根据状态自己的任务列表")
    @GetMapping("task/list")
    public String FindSelfTaskList(long uid,long page,long pagenum,String status){
        List<Map<String,Object>> list =  engineerService.FindSelfTaskListByStatus(uid,page,pagenum,status);
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        return ResUtil.getJsonStr(1, "成功", map);
    }


//    @ApiOperation(value = "FindSelfWorkOrderList",notes = "查询自己关联的工单列表")
//    @GetMapping("order/list")
//    public List<Task> FindSelfWorkOrderList(long uid){
//
//        List<Task> list =  engineerService.FindSelfTaskList(uid);
//        return list ;
//
//    }

//    @ApiOperation(value = "FindDoingWorkOrderList",notes = "根据状态查询工单列表")
//    @GetMapping("order/list")
//    public List<Task> FindDoingWorkOrderList(String status){
//        List<Task> list =  engineerService.FindWorkOrderListByStatus(status);
//        return list ;
//    }


    @ApiOperation(value = "FindSelfWorkOrderList",notes = "根据状态查询自己关联的工单列表")
    @GetMapping("self/order/list")
    public String FindSelfWorkOrderListByType(long uid,long page,long pagenum,String status){
        List<Map<String,Object>> list =  engineerService.FindSelfWorkOrderListByStatus(uid,page,pagenum,status);

        Map<String,Object> map = new HashMap<>();

        map.put("list",list);
        return ResUtil.getJsonStr(1, "成功",map);
    }

    @ApiOperation(value = "FindWorkOrderByWid",notes = "查看工单详情")
    @GetMapping("order")
    public Workorders FindWorkOrderByWid(long wid){
        Workorders workorders =  engineerService.FindWorkOrderByWid(wid);
        return workorders ;
    }

//    @ApiOperation(value = "FindTaskList",notes = "查询自己的任务列表")
//    @GetMapping("task/list/{uid}")
//    public List<Task> FindTaskList(@PathVariable String uid){
//        List<Task> list =  engineerService.FindTaskList(uid);
//        return list ;
//    }

//    @ApiOperation(value = "FindTaskListByType",notes = "根据状态查询自己的任务列表")
//    @GetMapping("task/list/{uid}/{type}")
//    public List<Task> FindTaskListByType(@PathVariable String uid,@PathVariable String type){
//        List<Task> list =  engineerService.FindTaskListByType(uid,type);
//        return list ;
//    }

//    @ApiOperation(value = "FindTaskByTid",notes = "根据状态查询自己的任务列表")
//    @GetMapping("task/{uid}")
//    public Task FindTaskByTid(@PathVariable String uid){
//        Task task=  engineerService.FindTaskByTid(uid);
//        return task ;
//    }


    @Autowired
    TaskServiceImpl taskServiceImpl;

    @ApiOperation(value = "FinishTaskByTid",notes = "完成任务")
    @PostMapping("task/finish")
    @ResponseBody
    public Map<String,Object> FinishTaskByTid(long uid,@RequestBody Map<String, Object> map) throws Exception {

        Map<String,Object> result = new HashMap<>();
        if(map != null){
            Task task = getObject(map,Task.class);
            task.setTassignedtoId((int)uid);
            taskServiceImpl.FinishTask(task);
            result.put("","1");
        }
        return result ;
    }

    //将前端返回来的map里面的value封入实体类中
    public <T>T getObject(Map<String,Object> map, Class<T> c) throws Exception {
        T t = c.getDeclaredConstructor().newInstance();//创建一个一个类型为T对象t
        //1.拆开map
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        for (Map.Entry<String, Object> entry : entries) {//获取集合里面的元素
            String key = entry.getKey();//得到key的值（类T的的成员属性）
            //2.将map中的值存入T这个类的对象属性中
            Field f = c.getDeclaredField(key);//获取类的所有字段
            f.setAccessible(true);//简单的理解：设置访问权限
            f.set(t,entry.getValue());//给T对象赋值
        }
        return t;
    }

}
