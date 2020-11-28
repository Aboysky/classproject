package cn.edu.sicnu.cs.service.impl;

import cn.edu.sicnu.cs.dao.RoleprivMapper;
import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Role;
import cn.edu.sicnu.cs.model.Rolepriv;
import cn.edu.sicnu.cs.model.RoleprivExample;
import cn.edu.sicnu.cs.pojo.NavigationBar;
import cn.edu.sicnu.cs.pojo.NavigationBarChilren;
import cn.edu.sicnu.cs.service.MetaOperationService;
import cn.edu.sicnu.cs.service.RolePrivService;
import cn.edu.sicnu.cs.service.RoleService;
import cn.edu.sicnu.cs.utils.RedisUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname RolePrivServiceImpl
 * @Description TODO
 * @Date 2020/11/16 16:19
 * @Created by Huan
 */
@Service
public class RolePrivServiceImpl implements RolePrivService {

    private static final Logger logger = LoggerFactory.getLogger(RolePrivServiceImpl.class);

    @Resource
    RoleprivMapper roleprivMapper;

    @Autowired
    MetaOperationService metaOperationService;

    @Autowired
    RoleService roleService;

    @Override
    public List<Metaoperation> selectRolePrivsByRid(int rid) {
        RoleprivExample roleprivExample = new RoleprivExample();
        RoleprivExample.Criteria criteria = roleprivExample.createCriteria();
        criteria.andRoleidEqualTo(rid);
        List<Rolepriv> roleprivs = roleprivMapper.selectByExample(roleprivExample);

        logger.debug("角色id"+rid+"  roleprivs: "+roleprivs);

        List<Metaoperation> privileges = new ArrayList<>();
        for (Rolepriv rolepriv : roleprivs) {
            Metaoperation privilege = metaOperationService.selectByPrimaryKey(rolepriv.getPrivilegeid());
            if (privilege!=null){
                privileges.add(privilege);
            }

        }
        logger.debug("此角色拥有的权限集合为: privileges: "+privileges);
        return privileges;
    }

    @Override
    public List<Integer> selectRolePrivsNamesByRid(int rid)
    {
        RoleprivExample roleprivExample = new RoleprivExample();
        RoleprivExample.Criteria criteria = roleprivExample.createCriteria();
        criteria.andRoleidEqualTo(rid);
        List<Rolepriv> roleprivs = roleprivMapper.selectByExample(roleprivExample);
        List<Integer> privilegeNames = new ArrayList<>();
        for (Rolepriv rolepriv : roleprivs) {
            Metaoperation privilege = metaOperationService.selectByPrimaryKey(rolepriv.getPrivilegeid());
            if (privilege!=null){
                privilegeNames.add(privilege.getMoid());
            }

        }
        return privilegeNames;
    }

    @Override
    public List<Role> selectRolesByPid(int pid) {
        RoleprivExample roleprivExample = new RoleprivExample();
        roleprivExample.createCriteria().andPrivilegeidEqualTo(pid);
        List<Rolepriv> roleprivs = roleprivMapper.selectByExample(roleprivExample);
        List<Role> roles = new ArrayList<>();
        if (!roleprivs.isEmpty()){
            for (Rolepriv rolepriv : roleprivs) {
                Role role = roleService.selectByPrimaryKey(rolepriv.getRoleid());
                if (role!=null){
                    roles.add(role);
                }

            }
            return roles;
        }
        return null;
    }

    @Override
    public boolean selectIsExistByRidAndPid(int rid, int pid) {
        RoleprivExample roleprivExample = new RoleprivExample();
        roleprivExample.createCriteria().andRoleidEqualTo(rid).andPrivilegeidEqualTo(pid);
        List<Rolepriv> roleprivs = roleprivMapper.selectByExample(roleprivExample);
        return !roleprivs.isEmpty();
    }

    @Override
    public int insert(int rid, int pid) throws Exception{
        RedisUtils.delete("configAttributes:permissions");
        int i = roleprivMapper.insertSelective(new Rolepriv(rid, pid));
        RedisUtils.addConfigrationPermissions();
        return i;
    }

    @Override
    public int deleteByRidAndPid(int rid, int pid) {

        RedisUtils.delete("configAttributes:permissions");
        RoleprivExample roleprivExample = new RoleprivExample();
        roleprivExample.createCriteria().andRoleidEqualTo(rid).andPrivilegeidEqualTo(pid);
        List<Rolepriv> roleprivs = roleprivMapper.selectByExample(roleprivExample);
        return roleprivMapper.deleteByExample(roleprivExample);
    }

    @Override
    public int deleteByPid(int pid) {
        RedisUtils.delete("configAttributes:permissions");
        RoleprivExample roleprivExample = new RoleprivExample();
        RoleprivExample.Criteria criteria = roleprivExample.createCriteria();
        criteria.andPrivilegeidEqualTo(pid);
        return roleprivMapper.deleteByExample(roleprivExample);
    }

    @Override
    public int deleteByRid(int rid) {
        RedisUtils.delete("configAttributes:permissions");
        RoleprivExample roleprivExample = new RoleprivExample();
        RoleprivExample.Criteria criteria = roleprivExample.createCriteria();
        criteria.andRoleidEqualTo(rid);
        return roleprivMapper.deleteByExample(roleprivExample);
    }

    // List<Map>

    @Override
    public List<NavigationBar> selectNavBarByRole(Integer rid) {
        List<Metaoperation> metaoperations = this.selectRolePrivsByRid(rid);
        List<Metaoperation> metaoperations1 = metaOperationService.selectAllHeadNavBar();
        List<NavigationBar> navigationBarList = new ArrayList<>();

        logger.debug("-----------"+metaoperations+"\n----------"+metaoperations1+"\n----------"+navigationBarList);
        int id =0;
//        for (Metaoperation metaoperation : metaoperations1) {
//            navigationBarList.add(new NavigationBar(++id,metaoperation.getMoname(),metaoperation.getMolurl(),false,id!=1&&id%2==1));
//        }
        if (!metaoperations.isEmpty()){
            for (Metaoperation metaoperation : metaoperations) {
//                for (NavigationBar navigationBar : navigationBarList) {
//                    if (metaoperation.getMoid().equals(navigationBar.getId())){
//                        navigationBar.setActive(true);
//                    }
//                }
                for (Metaoperation metaoperation1 : metaoperations1) {
                    if (metaoperation1.getMoid().equals(metaoperation.getMoid())){
                        navigationBarList.add(new NavigationBar(++id,metaoperation1.getMoname(),metaoperation1.getMolurl(), id == 1, id != 1));
                    }
                }
            }
            return navigationBarList;
        }
    return null;
    }

    @Override
    public List<NavigationBarChilren> selectNavBarChildrenByRole(Integer roleid,String privname) {
        List<Metaoperation> metaoperations = this.selectRolePrivsByRid(roleid);
        List<Metaoperation> metaoperations1 = metaOperationService.selectAllChildNavBarByHead(privname);
        List<NavigationBarChilren> navigationBarChilrens = new ArrayList<>();
        int id = 0;
//        if (!metaoperations1.isEmpty()){
//            for (Metaoperation metaoperation : metaoperations1) {
//                navigationBarChilrens.add(new NavigationBarChilren(++id,metaoperation.getMoname(),metaoperation.getMolurl(),false));
//            }
//        }

//        logger.debug("-------->metaoperations"+metaoperations);
//        logger.debug("----------->metaoperations1"+metaoperations1);
        if (!metaoperations.isEmpty()){
            for (Metaoperation metaoperation : metaoperations) {
                if (!metaoperations1.isEmpty()){
                    for (Metaoperation metaoperation1 : metaoperations1) {
                        if (metaoperation1.getMoid().equals(metaoperation.getMoid())){
                            navigationBarChilrens.add(new NavigationBarChilren(++id,metaoperation1.getMoname(),metaoperation1.getMolurl(),id!=1));

                        }
                    }
                }else{
                    return null;
                }
//                logger.debug("navigationBarChilrens"+navigationBarChilrens);

            }
            return navigationBarChilrens;
        }

        return null;
    }


}
