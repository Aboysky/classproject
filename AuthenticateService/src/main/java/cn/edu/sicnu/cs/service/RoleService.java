package cn.edu.sicnu.cs.service;

import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Role;
import cn.edu.sicnu.cs.pojo.NavigationBar;
import cn.edu.sicnu.cs.pojo.RoleInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Classname RoleService
 * @Description TODO
 * @Date 2020/11/16 9:41
 * @Created by Huan
 */
public interface RoleService {

    /**
     * 查询所有角色
     * @return 角色列表
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<Role> selectAll();

    /**
     * 删除角色通过角色id
     * @param id 角色id
     * @return 是否删除
     */
    @Transactional
    int deleteByPrimaryKey(Integer id);

    /**
     * 增加角色,必须保证角色的所有非空字段不为空,例如id为null,则插入的id也为null,此时便会插入失败
     * @param record 需要增加的角色
     * @return 是否增加成功
     */
    @Transactional
    int insert(Role record);

//    /**
//     * 增加角色,如果有null字段,则sql语句中不添加此字段,例如id为null,则会用自增生成的id
//     * @param record 待添加的角色
//     * @return 是否增加成功
//     */
//    int insertSelective(Role record);

    /**
     * 查询角色通过角色名
     * @param roleName 角色名
     * @return 角色
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    Role selectRoleByRoleName(String roleName);

    /**
     * 查询角色通过角色id
     * @param id 角色id
     * @return 对应角色
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    Role selectByPrimaryKey(Integer id);

    /**
     * 通过角色id查询角色拥有的权限
     * @param rid 角色id
     * @return 角色所拥有的权限列表
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<Metaoperation> selectPrivilegesByRid(int rid);

    /**
     * 更新角色信息
     * @param rid 角色id
     * @param record 更新的角色信息
     * @return 是否更新成功
     */
    @Transactional
    int updateRoleByPrimaryKey(int rid,Role record);

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<RoleInfo> selectAllRoleAndMetaoperations();

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<Role> selectAllRoles();

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<NavigationBar> selectNavBarByRole(Integer id);
}
