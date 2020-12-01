package cn.edu.sicnu.cs.service.impl;


import cn.edu.sicnu.cs.dao.TaskMapper;
import cn.edu.sicnu.cs.dao.WorkordersMapper;
import cn.edu.sicnu.cs.model.Workorders;
import cn.edu.sicnu.cs.service.EngineerService;
import cn.edu.sicnu.cs.model.Task;
import cn.edu.sicnu.cs.service.WorkOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class EngineerServiceImpl implements EngineerService {

    @Resource
    TaskMapper taskMapper;

    @Resource
    WorkordersMapper workordersMapper;

    @Override
    public long FindSelfTaskCntByStatus(long uid, String status) {
        long cnt = taskMapper.findSelfTaskCntByStatus(uid,status);
        return cnt;
    }

    @Override
    public long FindSelfWorkOrderCntByStatus(long uid, String status) {
        long cnt = workordersMapper.findSelfWorkOrderCntByStatus(uid,status);
        return cnt;
    }

    @Override
    public List<Map<String,Object>> FindSelfTaskListByStatus(long uid, long page, long pagenum, String status) {
        page =((page-1) * pagenum);
        List<Map<String,Object>> list = taskMapper.findSelfTaskListByStatus(uid,page,pagenum,status);

        return list;
    }



    @Override
    public List<Map<String,Object>> FindSelfWorkOrderListByStatus(long uid, long page, long pagenum,String status) {
        page =((page-1) * pagenum);
        List<Map<String,Object>> list = workordersMapper.findSelfWorkOrderListByStatus(uid,page,pagenum,status);
        return list;
    }

    //

//    @Override
//    public List<Task> FindWorkOrderListByStatus(String status) {
//        List<Task> list = taskMapper.findWorkOrderListByStatus(status);
//        return list;
//    }



    @Autowired
    WorkOrdersServiceImpl workOrdersServiceImpl;

    @Override
    public Workorders FindWorkOrderByWid(long wid) {
        Workorders workorders = workOrdersServiceImpl.FindWorkOrder(wid);
        return workorders;
    }
}
