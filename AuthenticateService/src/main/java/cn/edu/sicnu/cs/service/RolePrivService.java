package cn.edu.sicnu.cs.service;

import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Role;
import cn.edu.sicnu.cs.model.Rolepriv;
import cn.edu.sicnu.cs.pojo.NavigationBar;
import cn.edu.sicnu.cs.pojo.NavigationBarChilren;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Classname RolePrivService
 * @Description TODO
 * @Date 2020/11/16 16:11
 * @Created by Huan
 */
public interface RolePrivService {
    /**
     * 查询这个角色具有哪些权限,返回权限对象列表
     * @param rid 角色id
     * @return 权限对象列表
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<Metaoperation> selectRolePrivsByRid(int rid);

    /**
     * 查询这个角色所拥有的权限列表
     * @param rid 角色id
     * @return 拥有的权限名(String)列表
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<Integer> selectRolePrivsNamesByRid(int rid);

    /**
     * 查询此权限被哪些角色所拥有,返回拥有角色列表
     * @param pid 权限id
     * @return 拥有角色列表
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<Role> selectRolesByPid(int pid);

    /**
     * 查询此角色是否拥有此权限
     * @param rid 角色id
     * @param pid 权限id
     * @return 是否存在 boolean值
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    boolean selectIsExistByRidAndPid(int rid,int pid);

    /**
     * 为此角色添加某项权限
     * @param rid 角色id
     * @param pid 权限id
     * @return 是否添加成功
     */
    @Transactional
    int insert(int rid,int pid);

    /**
     * 为某角色删除某项权限
     * @param rid 角色id
     * @param pid 权限id
     * @return 是否删除成功
     */
    @Transactional
    int deleteByRidAndPid(int rid,int pid);

    /**
     * 删除某一个权限的所有关联
     * @param pid 权限id
     * @return 是否删除成功
     */
    @Transactional
    int deleteByPid(int pid);

    /**
     * 删除某一个角色的所有权限
     * @param rid 角色id
     * @return 是否删除成功
     */
    @Transactional
    int deleteByRid(int rid);

    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    List<NavigationBar> selectNavBarByRole(Integer rid);

    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    List<NavigationBarChilren> selectNavBarChildrenByRole(Integer roleid,String privname);
}
