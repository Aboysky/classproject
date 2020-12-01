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
    public List<Map<String,Object>> FindSelfWorkOrderSubmit(long cid,long page, long pagenum) {

        page = ((page-1)*pagenum);

        List<Map<String,Object>> list = workordersMapper.findSelfWorkOrderSubmit(cid,page,pagenum);
        return list;
    }

    @Override
    public Workorders FindWorkOrder(long wid) {
        Workorders workorders = workordersMapper.findWorkOrder(wid);
        return workorders;
    }
}
