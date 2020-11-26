package cn.edu.sicnu.cs.service;

import cn.edu.sicnu.cs.model.Workorders;

import java.util.List;

public interface WorkOrderManagerService {

    List<Workorders> findAllWorkorders();

    List<Workorders> selectWorkordersByStatus(String status);

    String checkorder(Long woid,String check);

    Long allocateorder(Long woid,String name);

    Long finishorder(Long wid);
}
