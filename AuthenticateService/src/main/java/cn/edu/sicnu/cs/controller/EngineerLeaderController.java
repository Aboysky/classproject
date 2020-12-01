package cn.edu.sicnu.cs.controller;


import cn.edu.sicnu.cs.dao.TaskMapper;
import cn.edu.sicnu.cs.model.Workorders;
import cn.edu.sicnu.cs.pojo.UserInTeam;
import cn.edu.sicnu.cs.service.EngineerManagerService;
import cn.edu.sicnu.cs.service.UserTeamService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Classname EngineerLeaderController
 * @Description TODO
 * @Date 2020/11/22 10:23
 * @Created by Songyz
 */
@Controller
@Api(tags = "EngineerLeader",value = "工程师负责人")
@RequestMapping("/engleader")
public class EngineerLeaderController {
    @Resource
    UserTeamService userTeamService;

    @Resource
    EngineerManagerService engineerManagerService;

    @Resource
    TaskMapper taskMapper;

    @GetMapping("/index")
    @ApiOperation(value = "GetIndex",notes = "页面数据")
    @ResponseBody
    public List<UserInTeam> getindex(String fzname){
        List<UserInTeam> userteams = userTeamService.findTeamByName(fzname);
        return userteams;
    }

    @PostMapping("/index/add")
    @ApiOperation(value = "AddUserToTeam",notes = "添加成员")
    @ResponseBody
    public int AddUserToTeam(String fzname,String username,int days,float hours){
        int result = userTeamService.insertUserTeam(fzname, username, days, hours);
        return result;
    }

    @PostMapping("/index/delete")
    @ApiOperation(value = "DeleteUserFromTeam",notes = "删除成员")
    @ResponseBody
    public int DeleteUserFromTeam(String fzname,String username){
        int result = userTeamService.deleteUserTeam(fzname,username);
        return result;
    }


    @PostMapping("/addtask")
    @ApiOperation(value = "AddTask",notes = "添加任务")
    @ResponseBody
    public void AddTask(@RequestBody Map<String,Object> tasks) throws Exception {
//        for (int i = 0; i < tasks.size(); i++) {
//            if (tasks != null) {
//                Task task = getObject(tasks.get(i), Task.class);
//                taskMapper.insert(task);
//            }
//        }
    }

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
