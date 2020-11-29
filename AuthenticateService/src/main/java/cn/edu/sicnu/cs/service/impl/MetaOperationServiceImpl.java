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

    @Autowired
    RedisUtils redisUtils;

    @Override
    @Cacheable(value = "operationlist",key = "#root.methodName",unless = "#result==null")
    public List<Metaoperation> selectAll() {
        MetaoperationExample operationExample = new MetaoperationExample();
        MetaoperationExample.Criteria criteria = operationExample.createCriteria();
        criteria.andMonameIsNotNull();
        return metaoperationMapper.selectByExample(operationExample);
    }

    @Override
    @Caching(
            evict = {
                    @CacheEvict(value = "navigationbar",allEntries = true),
                    @CacheEvict(value = "privsevict",allEntries = true),
                    @CacheEvict(value = "privgroupIsExistBypidAndpgroupId",allEntries = true),
                    @CacheEvict(value = "roleprivsevict",allEntries = true),
                    @CacheEvict(value = "roleprivsIntevict",allEntries = true),
                    @CacheEvict(value = "sUserUserpojo",allEntries = true),
                    @CacheEvict(value = "operationlist",allEntries = true),
                    @CacheEvict(value = "operations",key = "#id"),
                    @CacheEvict(value = "privgroupBypid",key = "#id"),
                    @CacheEvict(value = "privrolesevict",key = "#id")
            }
    )
    public int deleteByPrimaryKey(Integer id) {
        redisUtils.delete("configAttributes:permissions");
        return metaoperationMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Caching(
            evict = {
                    @CacheEvict(value = "navigationbar",allEntries = true),
                    @CacheEvict(value = "privsevict",allEntries = true),
                    @CacheEvict(value = "privgroupIsExistBypidAndpgroupId",allEntries = true),
                    @CacheEvict(value = "roleprivsevict",allEntries = true),
                    @CacheEvict(value = "roleprivsIntevict",allEntries = true),
                    @CacheEvict(value = "sUserUserpojo",allEntries = true),
                    @CacheEvict(value = "operationlist",allEntries = true),
                    @CacheEvict(value = "operations",allEntries = true),
                    @CacheEvict(value = "privgroupBypid",allEntries = true),
                    @CacheEvict(value = "privrolesevict",allEntries = true)
            }
    )
    public int deleteByOperationName(String operationName) {
        redisUtils.delete("configAttributes:permissions");
        MetaoperationExample operationExample = new MetaoperationExample();
        MetaoperationExample.Criteria criteria = operationExample.createCriteria();
        criteria.andMonameEqualTo(operationName);
        return metaoperationMapper.deleteByExample(operationExample);
    }

    @Override
    @Caching(
            evict = {
                    @CacheEvict(value = "privsevict",allEntries = true),
                    @CacheEvict(value = "operationlist",allEntries = true),
                    @CacheEvict(value = "navigationbar",allEntries = true),
                    @CacheEvict(value = "privgroupIsExistBypidAndpgroupId",allEntries = true)
            }
    )
    public int insert(Metaoperation record) {
        redisUtils.delete("configAttributes:permissions");
        return metaoperationMapper.insertSelective(record);
    }

    @Override
    @Cacheable(value = "operations",key = "#id",unless = "#result==null")
    public Metaoperation selectByPrimaryKey(Integer id) {
        return metaoperationMapper.selectByPrimaryKey(id);
    }

    @Override
    @CachePut(value = "operations",key = "#result.moid",unless = "#result==null")
    public Metaoperation selectByOperationName(String operationName)
    {
        MetaoperationExample operationExample = new MetaoperationExample();
        MetaoperationExample.Criteria criteria = operationExample.createCriteria();
        criteria.andMonameEqualTo(operationName);
        List<Metaoperation> operations = metaoperationMapper.selectByExample(operationExample);
        return operations.isEmpty()?null:operations.get(0);
    }

    @Override
    @Cacheable(value = "navigationbar",key = "#root.methodName",unless = "#result==null")
    public List<Metaoperation> selectAllHeadNavBar() {
        MetaoperationExample metaoperationExample = new MetaoperationExample();
        metaoperationExample.createCriteria().andModescLike("HEAD_%");
        metaoperationExample.setOrderByClause("'moid' ASC");
        return metaoperationMapper.selectByExample(metaoperationExample);
    }

    @Override
    @Cacheable(value = "navigationbar",key = "#headname+'--'+#root.methodName.toString()",unless = "#result==null")
    public List<Metaoperation> selectAllChildNavBarByHead(String headname) {
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
                    @CacheEvict(value = "navigationbar",allEntries = true),
                    @CacheEvict(value = "sUserUserpojo",allEntries = true)
            }
    )
    public int updateByPrimaryKey(Metaoperation record) {
        redisUtils.delete("configAttributes:permissions");
        if (record.getMoid()==null){
            logger.error("待更新的对象record中的id属性不能为空");
            return 0;
        }
        return metaoperationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    @Caching(
            evict = {
                    @CacheEvict(value = "operations",allEntries = true),
                    @CacheEvict(value = "roleprivs",allEntries = true),
                    @CacheEvict(value = "navigationbar",allEntries = true),
                    @CacheEvict(value = "sUserUserpojo",allEntries = true)
            }
    )
    public int updateByOperationName(String operationName, Metaoperation record)
    {
        redisUtils.delete("configAttributes:permissions");
        MetaoperationExample operationExample = new MetaoperationExample();
        MetaoperationExample.Criteria criteria = operationExample.createCriteria();
        criteria.andMonameEqualTo(operationName);
        return metaoperationMapper.updateByExampleSelective(record,operationExample);
    }

    @Override
    @Cacheable(value = "navigationbar",key = "#role.rdesc+'--'+#root.methodName.toString()+#privGroup.pgid.toString()")
    public List<ReturningPrivFourLevel> selectPrivFourLeverByRoleAndPrivgroup(Role role, Prigroup privGroup) {

        List<ReturningPrivFourLevel> returningPrivFourLevels = rolePrivService.selectErJiBiaoTiChildrenByRole(role.getRid(), privGroup.getPrigroupdesc());

        logger.debug("角色为:"+role.getRname()+"  大导航为:"+privGroup.getPrigroupname()+"  二级导航栏为: "+returningPrivFourLevels);

        if (returningPrivFourLevels!=null&&!returningPrivFourLevels.isEmpty()){

            for (ReturningPrivFourLevel returningPrivFourLevel : returningPrivFourLevels) {
                List<Metaoperation> metaoperations = prigroupService.selectInAPrivGoupprivsByRoleAndFourlever(privGroup.getPgid(), role.getRid(), returningPrivFourLevel.getId());
                System.out.println("groupid: "+privGroup.getPgid()+" roleid: "+role.getRid()+" 子标题id:  "+returningPrivFourLevel.getId()+metaoperations);
                List<ReturningPriv> returningPrivs = new ArrayList<>();
                if (metaoperations!=null&&!metaoperations.isEmpty()){
                    for (Metaoperation metaoperation : metaoperations) {
                        returningPrivs.add(new ReturningPriv(metaoperation.getMoid(),metaoperation.getMoname(),metaoperation.getMolurl()));
                    }
                    returningPrivFourLevel.setChildren(returningPrivs);
                }

            }
        }

        logger.debug("角色为:"+role.getRname()+"权限组为:"+privGroup.getPrigroupname()+"下的所有子权限为:"+returningPrivFourLevels);

        return returningPrivFourLevels;
    }

    @Override
    public List<ReturningPriv> selectPrivsByPrivFourLever(MetaOperationService metaOperationService) {
        return null;
    }

    @Override
    @Cacheable(value = "operationlist",key = "#privgoupdesc+'--'+#root.methodName.toString()")
    public List<Metaoperation> selectPrivsByPrivGroupDesc(String privgoupdesc) {
        MetaoperationExample metaoperationExample = new MetaoperationExample();
        metaoperationExample.createCriteria().andModescLike(privgoupdesc+"%");
        metaoperationExample.or().andModescLike("_"+privgoupdesc+"%");
        return metaoperationMapper.selectByExample(metaoperationExample);
    }
}
