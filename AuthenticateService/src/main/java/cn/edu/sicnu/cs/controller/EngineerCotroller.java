package cn.edu.sicnu.cs.controller;


import cn.edu.sicnu.cs.anotations.Log;
import cn.edu.sicnu.cs.model.Task;
import cn.edu.sicnu.cs.model.User;
import cn.edu.sicnu.cs.model.Userform;
import cn.edu.sicnu.cs.model.Workorders;
import cn.edu.sicnu.cs.service.EngineerService;

import cn.edu.sicnu.cs.service.FeedBackService;
import cn.edu.sicnu.cs.service.TaskService;
import cn.edu.sicnu.cs.service.UserService;
import cn.edu.sicnu.cs.service.impl.TaskServiceImpl;
import cn.edu.sicnu.cs.utils.ResUtil;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/engineer/")
@Api(tags = "engineer",value = "工程师")
public class EngineerCotroller {


    @Autowired
    EngineerService engineerService;

    @Autowired
    FeedBackService feedBackService;

    @Autowired
    TaskService taskService;

    @Autowired
    UserService userService;

    @GetMapping("task/cnt")
    @ApiOperation(value = "FindSelfTaskCnt",notes = "查询自己的任务数量")
    @Log("查询自己的任务数量")
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
    @Log("查询根据状态自己的任务列表")
    public String FindSelfTaskList(long uid,long page,long pagenum,String status){
        Map<String,Object> map = new HashMap<>();
        if(status != "4"){
        List<Map<String,Object>> list =  engineerService.FindSelfTaskListByStatus(uid,page,pagenum,status);
        long total = engineerService.FindSelfTaskListByStatusCnt(uid,status);
        map.put("list",list);
        map.put("total",total);
        }
        else{
            List <Map<String,Object>> list = engineerService.FindAllSelfTaskList(uid,page,pagenum);
            long total = engineerService.FindAllSelfTaskListCnt(uid);
            map.put("list",list);
            map.put("total",total);
        }
        return ResUtil.getJsonStr(1, "成功", map);
    }


    @ApiOperation(value = "StatisticsCnt",notes = "查询根据状态自己的任务数量")
    @GetMapping("statistics")
    @Log("查询根据状态自己的任务数量")
    public String StatisticsCnt(long uid){
        long youth =  feedBackService.StatisticsYouthCnt(uid);
        long week = feedBackService.StatisticsWeekCnt(uid);
        long total = feedBackService.StatisticsTotalCnt(uid);

        Map<String,Object> map = new HashMap<>();


        map.put("youth",youth);
        map.put("week",week);
        map.put("total",total);
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
    @Log("根据状态查询自己关联的工单列表")
    public String FindSelfWorkOrderListByType(long uid,long page,long pagenum,String status){
        List<Map<String,Object>> list =  engineerService.FindSelfWorkOrderListByStatus(uid,page,pagenum,status);
        long total = engineerService.FindSelfWorkOrderCntByStatus(uid,status);
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        map.put("total",total);
        return ResUtil.getJsonStr(1, "成功",map);
    }

    @ApiOperation(value = "FindWorkOrderByWid",notes = "查看工单详情")
    @GetMapping("order")
    @Log("查看工单详情")
    public String FindWorkOrderByWid(long wid){
        Workorders workorders =  engineerService.FindWorkOrderByWid(wid);
        Map<String,Object> map = new HashMap<>();
        map.put("detail",workorders);
        return ResUtil.getJsonStr(1,"成功",map) ;
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

    @ApiOperation(value = "BeginTaskByTid",notes = "开始任务")
    @PostMapping("task/begin")
    @ResponseBody
    @Log("开始任务")
    public String BeginTaskByTid(long tid){

        taskService.BeginTaskByTid(tid);
        return ResUtil.getJsonStr(1, "成功");
    }

    @ApiOperation(value = "FinishTaskByTid",notes = "完成任务")
    @PostMapping("task/finish")
    @ResponseBody
    @Log("完成任务")
    public String FinishTaskByTid(long tid,long uid, HttpServletRequest request) throws Exception {

        String body = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
        if (StringUtils.hasText(body)){
            Task task = JSON.parseObject(body,Task.class);
            System.out.println(body);

//            long fid = 20201129;
//            userform.setFid(fid);
//            //还需要一个分配id的函数、
//
//            int userid = 123;
//            userform.setFassignedtoId(userid);
//            //还需要一个随机分配给客服的函数
//
//            //插入当天的时间
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            String today = sdf.format(new Date());
//            Date day = new Date();
//            day.equals(today);
//            userform.setFcreatetime(day);

            //还需要判断很多字段的插入

            taskService.UpdateTask(task);
            return ResUtil.getJsonStr(1, "成功");
        }else{
            return ResUtil.getJsonStr(0, "失败");
        }
    }

//    //将前端返回来的map里面的value封入实体类中
//    public <T>T getObject(Map<String,Object> map, Class<T> c) throws Exception {
//        T t = c.getDeclaredConstructor().newInstance();//创建一个一个类型为T对象t
//        //1.拆开map
//        Set<Map.Entry<String, Object>> entries = map.entrySet();
//        for (Map.Entry<String, Object> entry : entries) {//获取集合里面的元素
//            String key = entry.getKey();//得到key的值（类T的的成员属性）
//            //2.将map中的值存入T这个类的对象属性中
//            Field f = c.getDeclaredField(key);//获取类的所有字段
//            f.setAccessible(true);//简单的理解：设置访问权限
//            f.set(t,entry.getValue());//给T对象赋值
//        }
//        return t;
//    }

}
