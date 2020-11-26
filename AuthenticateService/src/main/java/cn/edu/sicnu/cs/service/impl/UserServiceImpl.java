package cn.edu.sicnu.cs.service.impl;

import cn.edu.sicnu.cs.dao.UserMapper;
import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Role;
import cn.edu.sicnu.cs.model.User;
import cn.edu.sicnu.cs.model.UserExample;
import cn.edu.sicnu.cs.pojo.NavigationBar;
import cn.edu.sicnu.cs.pojo.NavigationBarChilren;
import cn.edu.sicnu.cs.pojo.PageResult;
import cn.edu.sicnu.cs.pojo.UserPojo;
import cn.edu.sicnu.cs.service.MetaOperationService;
import cn.edu.sicnu.cs.service.RolePrivService;
import cn.edu.sicnu.cs.service.RoleService;
import cn.edu.sicnu.cs.service.UserService;
import cn.edu.sicnu.cs.utils.PageRequest;
import cn.edu.sicnu.cs.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2020/11/19 20:45
 * @Created by Huan
 */
@Service
public class UserServiceImpl implements UserService {

    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    UserMapper userMapper;

    @Autowired
    RoleService roleService;

    @Autowired
    RolePrivService rolePrivService;

    @Autowired
    MetaOperationService metaOperationService;

    @Override
    public int insertUser(User user) throws SQLIntegrityConstraintViolationException{

        if (StringUtils.isEmpty(user.getUsername())||StringUtils.isBlank(user.getUsername())){
            logger.error("增加用户时用户名不能为空" );
             return 0;
        }
        if (StringUtils.isEmpty(user.getPassword())||StringUtils.isBlank(user.getPassword())){
            logger.error("增加用户时密码不能为空" );
            return 0;
        }
        if (StringUtils.isEmpty(user.getUmobile())||StringUtils.isBlank(user.getUmobile())){
            logger.error("增加用户时手机号不能为空" );
            return 0;
        }
        if (user.getUroleId()==null){
            logger.error("增加用户角色id不能为空" );
            return 0;
        }
        return userMapper.insertSelective(user);
    }

    @Override
    @CacheEvict(value = {"sUserUser","sUserUserpojo","sUserUsername","sUserUserId"},key = "#uid")
    public int deleteUserByUid(int uid) throws SQLIntegrityConstraintViolationException {
        return  this.updateDeletedByUid(uid);
    }

    @Override
    @CacheEvict(value = {"sUserUser","sUserUserpojo","sUserUsername","sUserUserId"},key = "#userServiceImpl.selectUseridByUserName(#userName)")
    public int deleteUserByUserName(String userName) throws SQLIntegrityConstraintViolationException {
        return  this.updateDeletedByUserName(userName);
    }

    @Override
    @CacheEvict(value = {"sUserUser","sUserUserpojo","sUserUsername","sUserUserId"},allEntries = true)
    public int deleteUsersByCompanyId(int companyId) throws SQLIntegrityConstraintViolationException {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUcompanyIdEqualTo(companyId);

        List<User> users = userMapper.selectByExample(userExample);

        int sum = 0;
        for (User user : users) {
            sum+=this.updateDeletedByUid(user.getUid());
        }

        return sum;
    }

    @Override
    @CacheEvict(value = {"sUserUser","sUserUserpojo","sUserUsername","sUserUserId"},allEntries = true)
    public int deleteUsersByRoleId(int roleId) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUroleIdEqualTo(roleId).andUdeletedEqualTo("0");
        User user= new User();
        user.setUdeleted("1");
        return userMapper.updateByExampleSelective(user,userExample );
    }

    @Override
    @CacheEvict(value = {"sUserUser","sUserUserpojo","sUserUsername","sUserUserId"},allEntries = true)
    public int deleteUserSByRoleName(String rolename) {
        Role role = roleService.selectRoleByRoleName(rolename);
        if (role!=null){
            Integer rid = role.getRid();
            return this.deleteUsersByRoleId(rid);
        }
        return 0;
    }

//    @Override
//    public int deleteUserByMobile(String mobile) {
//        return 0;
//    }
//
//    @Override
//    public int deleleUserByEmail(String emale) {
//        return 0;
//    }

    @Override
    @Cacheable(value = "sUserUser",key = "#uid")
    public User selectUserByUid(int uid) {
        return userMapper.selectByPrimaryKey(uid);
    }

    @Override
    @Cacheable(value = "sUserUserpojo",key = "#uid")
    public UserPojo selectUserPojoByUid(int uid) {
        User user = userMapper.selectByPrimaryKey(uid);

        return new UserPojo(user.getUid(),user.getUsername(),
                user.getPassword(),roleService.selectByPrimaryKey(user.getUroleId()),
                user.getUlocked(),user.getUdeleted(),user.getUlasttime(),
                roleService.selectPrivilegesByRid(user.getUroleId()));
    }

    @Override
    @Cacheable(value = "sUserUserpojo",key = "#userServiceImpl.selectUseridByUserName(#username)")
    public UserPojo selectUserPojoByUsername(String username) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username).andUdeletedEqualTo("0");
        List<User> users = userMapper.selectByExample(userExample);
        if (!users.isEmpty()){
            User user = users.get(0);
            return new UserPojo(user.getUid(),user.getUsername(),
                    user.getPassword(),roleService.selectByPrimaryKey(user.getUroleId()),
                    user.getUlocked(),user.getUdeleted(),user.getUlasttime(),
                    roleService.selectPrivilegesByRid(user.getUroleId()));
        }
        return null;
    }

    @Override
    @Cacheable(value = "sUserUser",key = "#userServiceImpl.selectUseridByUserName(#username)")
    public User selectUserByUsername(String username) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username).andUdeletedEqualTo("0");
        List<User> users = userMapper.selectByExample(userExample);
        if (!users.isEmpty()){
            return users.get(0);
        }
        return null;
    }

    @Override
    @Cacheable(value = "sUserUser",key = "#userServiceImpl.selectUserByMobile(#mobile).uid")
    public User selectUserByMobile(String mobile) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUmobileEqualTo(mobile).andUdeletedEqualTo("0");
        List<User> users = userMapper.selectByExample(userExample);
        if (!users.isEmpty()){
            return users.get(0);
        }
        return null;
    }

    @Override
    @Cacheable(value = "sUserUsername",key = "#uid")
    public String selectUserNameByUid(int uid) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUidEqualTo(uid).andUdeletedEqualTo("0");
        List<User> users = userMapper.selectByExample(userExample);
        if (!users.isEmpty()){
            return users.get(0).getUsername();
        }
        return null;
    }

    @Override
    @Cacheable(value = "sUserUserId",key = "#userServiceImpl.selectUseridByUserName(#username)")
    public int selectUseridByUserName(String username) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username).andUdeletedEqualTo("0");
        List<User> users = userMapper.selectByExample(userExample);
        if (!users.isEmpty()){
            return users.get(0).getUid();
        }
        return 0;
    }

    @Override
    @Cacheable(value = "sUserUser",key = "#root.methodName")
    public List<User> selectAll() {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameIsNotNull().andUdeletedEqualTo("0");
        return userMapper.selectByExample(userExample);
    }

    @Override
    @CacheEvict(cacheNames = {"sUserUser","sUserUserpojo","sUserUsername","sUserUserId"},key = "#uid")
    public int updateUserByUid(int uid, User user) throws SQLIntegrityConstraintViolationException{
        if(user!=null){
            user.setUid(uid);
            return userMapper.updateByPrimaryKeySelective(user);
        }
        return 0;
    }

    @Override
    @CacheEvict(cacheNames = {"sUserUser","sUserUserpojo","sUserUsername","sUserUserId"},key = "#userServiceImpl.selectUseridByUserName(#username)")
    public int updateUserByUserName(String username, User user)throws SQLIntegrityConstraintViolationException {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username).andUdeletedEqualTo("0");
        return userMapper.updateByExampleSelective(user,userExample);
    }

    @Override
    @CacheEvict(cacheNames = {"sUserUser","sUserUserpojo","sUserUsername","sUserUserId"},key = "#uid")
    public int updateUserNameByUid(int uid, String username) throws SQLIntegrityConstraintViolationException{
        User user = new User();
        user.setUsername(username);

        return this.updateUserByUid(uid,user);
    }

    @Override
    @CacheEvict(cacheNames = {"sUserUser","sUserUserpojo","sUserUsername","sUserUserId"},key = "#uid")
    public int updatePasswordByUid(int uid, String oldPassword, String newpassword)throws SQLIntegrityConstraintViolationException {
        User user = new User();
        user.setPassword(newpassword);
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPasswordEqualTo(oldPassword).andUidEqualTo(uid).andUdeletedEqualTo("0");
        return userMapper.updateByExampleSelective(user,userExample);
    }

    @Override
    @CacheEvict(cacheNames ={"sUserUser","sUserUserpojo","sUserUsername","sUserUserId"},key = "#userServiceImpl.selectUseridByUserName(#userName)")
    public int updatePasswordByUserName(String userName, String oldPassword, String newpassword) throws SQLIntegrityConstraintViolationException{
        User user = new User();
        user.setPassword(newpassword);
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPasswordEqualTo(oldPassword).andUsernameEqualTo(userName).andUdeletedEqualTo("0");
        return userMapper.updateByExampleSelective(user,userExample);
    }

    @Override
    @CacheEvict(cacheNames = {"sUserUser","sUserUserpojo","sUserUsername","sUserUserId"},key = "#uid")
    public int updateMobileByUid(int uid, String password, String mobile) throws SQLIntegrityConstraintViolationException{
        User user = new User();
        user.setUmobile(mobile);
        UserExample userExample = new UserExample();
        userExample.createCriteria().andPasswordEqualTo(password).andUidEqualTo(uid).andUdeletedEqualTo("0");
        return userMapper.updateByExampleSelective(user,userExample);
    }

    @Override
    @CacheEvict(cacheNames = {"sUserUser","sUserUserpojo","sUserUsername","sUserUserId"},key = "#uid")
    public int updateDeletedByUid(int uid) throws SQLIntegrityConstraintViolationException{
        User user = new User();
        user.setUid(uid);
        user.setUdeleted("1");
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    @CacheEvict(cacheNames = {"sUserUser","sUserUserpojo","sUserUsername","sUserUserId"},key = "#userServiceImpl.selectUseridByUserName(#username)")
    public int updateDeletedByUserName(String username)throws SQLIntegrityConstraintViolationException {
        User user = new User();
        user.setUdeleted("1");

        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username).andUdeletedEqualTo("0");
        return userMapper.updateByExampleSelective(user,userExample);
    }

    @Override
    @Cacheable(value = "navigationbar",key = "#userServiceImpl.selectUseridByUserName(#username)")
    public List<NavigationBar> selectNavigationBarByUsername(String username) {
        User user = this.selectUserByUsername(username);
        if (user!=null){
            return rolePrivService.selectNavBarByRole(user.getUroleId());
        }
        return null;
    }

    @Override
    @Cacheable(value = "navigationBarChilren",key = "#roleid+'--'+#privid")
    public List<NavigationBarChilren> selectNavigationBarChildrenByUsername(Integer roleid,Integer privid) {
        Metaoperation metaoperation = metaOperationService.selectByPrimaryKey(privid);
        return rolePrivService.selectNavBarChildrenByRole(roleid, metaoperation.getModesc());
    }

    @Override
    @Cacheable(value = "sUserUserPage",key = "#root.methodName")
    public List<User> selectAllSysUser() {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUroleIdNotEqualTo(1).andUdeletedEqualTo("0");
        return userMapper.selectByExample(userExample);
    }

    @Override
    @Cacheable(value = "sUserUserPage",key = "#pageRequest.pageNum+'-'+#pageRequest.pageSize")
    public PageResult findPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest));
    }

    /**
     * 调用分页插件完成分页
     * @param pageRequest
     * @return
     */
    private PageInfo<User> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<User> sysMenus = userMapper.selectPage();
        return new PageInfo<User>(sysMenus);
    }

}
