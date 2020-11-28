package cn.edu.sicnu.cs.service.impl;

import cn.edu.sicnu.cs.dao.MetaoperationMapper;
import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.MetaoperationExample;
import cn.edu.sicnu.cs.model.Prigroup;
import cn.edu.sicnu.cs.model.Role;
import cn.edu.sicnu.cs.pojo.NavigationBarChilren;
import cn.edu.sicnu.cs.pojo.PrivGroup;
import cn.edu.sicnu.cs.pojo.ReturningPriv;
import cn.edu.sicnu.cs.pojo.ReturningPrivFourLevel;
import cn.edu.sicnu.cs.service.MetaOperationService;
import cn.edu.sicnu.cs.service.PrigroupService;
import cn.edu.sicnu.cs.service.RolePrivService;
import cn.edu.sicnu.cs.service.RoleService;
import cn.edu.sicnu.cs.utils.RedisUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname OperationServiceImpl
 * @Description TODO
 * @Date 2020/11/16 15:22
 * @Created by Huan
 */
@Service
public class MetaOperationServiceImpl implements MetaOperationService {

    private static final Logger logger = LoggerFactory.getLogger(MetaOperationServiceImpl.class);

    @Resource
    MetaoperationMapper metaoperationMapper;

    @Autowired
    PrigroupService prigroupService;

    @Autowired
    RoleService roleService;

    @Autowired
    RolePrivService rolePrivService;

    @Override
    @Cacheable(value = "operations",key = "#root.methodName")
    public List<Metaoperation> selectAll() {
        MetaoperationExample operationExample = new MetaoperationExample();
        MetaoperationExample.Criteria criteria = operationExample.createCriteria();
        criteria.andMonameIsNotNull();
        return metaoperationMapper.selectByExample(operationExample);
    }

    @Override
    @CacheEvict(value = "operations",key = "#id")
    @Caching(
            evict = {
                    @CacheEvict(value = "operations",key = "#id"),
                    @CacheEvict(value = "roleprivs",allEntries = true),
                    @CacheEvict(value = "navigationbar",allEntries = true)
            }
    )
    public int deleteByPrimaryKey(Integer id) {
        RedisUtils.delete("configAttributes:permissions");
        return metaoperationMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Caching(
            evict = {
                    @CacheEvict(value = "operations",allEntries = true),
                    @CacheEvict(value = "roleprivs",allEntries = true),
                    @CacheEvict(value = "navigationbar",allEntries = true)
            }
    )
    public int deleteByOperationName(String operationName) {
        RedisUtils.delete("configAttributes:permissions");
        MetaoperationExample operationExample = new MetaoperationExample();
        MetaoperationExample.Criteria criteria = operationExample.createCriteria();
        criteria.andMonameEqualTo(operationName);
        return metaoperationMapper.deleteByExample(operationExample);
    }

    @Override
    @Caching(
            evict = {
                    @CacheEvict(value = "roleprivs",allEntries = true),
                    @CacheEvict(value = "navigationbar",allEntries = true)
            }
    )
    public int insert(Metaoperation record) {
        RedisUtils.delete("configAttributes:permissions");
        return metaoperationMapper.insertSelective(record);
    }

    @Override
    @Cacheable(value = "operations",key = "#id")
    public Metaoperation selectByPrimaryKey(Integer id) {
        return metaoperationMapper.selectByPrimaryKey(id);
    }

    @Override
    @CachePut(value = "operations",key = "#result.moid")
    public Metaoperation selectByOperationName(String operationName)
    {
        MetaoperationExample operationExample = new MetaoperationExample();
        MetaoperationExample.Criteria criteria = operationExample.createCriteria();
        criteria.andMonameEqualTo(operationName);
        List<Metaoperation> operations = metaoperationMapper.selectByExample(operationExample);
        return operations.isEmpty()?null:operations.get(0);
    }

    @Override
    @Cacheable(value = "navigationbar",key = "#root.methodName")
    public List<Metaoperation> selectAllHeadNavBar() {
        MetaoperationExample metaoperationExample = new MetaoperationExample();
        metaoperationExample.createCriteria().andModescLike("HEAD_%");
        metaoperationExample.setOrderByClause("'moid' ASC");
        return metaoperationMapper.selectByExample(metaoperationExample);
    }

    @Override
    @Cacheable(value = "navigationbar",key = "#root.methodName")
    public List<Metaoperation> selectAllChildNavBarByHead(String headname) {
        System.out.println("1111111111111111111111111111111111111111111111111");

        MetaoperationExample metaoperationExample = new MetaoperationExample();
//        headname = headname.toLowerCase();
        metaoperationExample.createCriteria().andModescLike(headname+"_%");
        metaoperationExample.setOrderByClause("'moid' ASC");
        List<Metaoperation> metaoperations = metaoperationMapper.selectByExample(metaoperationExample);
        logger.debug(headname+" 导航栏下二级标题有 "+metaoperations);
        return metaoperations;
    }

    @Override
    @Caching(
            evict = {
                    @CacheEvict(value = "operations",key = "#record.moid"),
                    @CacheEvict(value = "roleprivs",allEntries = true),
                    @CacheEvict(value = "navigationbar",allEntries = true)
            }
    )
    public int updateByPrimaryKey(Metaoperation record) {
        RedisUtils.delete("configAttributes:permissions");
        if (record.getMoid()==null){
            logger.error("待更新的对象record中的id属性不能为空");
            return 0;
        }
        return metaoperationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    @Caching(
            evict = {
                    @CacheEvict(value = "operations",key = "#record.moid"),
                    @CacheEvict(value = "roleprivs",allEntries = true),
                    @CacheEvict(value = "navigationbar",allEntries = true)
            }
    )
    public int updateByOperationName(String operationName, Metaoperation record)
    {
        RedisUtils.delete("configAttributes:permissions");
        MetaoperationExample operationExample = new MetaoperationExample();
        MetaoperationExample.Criteria criteria = operationExample.createCriteria();
        criteria.andMonameEqualTo(operationName);
        return metaoperationMapper.updateByExampleSelective(record,operationExample);
    }

    @Override
    public List<ReturningPrivFourLevel> selectPrivFourLeverByRoleAndPrivgroup(Role role, Prigroup privGroup) {

        List<NavigationBarChilren> navigationBarChilrens = rolePrivService.selectNavBarChildrenByRole(role.getRid(), privGroup.getPrigroupdesc());

        logger.debug("角色名称: "+role.getRname()+"权限组名称: "+privGroup.getPrigroupname()+"二级导航栏目录:"+navigationBarChilrens);
        List<ReturningPrivFourLevel> returningPrivFourLevels = new ArrayList<>();
        if (navigationBarChilrens==null||navigationBarChilrens.isEmpty()){
            return null;
        }
        for (NavigationBarChilren navigationBarChilren : navigationBarChilrens) {
            returningPrivFourLevels.add(new ReturningPrivFourLevel(navigationBarChilren.getId(),navigationBarChilren.getName(),
                    navigationBarChilren.getAddr(),null));
        }

        for (ReturningPrivFourLevel returningPrivFourLevel : returningPrivFourLevels) {
            List<Metaoperation> metaoperations = prigroupService.selectInAPrivGoupprivsByRoleAndFourlever(privGroup.getPgid(), role.getRid(), returningPrivFourLevel.getId());
            List<ReturningPriv> returningPrivs = new ArrayList<>();
            for (Metaoperation metaoperation : metaoperations) {
                returningPrivs.add(new ReturningPriv(metaoperation.getMoid(),metaoperation.getMoname(),metaoperation.getMolurl()));
            }
            returningPrivFourLevel.setChildren(returningPrivs);
        }



        return returningPrivFourLevels;
    }

    @Override
    public List<ReturningPriv> selectPrivsByPrivFourLever(MetaOperationService metaOperationService) {
        return null;
    }

    @Override
    public List<Metaoperation> selectPrivsByPrivGroupDesc(String privgoupdesc) {
        MetaoperationExample metaoperationExample = new MetaoperationExample();
        metaoperationExample.createCriteria().andModescLike(privgoupdesc+"%");
        return metaoperationMapper.selectByExample(metaoperationExample);
    }
}
