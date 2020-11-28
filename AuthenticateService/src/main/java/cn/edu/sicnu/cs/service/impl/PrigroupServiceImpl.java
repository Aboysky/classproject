package cn.edu.sicnu.cs.service.impl;

import cn.edu.sicnu.cs.dao.PrigroupMapper;
import cn.edu.sicnu.cs.dao.PrigrouprelationMapper;
import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Prigroup;
import cn.edu.sicnu.cs.model.PrigroupExample;
import cn.edu.sicnu.cs.model.PrigrouprelationExample;
import cn.edu.sicnu.cs.pojo.PrivGroup;
import cn.edu.sicnu.cs.service.MetaOperationService;
import cn.edu.sicnu.cs.service.PriGroupRelationService;
import cn.edu.sicnu.cs.service.PrigroupService;
import cn.edu.sicnu.cs.service.RoleService;
import io.jsonwebtoken.lang.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Classname PrigroupServiceImpl
 * @Description TODO
 * @Date 2020/11/16 11:21
 * @Created by Huan
 */
@Service
public class PrigroupServiceImpl implements PrigroupService {

    private static final Logger logger = LoggerFactory.getLogger(PrigroupServiceImpl.class);

    @Resource
    PrigroupMapper prigroupMapper;

    @Autowired
    PriGroupRelationService priGroupRelationService;

    @Autowired
    RoleService roleService;

    @Autowired
    MetaOperationService metaOperationService;

    @Override
    @Caching(
            evict = {
                    @CacheEvict(value = "navigationbar",allEntries = true),
                    @CacheEvict(value = "prigroup",key = "#id")
            }
    )
    public int deleteByPrimaryKey(Integer id) {
        int i = prigroupMapper.deleteByPrimaryKey(id);
        int i1 = priGroupRelationService.deleteAllRelationEqualtoGid(id);
        return i>=1&&i1>=1?1:0;
    }

    @Override
    @Caching(
            evict = {
                    @CacheEvict(value = "navigationbar",allEntries = true),
                    @CacheEvict(value = "prigrouplist",allEntries = true),
            }
    )
    public int insert(Prigroup record) {
        return prigroupMapper.insertSelective(record);
    }

    @Override
    @Cacheable(value = "prigroup",key = "#id")
    public Prigroup selectByPrimaryKey(Integer id) {
        return prigroupMapper.selectByPrimaryKey(id);
    }

    @Override
    @Caching(
            cacheable = {
                    @Cacheable(value = "prigroupname",key = "#privgroupname")
            },
            put = {
                    @CachePut(value = "prigroup",key = "#result.pgid")
            }
    )
    public Prigroup selectByPrivName(String privgroupname) {
        PrigroupExample prigroupExample = new PrigroupExample();
        prigroupExample.createCriteria().andPrigroupnameEqualTo(privgroupname);
        List<Prigroup> prigroups = prigroupMapper.selectByExample(prigroupExample);
        if (!prigroups.isEmpty()){
            return prigroups.get(0);
        }
        return null;
    }

    @Override
    @Cacheable(value = "prigroupprivs",key = "#pgroupid.toString()+'--'+#root.methodName")
    public List<Metaoperation> selectPrivilegesByPrimaryKey(Integer pgroupid) {
        return priGroupRelationService.selectPrivilegesByPrigroupId(pgroupid);
    }

    @Override
    @Caching(
            evict = {
                    @CacheEvict(value = "prigroup",key = "#record.pgid"),
                    @CacheEvict(value = "prigrouplist",allEntries = true)
            }
    )
    public int updateByPrimaryKey(Prigroup record) {
        if (record.getPgid()==null){
            logger.error("待更新的对象record中的id属性不能为空");
            return 0;
        }
        return prigroupMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    @Cacheable(value = "prigroupprivs",key = "#groupid+'--'+#roleid")
    public List<Metaoperation> selectInAPrivGoupprivsByRole(Integer groupid, Integer roleid) {
        List<Metaoperation> metaoperations = this.selectPrivilegesByPrimaryKey(groupid);
        List<Metaoperation> metaoperations1 = roleService.selectPrivilegesByRid(roleid);
        List<Metaoperation> metaoperations2 = new ArrayList<>();
        for (Metaoperation metaoperation : metaoperations) {
            if (metaoperation!=null){
                for (Metaoperation metaoperation1 : metaoperations1) {
                    if (metaoperation1!=null){
                        if (metaoperation.getMoid().equals(metaoperation1.getMoid())){
                            metaoperations2.add(metaoperation);
                        }
                    }
                }
            }
        }
        return metaoperations2;
    }

    @Override
    public List<Metaoperation> selectInAPrivGoupprivsByRoleAndFourlever(Integer groupid, Integer roleid, Integer zibiaoti) {
        Metaoperation metaoperation2 = metaOperationService.selectByPrimaryKey(zibiaoti);


        List<Metaoperation> metaoperations = this.selectPrivilegesByPrimaryKey(groupid);

        List<Metaoperation> metaoperations1 = roleService.selectPrivilegesByRid(roleid);


        List<Metaoperation> metaoperations2 = new ArrayList<>();
        for (Metaoperation metaoperation : metaoperations) {
            if (metaoperation!=null){
                for (Metaoperation metaoperation1 : metaoperations1) {
                    if (metaoperation1!=null){
                        if (metaoperation.getMoid().equals(metaoperation1.getMoid())&& Strings.startsWithIgnoreCase(metaoperation.getModesc(),metaoperation2.getModesc()+"_")){
                            metaoperations2.add(metaoperation);
                        }
                    }
                }
            }
        }
        return metaoperations2;
    }

    @Override
    @Cacheable(value = "prigrouplist",key = "#root.methodName")
    public List<Prigroup> selectAll() {
        PrigroupExample prigroupExample = new PrigroupExample();
        prigroupExample.createCriteria().andPgidIsNotNull();
        List<Prigroup> prigroups = prigroupMapper.selectByExample(prigroupExample);
        return prigroups;
    }
}
