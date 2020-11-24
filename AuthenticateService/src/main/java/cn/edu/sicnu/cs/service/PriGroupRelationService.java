package cn.edu.sicnu.cs.service;

import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Prigroup;
import cn.edu.sicnu.cs.model.PrigrouprelationExample;
import cn.edu.sicnu.cs.model.PrigrouprelationKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Classname PriGroupRelationService
 * @Description TODO
 * @Date 2020/11/16 11:25
 * @Created by Huan
 */
public interface PriGroupRelationService {

    /**
     * 根据权限组id删除权限组   ???????? 是否级联删除
     * @param pid 权限id
     * @param gid 权限组id
     * @return 是否删除成功
     */
    @Transactional
    int deleteByPrimaryKey(int pid,int gid);

    /**
     * 删除权限id与所有权限组的联系
     * @param pid 权限id
     * @return 是否删除成功
     */
    @Transactional
    int deleteAllRelationEqualtoPid(int pid);

    /**
     * 删除组id为gid的权限组与所有权限的联系
     * @param gid 权限组id
     * @return 是否删除成功
     */
    @Transactional
    int deleteAllRelationEqualtoGid(int gid);

    /**
     * 添加一个权限组
     * @param record 待添加的权限组对象
     * @return 是否添加成功
     */
    @Transactional
    int insert(PrigrouprelationKey record);

    @Transactional
    int insert(int gid,int pid);
    /**
     * 根据权限组id查询此权限组是内部有哪些权限
     * @param priGroupId 权限组id
     * @return 此权限组所包含的权限对象列表
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<Metaoperation> selectPrivilegesByPrigroupId(int priGroupId);

    /**
     * 根据权限id查询哪些权限组包含此权限
     * @param pid 权限id
     * @return 包含此权限的权限组对象列表
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<PrigrouprelationKey> selectPriGroupRelationKeysByPrivilegeId(int pid);

    /**
     * 根据权限id查询包含此权限的所有权限组的权限组对象列表
     * @param pid 权限id
     * @return 包含此权限的所有权限组的权限组对象列表
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<Prigroup> selectPriGroupByPrivilegeId(int pid);
    /**
     * 根据权限id和权限组id查询某个权限是否在此权限组
     * @param pid 权限id
     * @param pgroupId 权限组id
     * @return 是否存在
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    boolean selectIsExistByPidAndPriGroupId(int pid,int pgroupId);
}
