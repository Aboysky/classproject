package cn.edu.sicnu.cs.service;

import cn.edu.sicnu.cs.model.Task;
import cn.edu.sicnu.cs.model.Workorders;

import java.util.List;
import java.util.Map;

public interface EngineerService {

    long FindSelfTaskCntByStatus(long uid, String s);

    long FindSelfWorkOrderCntByStatus(long uid, String s);

    List<Map<String,Object>> FindSelfTaskListByStatus(long uid, long page, long pagenum, String status);

    List<Map<String,Object>> FindSelfWorkOrderListByStatus(long uid,long page,long pagenum,String status);

    List<Task> FindWorkOrderListByStatus(String status);

    Workorders FindWorkOrderByWid(long wid);


//    long FindSelfWorkOrderListByTypeCnt(long uid, String status);
//
    long FindSelfTaskListByStatusCnt(long uid, String status);

    List<Map<String, Object>> FindAllSelfTaskList(long uid, long page, long pagenum);

    long FindAllSelfTaskListCnt(long uid);
}
