package cn.edu.sicnu.cs.dao;

import cn.edu.sicnu.cs.model.Workorders;
import cn.edu.sicnu.cs.model.WorkordersExample;
import java.util.List;
import java.util.Map;

import cn.edu.sicnu.cs.pojo.WorkOrderPojo;
import org.apache.ibatis.annotations.Param;

public interface WorkordersMapper {
    List<WorkOrderPojo> selectByStatus(String status,Integer page,Integer pagenum);

    List<WorkOrderPojo> findAllWorkorders(Integer page,Integer pagenum);

    void checkUpdateStatusByWid(Long wid,String check);

    void allocateUpdateStatusByWid(Long wid,String name);

    void finishUpdateStatusByWid(Long wid);

    long countByExample(WorkordersExample example);

    int deleteByExample(WorkordersExample example);

    int deleteByPrimaryKey(Long wzid);

    int insert(Workorders record);

    int insertSelective(Workorders record);

    List<Workorders> selectByExampleWithBLOBs(WorkordersExample example);

    List<Workorders> selectByExample(WorkordersExample example);

    Workorders selectByPrimaryKey(Long wzid);

    int updateByExampleSelective(@Param("record") Workorders record, @Param("example") WorkordersExample example);

    int updateByExampleWithBLOBs(@Param("record") Workorders record, @Param("example") WorkordersExample example);

    int updateByExample(@Param("record") Workorders record, @Param("example") WorkordersExample example);

    int updateByPrimaryKeySelective(Workorders record);

    int updateByPrimaryKeyWithBLOBs(Workorders record);

    int updateByPrimaryKey(Workorders record);

    int findSelfWorkOrderCntByStatus(long uid, String status);

    List<Map<String,Object>> findSelfWorkOrderListByStatus(long uid, long page, long pagenum, String status);

    List<Map<String,Object>> findSelfWorkOrderSubmit(long cid,long page, long pagenum);

    Workorders findWorkOrder(long wid);


    long findSelfWorkOrderSubmitCnt(long cid);
}