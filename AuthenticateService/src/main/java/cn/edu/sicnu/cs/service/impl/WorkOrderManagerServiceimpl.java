package cn.edu.sicnu.cs.service.impl;


import cn.edu.sicnu.cs.dao.WorkordersMapper;
import cn.edu.sicnu.cs.model.Workorders;
import cn.edu.sicnu.cs.model.WorkordersExample;
import cn.edu.sicnu.cs.service.WorkOrderManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WorkOrderManagerServiceimpl implements WorkOrderManagerService {

    @Resource
    WorkordersMapper workordersMapper;

    @Override
    public List<Workorders> findAllWorkorders() {
        List<Workorders> workorders;
        workorders = workordersMapper.findAllWorkorders();
        return workorders;
    }

    @Override
    public List<Workorders> selectWorkordersByStatus(String status) {
        List<Workorders> workorders = workordersMapper.selectByStatus(status);
        return workorders;
    }

    @Override
    public String checkorder(Long wid,String check) {
        workordersMapper.checkUpdateStatusByWid(wid,check);
        return check;
    }

    @Override
    public Long allocateorder(Long wid, String name) {
        workordersMapper.allocateUpdateStatusByWid(wid,name);
        return wid;
    }

    @Override
    public Long finishorder(Long wid) {
        workordersMapper.finishUpdateStatusByWid(wid);
        return wid;
    }

}
