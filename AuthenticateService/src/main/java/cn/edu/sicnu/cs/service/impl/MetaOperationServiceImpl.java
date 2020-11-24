package cn.edu.sicnu.cs.service.impl;

import cn.edu.sicnu.cs.dao.MetaoperationMapper;
import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.MetaoperationExample;
import cn.edu.sicnu.cs.pojo.NavigationBarChilren;
import cn.edu.sicnu.cs.service.MetaOperationService;
import cn.edu.sicnu.cs.utils.RedisUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    @Override
    public List<Metaoperation> selectAll() {
        MetaoperationExample operationExample = new MetaoperationExample();
        MetaoperationExample.Criteria criteria = operationExample.createCriteria();
        criteria.andMonameIsNotNull();
        return metaoperationMapper.selectByExample(operationExample);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        RedisUtils.delete("configAttributes:permissions");
        return metaoperationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByOperationName(String operationName) {
        RedisUtils.delete("configAttributes:permissions");
        MetaoperationExample operationExample = new MetaoperationExample();
        MetaoperationExample.Criteria criteria = operationExample.createCriteria();
        criteria.andMonameEqualTo(operationName);
        return metaoperationMapper.deleteByExample(operationExample);
    }

    @Override
    public int insert(Metaoperation record) {
        RedisUtils.delete("configAttributes:permissions");
        return metaoperationMapper.insertSelective(record);
    }

    @Override
    public Metaoperation selectByPrimaryKey(Integer id) {
        return metaoperationMapper.selectByPrimaryKey(id);
    }

    @Override
    public Metaoperation selectByOperationName(String operationName)
    {
        MetaoperationExample operationExample = new MetaoperationExample();
        MetaoperationExample.Criteria criteria = operationExample.createCriteria();
        criteria.andMonameEqualTo(operationName);
        List<Metaoperation> operations = metaoperationMapper.selectByExample(operationExample);
        return operations.isEmpty()?null:operations.get(0);
    }

    @Override
    public List<Metaoperation> selectAllHeadNavBar() {
        MetaoperationExample metaoperationExample = new MetaoperationExample();
        metaoperationExample.createCriteria().andModescLike("HEAD_%");
        metaoperationExample.setOrderByClause("'moid' ASC");
        return metaoperationMapper.selectByExample(metaoperationExample);
    }

    @Override
    public List<Metaoperation> selectAllChildNavBarByHead(String headname) {
        MetaoperationExample metaoperationExample = new MetaoperationExample();
        headname = headname.toLowerCase();
        metaoperationExample.createCriteria().andModescLike(headname+"_%");
        metaoperationExample.setOrderByClause("'moid' ASC");
        return metaoperationMapper.selectByExample(metaoperationExample);
    }

    @Override
    public int updateByPrimaryKey(Metaoperation record) {
        RedisUtils.delete("configAttributes:permissions");
        if (record.getMoid()==null){
            logger.error("待更新的对象record中的id属性不能为空");
            return 0;
        }
        return metaoperationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByOperationName(String operationName, Metaoperation record)
    {
        RedisUtils.delete("configAttributes:permissions");
        MetaoperationExample operationExample = new MetaoperationExample();
        MetaoperationExample.Criteria criteria = operationExample.createCriteria();
        criteria.andMonameEqualTo(operationName);
        return metaoperationMapper.updateByExampleSelective(record,operationExample);
    }
}
