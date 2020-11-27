package cn.edu.sicnu.cs.service.impl;

import cn.edu.sicnu.cs.dao.RoleMapper;
import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Role;
import cn.edu.sicnu.cs.model.RoleExample;
import cn.edu.sicnu.cs.pojo.NavigationBar;
import cn.edu.sicnu.cs.pojo.RoleInfo;
import cn.edu.sicnu.cs.service.RolePrivService;
import cn.edu.sicnu.cs.service.RoleService;
import cn.edu.sicnu.cs.utils.RedisUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname RoleServiceImpl
 * @Description TODO
 * @Date 2020/11/16 10:08
 * @Created by Huan
 */
@Service
public class RoleServiceImpl implements RoleService {

    private static final Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);

    @Resource
    RoleMapper roleMapper;

    @Autowired
    RolePrivService rolePrivService;

    @Override
    @Cacheable(cacheNames = "rolelist",key = "#root.methodName")
    public List<Role> selectAll() {
        RoleExample roleExample = new RoleExample();
        RoleExample.Criteria criteria = roleExample.createCriteria();
        criteria.andRidIsNotNull();
        return roleMapper.selectByExample(roleExample);
    }

    @Override
    @CacheEvict(cacheNames = "role",key = "#id")
    public int deleteByPrimaryKey(Integer id) {
        RedisUtils.delete("configAttributes:permissions");
        if (id==null){
            logger.error("删除角色时id不能为空");
            return 0;
        }
        return roleMapper.deleteByPrimaryKey(id);
    }


    /**
     *       **************  注意判空
     * @param record 需要增加的角色
     * @return
     */
    @Override
    public int insert(Role record) {
        RedisUtils.delete("configAttributes:permissions");
        if (record==null){
            logger.error("增加角色时角色不能为空");
            return 0;
        }
        return roleMapper.insertSelective(record);
    }

    @Override
    @CachePut(cacheNames = "role",key = "#result.rid")
    public Role selectRoleByRoleName(String roleName) {
        RoleExample roleExample = new RoleExample();
        RoleExample.Criteria criteria = roleExample.createCriteria();
        criteria.andRnameEqualTo(roleName);
        List<Role> roles = roleMapper.selectByExample(roleExample);
        if (!roles.isEmpty()){
            return roles.get(0);
        }
        return null;
    }

    @Override
    @Cacheable(cacheNames = "role",key = "#id")
    public Role selectByPrimaryKey(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    @Cacheable(cacheNames = "roleprivs",key = "#rid+'selectPrivilegesByRid'")
    public List<Metaoperation> selectPrivilegesByRid(int rid) {
        return rolePrivService.selectRolePrivsByRid(rid);
    }


    @Override
    @Caching(
            evict = {
                    @CacheEvict(cacheNames = "role",key = "#rid"),
                    @CacheEvict(cacheNames = "rolelist",allEntries = true)
            }
    )
    public int updateRoleByPrimaryKey(int rid, Role record) {
        RedisUtils.delete("configAttributes:permissions");
        if (record==null){
            logger.error("更新角色时角色角色id");
            return 0;
        }
        record.setRid(rid);
        return roleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    @Cacheable(value = "roleprivs",key = "#root.methodName")
    public List<RoleInfo> selectAllRoleAndMetaoperations() {
        List<Role> roles = this.selectAll();
        List<RoleInfo> roleInfos = new ArrayList<>();
        for (Role role : roles) {
            if (role!=null){
                roleInfos.add(new RoleInfo(role.getRid(),role.getRname(),this.selectPrivilegesByRid(role.getRid())));
            }
        }
        return roleInfos;
    }

    @Override
    @Cacheable(value = "rolelist",key = "#root.methodName")
    public List<Role> selectAllRoles() {
        RoleExample roleExample = new RoleExample();
        roleExample.createCriteria().andRidIsNotNull();
        return roleMapper.selectByExample(roleExample);
    }

    @Override
    public List<NavigationBar> selectNavBarByRole(Integer rid) {
//        List<NavigationBar> navigationBars = rolePrivService.selectNavBarByRole(Integer rid);

        return null;
    }
}
