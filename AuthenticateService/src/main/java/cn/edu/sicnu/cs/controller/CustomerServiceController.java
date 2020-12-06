package cn.edu.sicnu.cs.controller;


import cn.edu.sicnu.cs.anotations.Log;
import cn.edu.sicnu.cs.model.User;
import cn.edu.sicnu.cs.model.Userform;
import cn.edu.sicnu.cs.model.Workorders;
import cn.edu.sicnu.cs.service.FeedBackService;
import cn.edu.sicnu.cs.service.impl.CustomersServiceServiceImpl;

import cn.edu.sicnu.cs.service.UserService;
import cn.edu.sicnu.cs.service.impl.WorkOrdersServiceImpl;
import cn.edu.sicnu.cs.utils.ResUtil;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@Api(tags = "CustomersService",value = "客服")
@RequestMapping("/customer/")
public class CustomerServiceController {

    @Autowired
    private CustomersServiceServiceImpl customersServiceService;

    @Autowired
    FeedBackService feedBackService;

    @Autowired
    UserService userService;

    @GetMapping("index/userform/cnt")
    @ResponseBody
    @ApiOperation(value = "TodayUserFormCnt",notes = "查询对应状态的任务数量")
    @Log("查询对应状态的任务数量")
    public String TodayUserFormCnt(long cid){

        Map<String,Object> map = new HashMap<>();

        User user = userService.selectUserByUid((int)cid);
        map.put("username",user.getUsername());

        map.put("untreated",customersServiceService.TodayUserFormCnt(cid,"0"));
        map.put("processing",customersServiceService.TodayUserFormCnt(cid,"1"));
        map.put("finished",customersServiceService.TodayUserFormCnt(cid,"2"));
        return ResUtil.getJsonStr(1, "成功", map);
    }

    //

    @ApiOperation(value = "FindSelfTaskList",notes = "查询根据状态自己的任务列表")
    @GetMapping("statistics")
    @Log("查询根据状态自己的任务列表")
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
    //

    @GetMapping("index/today/untreated/userform/list")
    @ResponseBody
    @ApiOperation(value = "FindTodayUntreatedUserFormListByCid",notes = "查询对应状态的表单列表")
    @Log("查询对应状态的表单列表")
    public String FindUserFormList(long cid,long page,long pagenum,String status) {


        Map<String, Object> map = new HashMap<>();
        map.put("total", customersServiceService.FindUserFormCnt(cid, status));
        map.put("list", customersServiceService.FindUserFormList(cid, page, pagenum, status));


        return ResUtil.getJsonStr(1, "成功", map);
    }

//


    @GetMapping("form/userform")
    @ResponseBody
    @ApiOperation(value = "FindUserFormByFid",notes = "查看表单详情")
    @Log("查看表单详情")
    public String FindUserFormByFid(long fid){

        Map<String,Object> map = new HashMap<>();
        map.put("details",customersServiceService.FindUserFormByFid(fid));
        return ResUtil.getJsonStr(1, "成功", map);
    }

//


    @Autowired
    private WorkOrdersServiceImpl workOrdersService;

    @PostMapping("form/submit/workorder")
    @ApiOperation(value = "WorkOrderSubmit",notes = "提交工单")
    @Log("提交工单")
    public String WorkOrderSubmit(HttpServletRequest request) throws Exception {
        String body = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
        if (StringUtils.hasText(body)){
            Workorders workorders = JSON.parseObject(body,Workorders.class);
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

            workOrdersService.InsertWorkOrder(workorders);
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

    @GetMapping("self/workorder/list")
    @ResponseBody
    @ApiOperation(value = "FindSelfWorkOrderSubmit",notes = "查看自己提交工单列表")
    @Log("查看自己提交工单列表")
    public String FindSelfWorkOrderSubmit(long cid,long page,long pagenum) {


        List<Map<String,Object>> list =  workOrdersService.FindSelfWorkOrderSubmit(cid,page,pagenum);
        long total = workOrdersService.FindSelfWorkOrderSubmitCnt(cid);
        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        map.put("total",total);
        return ResUtil.getJsonStr(1, "成功",map);
    }

    @GetMapping("self/workorder")
    @ResponseBody
    @ApiOperation(value = "FindSelfWorkOrder",notes = "查看工单详情")
    @Log("查看工单详情")
    public String FindSelfWorkOrder(long wid) {
        Workorders workorders =  workOrdersService.FindWorkOrder(wid);
        Map<String,Object> map = new HashMap<>();
        map.put("details",workorders);
        return ResUtil.getJsonStr(1, "成功",map);
    }

}
