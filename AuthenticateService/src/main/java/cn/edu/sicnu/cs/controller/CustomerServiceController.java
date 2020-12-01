package cn.edu.sicnu.cs.controller;


import cn.edu.sicnu.cs.model.User;
import cn.edu.sicnu.cs.model.Userform;
import cn.edu.sicnu.cs.model.Workorders;
import cn.edu.sicnu.cs.service.impl.CustomersServiceServiceImpl;

import cn.edu.sicnu.cs.service.UserService;
import cn.edu.sicnu.cs.service.impl.WorkOrdersServiceImpl;
import cn.edu.sicnu.cs.utils.ResUtil;
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

@Controller
@Api(tags = "CustomersService",value = "客服")
@RequestMapping("/customer/")
public class CustomerServiceController {

    @Autowired
    private CustomersServiceServiceImpl customersServiceService;

    @Autowired
    UserService userService;

    @GetMapping("index/userform/cnt")
    @ResponseBody
    @ApiOperation(value = "TodayUserFormCnt",notes = "查询对应状态的任务数量")
    public String TodayUserFormCnt(long cid){

        Map<String,Object> map = new HashMap<>();

        User user = userService.selectUserByUid((int)cid);
        map.put("username",user.getUsername());
        map.put("untreated",customersServiceService.TodayUserFormCnt(cid,"0"));
        map.put("processing",customersServiceService.TodayUserFormCnt(cid,"1"));
        map.put("finished",customersServiceService.TodayUserFormCnt(cid,"2"));


        return ResUtil.getJsonStr(1,"成功",map);
    }

    //


    @GetMapping("index/today/untreated/userform/list")
    @ResponseBody
    @ApiOperation(value = "FindTodayUntreatedUserFormListByCid",notes = "查询对应状态的表单列表")
    public Map<String,Object> FindUserFormList(long cid,long page,long pagenum,String status) {
        Map<String, Object> map = new HashMap<>();
        map.put("total", customersServiceService.FindUserFormCnt(cid, status));
        map.put("list", customersServiceService.FindUserFormList(cid, page, pagenum, status));

        return map;
    }




    @GetMapping("form/userform")
    @ResponseBody
    @ApiOperation(value = "FindUserFormByFid",notes = "查看表单详情")
    public Userform FindUserFormByFid(long fid){
        return customersServiceService.FindUserFormByFid(fid);
    }




    @Autowired
    private WorkOrdersServiceImpl workOrdersService;

    @PostMapping("form/submit/workorder")
    @ApiOperation(value = "WorkOrderSubmit",notes = "提交工单")
    public String WorkOrderSubmit(@RequestBody Map<String, Object> map) throws Exception {
        if(map != null){
            Workorders workorders = getObject(map,Workorders.class);
            workOrdersService.InsertWorkOrder(workorders);
        }
        return "";
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

    @GetMapping("self/workorder/list")
    @ResponseBody
    @ApiOperation(value = "FindSelfWorkOrderSubmit",notes = "查看自己提交工单列表")
    public List<Map<String,Object>> FindSelfWorkOrderSubmit(long cid,long page,long pagenum,String status) {


        List<Map<String,Object>> list =  workOrdersService.FindSelfWorkOrderSubmit(cid,page,pagenum,status);
        return list;
    }

    @GetMapping("self/workorder")
    @ResponseBody
    @ApiOperation(value = "FindSelfWorkOrder",notes = "查看工单详情")
    public Workorders FindSelfWorkOrder(long wid) {
        Workorders workorders =  workOrdersService.FindWorkOrder(wid);
        return workorders;
    }

}
