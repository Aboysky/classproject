package cn.edu.sicnu.cs.service.impl;

import cn.edu.sicnu.cs.dao.PrigroupMapper;
import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Prigroup;
import cn.edu.sicnu.cs.model.PrigroupExample;
import cn.edu.sicnu.cs.dto.PrivDto;
import cn.edu.sicnu.cs.dto.PrivGradationalDto;
import cn.edu.sicnu.cs.service.*;
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

    @Autowired
    RolePrivService rolePrivService;

    @Autowired
    PrigroupService prigroupService;

    @Override
    @Caching(
            evict = {
                    @CacheEvict(value = "navigationbar",cacheNames = "navigationbar",allEntries = true),
                    @CacheEvict(value = "prigroup",cacheNames = "prigroup",key = "#id"),
                    @CacheEvict(value = "privsevict",cacheNames = "privsevict",allEntries = true)
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
                    @CacheEvict(value = "navigationbar",cacheNames = "navigationbar",allEntries = true),
                    @CacheEvict(value = "privsevict",cacheNames = "privsevict",allEntries = true)
            }
    )
    public int insert(Prigroup record) {
        return prigroupMapper.insertSelective(record);
    }

    @Override
    @Cacheable(value = "prigroup",cacheNames = "prigroup",key = "#id",unless = "#result==null")
    public Prigroup selectByPrimaryKey(Integer id) {
        return prigroupMapper.selectByPrimaryKey(id);
    }

    @Override
    @Caching(
            cacheable = {
                    @Cacheable(value = "prigroupname",cacheNames = "prigroupname",key = "#privgroupname")
            },
            put = {
                    @CachePut(value = "prigroup",cacheNames = "prigroup",key = "#result.pgid")
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
    @Cacheable(value = "privsevict",cacheNames = "privsevict",key = "#pgroupid.toString()+'--'+#root.methodName.toString()",unless = "#result==null")
    public List<Metaoperation> selectPrivilegesByPrimaryKey(Integer pgroupid) {
        return priGroupRelationService.selectPrivilegesByPrigroupId(pgroupid);
    }

    @Override
    @Caching(
            evict = {
                    @CacheEvict(value = "prigroup",cacheNames = "prigroup",key = "#record.pgid"),
                    @CacheEvict(value = "privsevict",cacheNames = "privsevict",allEntries = true)
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
    @Cacheable(value = "privsevict",cacheNames = "privsevict",key = "#root.methodName.toString()+'--'+#groupid.toString()+'--'+#roleid.toString()",unless = "#result==null")
    public List<Metaoperation> selectinaprivgoupprivsbyrole(Integer groupid, Integer roleid) {
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
    @Cacheable(value = "privsevict",cacheNames = "privsevict",key = "#root.methodName.toString()+'--'+#groupid.toString()+'--'+#roleid.toString()+'--'+#zibiaoti.toString()",unless = "#result==null")
    public List<Metaoperation> selectInAPrivGoupprivsByRoleAndFourlever(Integer groupid, Integer roleid, Integer zibiaoti) {
        Metaoperation metaoperation2 = metaOperationService.selectByPrimaryKey(zibiaoti);

        List<Metaoperation> metaoperations = this.selectPrivilegesByPrimaryKey(groupid);

        logger.debug(" metaoperations: "+metaoperations);

        List<Metaoperation> metaoperations1 = roleService.selectPrivilegesByRid(roleid);

        List<Metaoperation> metaoperations2 = new ArrayList<>();
        for (Metaoperation metaoperation : metaoperations) {
            if (metaoperation!=null){
                for (Metaoperation metaoperation1 : metaoperations1) {
                    if (metaoperation1!=null){
                        if (metaoperation.getMoid().equals(metaoperation1.getMoid())&& Strings.startsWithIgnoreCase(metaoperation.getModesc(),"_"+metaoperation2.getModesc()+"_")){
                            metaoperations2.add(metaoperation);
                        }
                    }
                }
            }
        }
        return metaoperations2;
    }

    @Override
    @Cacheable(value = "privsevict",cacheNames = "privsevict",key = "#root.methodName.toString()+'--'+#groupid.toString()+#zibiaoti.toString()",unless = "#result==null")
    public List<Metaoperation> selectALLAPrivGoupprivsBygroupidAndzibiaoti(Integer groupid, Integer zibiaoti) {
        Metaoperation metaoperation2 = metaOperationService.selectByPrimaryKey(zibiaoti);


        List<Metaoperation> metaoperations = this.selectPrivilegesByPrimaryKey(groupid);

        logger.debug("id为:"+groupid+"的权限组的所有权限为:"+metaoperations);

        List<Metaoperation> metaoperations2 = new ArrayList<>();
        for (Metaoperation metaoperation : metaoperations) {
            if (metaoperation!=null){
                        if (Strings.startsWithIgnoreCase(metaoperation.getModesc(),"_"+metaoperation2.getModesc()+"_")){
                            metaoperations2.add(metaoperation);
                        }
            }
        }
        return metaoperations2;
    }

    @Override
    @Cacheable(value = "privsevict",cacheNames = "privsevict",key = "#root.methodName.toString()",unless = "#result==null")
    public List<Prigroup> selectAll() {
        PrigroupExample prigroupExample = new PrigroupExample();
        prigroupExample.createCriteria().andPgidIsNotNull();
        return prigroupMapper.selectByExample(prigroupExample);
    }

    @Override
    @Cacheable(value = "privsevict",cacheNames = "privsevict",key = "#root.methodName.toString()+'--'+#privGroup.prigroupname",unless = "#result==null")
    public List<PrivGradationalDto> selectAllFourLever(Prigroup privGroup) {
        List<PrivGradationalDto> privGradationalDtos = new ArrayList<>();
        privGradationalDtos = rolePrivService.selectAllErJiBiaoTiChildrenByGroupdesc(privGroup.getPrigroupdesc());

        logger.debug("大导航为:"+privGroup.getPrigroupname()+"  所有二级导航栏为: "+ privGradationalDtos);

        if (privGradationalDtos !=null&&!privGradationalDtos.isEmpty()){

            for (PrivGradationalDto privGradationalDto : privGradationalDtos) {
                List<Metaoperation> metaoperations = prigroupService.selectALLAPrivGoupprivsBygroupidAndzibiaoti(privGroup.getPgid(), privGradationalDto.getId());
                System.out.println("groupid: "+privGroup.getPgid()+" 子标题id:  "+ privGradationalDto.getId()+metaoperations);
                List<PrivDto> privDtos = new ArrayList<>();
                if (metaoperations!=null&&!metaoperations.isEmpty()){
                    for (Metaoperation metaoperation : metaoperations) {
                        privDtos.add(new PrivDto(metaoperation.getMoid(),metaoperation.getMoname(),metaoperation.getMolurl()));
                    }
                    privGradationalDto.setChildren(privDtos);
                }

            }
            return privGradationalDtos;
        }
        return null;
    }
}
