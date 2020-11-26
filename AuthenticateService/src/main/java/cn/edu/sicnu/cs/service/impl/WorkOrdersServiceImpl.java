package cn.edu.sicnu.cs.service.impl;

import cn.edu.sicnu.cs.dao.WorkordersMapper;
import cn.edu.sicnu.cs.model.Workorders;
import cn.edu.sicnu.cs.service.WorkOrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class WorkOrdersServiceImpl implements WorkOrdersService {

    @Resource
    WorkordersMapper workordersMapper;

    @Override
    public void InsertWorkOrder(Workorders workOrders) {
        workordersMapper.insert(workOrders);
    }

    @Override
    public List<Map<String,Object>> FindSelfWorkOrderSubmit(String cid) {

        List<Map<String,Object>> list = workordersMapper.findSelfWorkOrderSubmit(cid);
        return list;
    }

    @Override
    public Workorders FindSelfWorkOrder(String wid) {
        Workorders workorders = workordersMapper.findSelfWorkOrder(wid);
        return workorders;
    }
}
