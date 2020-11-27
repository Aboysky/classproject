package cn.edu.sicnu.cs.service.impl;

import cn.edu.sicnu.cs.dao.PrigrouprelationMapper;
import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Prigroup;
import cn.edu.sicnu.cs.model.PrigrouprelationExample;
import cn.edu.sicnu.cs.model.PrigrouprelationKey;
import cn.edu.sicnu.cs.service.MetaOperationService;
import cn.edu.sicnu.cs.service.PriGroupRelationService;
import cn.edu.sicnu.cs.service.PrigroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname PriGroupRelationServiceImpl
 * @Description TODO
 * @Date 2020/11/16 11:59
 * @Created by Huan
 */
@Service
public class PriGroupRelationServiceImpl implements PriGroupRelationService {

    private static final Logger logger = LoggerFactory.getLogger(PriGroupRelationServiceImpl.class);

    @Resource
    PrigrouprelationMapper prigrouprelationMapper;

    @Autowired
    MetaOperationService metaOperationService;

    @Autowired
    PrigroupService prigroupService;

    @Override
    @Caching(

    )
    public int deleteByPrimaryKey(int pid, int gid) {
        return prigrouprelationMapper.deleteByPrimaryKey(new PrigrouprelationKey(gid,pid));
    }

    @Override
    public int deleteAllRelationEqualtoPid(int pid) {
        PrigrouprelationExample prigrouprelationExample = new PrigrouprelationExample();
        PrigrouprelationExample.Criteria criteria = prigrouprelationExample.createCriteria();
        criteria.andPidEqualTo(pid);
        return prigrouprelationMapper.deleteByExample(prigrouprelationExample);
    }

    @Override
    public int deleteAllRelationEqualtoGid(int gid) {
        PrigrouprelationExample prigrouprelationExample = new PrigrouprelationExample();
        PrigrouprelationExample.Criteria criteria = prigrouprelationExample.createCriteria();
        criteria.andGidEqualTo(gid);
        return prigrouprelationMapper.deleteByExample(prigrouprelationExample);
    }

    @Override
    public int insert(PrigrouprelationKey record) {
        return prigrouprelationMapper.insertSelective(record);
    }

    @Override
    public int insert(int gid, int pid) {
        PrigrouprelationKey record = new PrigrouprelationKey(gid,pid);
        return prigrouprelationMapper.insertSelective(record);
    }

    @Override
    public List<Metaoperation> selectPrivilegesByPrigroupId(int priGroupId) {
        PrigrouprelationExample prigrouprelationExample = new PrigrouprelationExample();
        PrigrouprelationExample.Criteria criteria = prigrouprelationExample.createCriteria();
        criteria.andGidEqualTo(priGroupId);
        List<PrigrouprelationKey> prigrouprelationKeys = prigrouprelationMapper.selectByExample(prigrouprelationExample);

        List<Metaoperation> privileges = new ArrayList<>();
        for (PrigrouprelationKey prigrouprelationKey : prigrouprelationKeys) {
            Metaoperation privilege = metaOperationService.selectByPrimaryKey(prigrouprelationKey.getPid());
            if (privilege!=null)
                privileges.add(privilege);
        }
        return privileges;
    }

    @Override
    public List<PrigrouprelationKey> selectPriGroupRelationKeysByPrivilegeId(int pid) {
        PrigrouprelationExample prigrouprelationExample = new PrigrouprelationExample();
        PrigrouprelationExample.Criteria criteria = prigrouprelationExample.createCriteria();
        criteria.andPidEqualTo(pid);
        return prigrouprelationMapper.selectByExample(prigrouprelationExample);
    }

    @Override
    public List<Prigroup> selectPriGroupByPrivilegeId(int pid) {
        PrigrouprelationExample prigrouprelationExample = new PrigrouprelationExample();
        PrigrouprelationExample.Criteria criteria = prigrouprelationExample.createCriteria();
        criteria.andPidEqualTo(pid);
        List<PrigrouprelationKey> prigrouprelationKeys = prigrouprelationMapper.selectByExample(prigrouprelationExample);
        List<Prigroup> prigroups = new ArrayList<>();
        for (PrigrouprelationKey key : prigrouprelationKeys) {
            Prigroup prigroup = prigroupService.selectByPrimaryKey(key.getGid());
            if (prigroup!=null)
                prigroups.add(prigroup);
        }
        return prigroups;
    }

    @Override
    public boolean selectIsExistByPidAndPriGroupId(int pid, int pgroupId) {
        PrigrouprelationExample prigrouprelationExample = new PrigrouprelationExample();
        PrigrouprelationExample.Criteria criteria = prigrouprelationExample.createCriteria();
        criteria.andPidEqualTo(pid).andGidEqualTo(pgroupId);
        List<PrigrouprelationKey> prigrouprelationKeys = prigrouprelationMapper.selectByExample(prigrouprelationExample);
        logger.debug("-------------->>>>> prigkeys"+prigrouprelationKeys);
        return !prigrouprelationKeys.isEmpty();
    }
}
