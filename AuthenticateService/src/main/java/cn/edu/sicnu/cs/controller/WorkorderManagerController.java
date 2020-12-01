package cn.edu.sicnu.cs.controller;


import cn.edu.sicnu.cs.pojo.WorkOrderPojo;
import cn.edu.sicnu.cs.service.UserService;
import cn.edu.sicnu.cs.service.WorkOrderManagerService;
import cn.edu.sicnu.cs.utils.ResUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @Classname WorkOrderManagerController
 * @Description TODO
 * @Date 2020/11/16 18:06
 * @Created by Songyz
 */
@Controller
@RequestMapping("/wordermanager")
@Api(tags = "WorkOrderManager",value = "工单管理员")
public class WorkorderManagerController {

    @Resource
    WorkOrderManagerService workOrderManagerService;
    @Resource
    UserService userService;


    @GetMapping("/getorder")
    @ApiOperation(value = "WorkOrder",notes = "获取工单")
    @ResponseBody
    public String GetOrder(String select,Integer page,Integer pagenum){
        List<WorkOrderPojo> workOrderPojos;
        if(select.equals("5")){
            workOrderPojos = workOrderManagerService.findAllWorkorders(page,pagenum);
        }else {
            workOrderPojos = workOrderManagerService.selectWorkordersByStatus(select,page,pagenum);
        }
        for (WorkOrderPojo orderPojo : workOrderPojos) {
            HashMap<String, String> op = new HashMap<String, String>() {
                {
                    put("isActive_0", "false");//审核
                    put("isActive_1", "false");//分配
                    put("isActive_2", "false");//完成
                }
            };
            orderPojo.setWprincipal_id(userService.selectUserNameByUid(Integer.parseInt(orderPojo.getWprincipal_id())));
            if (orderPojo.getWstatus().equals("0")) {
                op.put("isActive_0", "true");
            } else if (orderPojo.getWstatus().equals("1")) {
                op.put("isActive_1", "true");
            } else if (orderPojo.getWstatus().equals("3") || orderPojo.getWstatus().equals("4")) {
                op.put("isActive_2", "true");
            }
            orderPojo.setOperations(op);
        }
        return ResUtil.getJsonStr(1,"成功",workOrderPojos);
    }

    @PostMapping("/check")
    @ApiOperation(value = "CheckOrder",notes = "审核工单")
    @ResponseBody
    public String CheckOrder(Long wid,int check){
        String checkd = Integer.toString(check);
        String result = workOrderManagerService.checkorder(wid,checkd);
        return result;
    }

    @PostMapping("/allocate")
    @ApiOperation(value = "AllocateOrder",notes = "分配工单")
    @ResponseBody
    public Long AllocateOrder(Long wid,String name){
        Long result = workOrderManagerService.allocateorder(wid,name);
        return result;
    }

    @PostMapping("/finish")
    @ApiOperation(value = "FinishOrder",notes = "完成工单")
    @ResponseBody
    public Long FinishOrder(Long wid){
        Long result = workOrderManagerService.finishorder(wid);
        return result;
    }


}
