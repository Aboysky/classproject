package cn.edu.sicnu.cs.service;

import cn.edu.sicnu.cs.model.Workorders;
import cn.edu.sicnu.cs.pojo.WorkOrderPojo;

import java.util.List;

public interface WorkOrderManagerService {

    List<WorkOrderPojo> findAllWorkorders(Integer page,Integer pagenum);

    List<WorkOrderPojo> selectWorkordersByStatus(String status,Integer page,Integer pagenum);

    String checkorder(Long woid,String check);

    Long allocateorder(Long woid,String name);

    Long finishorder(Long wid);
}
