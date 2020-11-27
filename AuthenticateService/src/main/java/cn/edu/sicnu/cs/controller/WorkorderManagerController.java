package cn.edu.sicnu.cs.controller;


import cn.edu.sicnu.cs.model.Workorders;
import cn.edu.sicnu.cs.service.WorkOrderManagerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
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


    @GetMapping("/index")
    @ApiOperation(value = "WorkOrder",notes = "显示全部工单")
    @ResponseBody
    public List<Workorders> WorkOrder(){
        List<Workorders> workorders;
        workorders = workOrderManagerService.findAllWorkorders();
        return workorders;
    }

    @GetMapping("/index/unchecked")
    @ApiOperation(value = "UnChecked",notes = "未审核工单")
    @ResponseBody
    public List<Workorders> UnChecked(){
        List<Workorders> workorders = workOrderManagerService.selectWorkordersByStatus("1");
        return workorders;
    }

    @GetMapping("/index/unallocated")
    @ApiOperation(value = "UnAllocated",notes = "未分配工单")
    @ResponseBody
    public List<Workorders> UnAllocated(){
        List<Workorders> workorders = workOrderManagerService.selectWorkordersByStatus("3");
        return workorders;
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
