package cn.edu.sicnu.cs.service.impl;


import cn.edu.sicnu.cs.dao.WorkordersMapper;
import cn.edu.sicnu.cs.model.Workorders;
import cn.edu.sicnu.cs.model.WorkordersExample;
import cn.edu.sicnu.cs.pojo.WorkOrderPojo;
import cn.edu.sicnu.cs.service.WorkOrderManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WorkOrderManagerServiceimpl implements WorkOrderManagerService {

    @Resource
    WorkordersMapper workordersMapper;

    @Override
    public List<WorkOrderPojo> findAllWorkorders(Integer page,Integer pagenum) {
        List<WorkOrderPojo> workOrderPojos;
        if(page == 1){
            page = 0;
        }else{
            page =((page-1) * pagenum) +1;
        }
        workOrderPojos = workordersMapper.findAllWorkorders(page,pagenum);
        return workOrderPojos;
    }

    @Override
    public List<WorkOrderPojo> selectWorkordersByStatus(String status,Integer page,Integer pagenum) {
        if(page == 1){
            page = 0;
        }else{
            page =((page-1) * pagenum) +1;
        }
        List<WorkOrderPojo> workOrderPojos = workordersMapper.selectByStatus(status,page,pagenum);
        return workOrderPojos;
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
