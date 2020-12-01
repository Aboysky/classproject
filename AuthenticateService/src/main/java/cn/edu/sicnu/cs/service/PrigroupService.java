package cn.edu.sicnu.cs.service;

import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Prigroup;
import cn.edu.sicnu.cs.pojo.PrivGroup;
import cn.edu.sicnu.cs.pojo.ReturningPrivFourLevel;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Classname PrigroupService
 * @Description TODO
 * @Date 2020/11/16 11:10
 * @Created by Huan
 */
public interface PrigroupService {

    /**
     * 删除权限组      ???????????????  是否需要级联删除权限
     * @param id 权限组id
     * @return 是否删除成功
     */
    @Transactional
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入一个新的权限组
     * @param record 新的权限组
     * @return 是否插入成功
     */
    @Transactional
    int insert(Prigroup record);

    /**
     * 根据权限组id查询权限组详细描述
     * @param id 权限组id
     * @return 权限组对象
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    Prigroup selectByPrimaryKey(Integer id);

    /**
     * 根据权限组名称查询权限组
     * @param privgroupname 权限组名称
     * @return 对应权限组
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    Prigroup selectByPrivName(String privgroupname);


    /**
     * 根据权限组id得到此权限组的权限列表
     * @param pgroupid 权限组id
     * @return 权限列表
     */
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<Metaoperation> selectPrivilegesByPrimaryKey(Integer pgroupid);

    /**
     * 更新权限组描述或者名称
     * @param record 待更新的权限组对象
     * @return 是否更新成功
     */
    @Transactional
    int updateByPrimaryKey(Prigroup record);

    /**
     * 查询一个角色在某一个权限组拥有的权限集合
     * @return
     */
    List<Metaoperation> selectinaprivgoupprivsbyrole(Integer groupid, Integer roleid);

    /**
     * 查询角色id在权限组下面的子标题下拥有的权限
     * @param groupid 权限组id
     * @param roleid 角色id
     * @param zibiaoti 二级菜单id
     * @return
     */
    List<Metaoperation> selectInAPrivGoupprivsByRoleAndFourlever(Integer groupid,Integer roleid,Integer zibiaoti);

    List<Metaoperation> selectALLAPrivGoupprivsBygroupidAndzibiaoti(Integer groupid,Integer zibiaoti);

    List<Prigroup> selectAll();

    List<ReturningPrivFourLevel> selectAllFourLever(Prigroup prigroup);
}
