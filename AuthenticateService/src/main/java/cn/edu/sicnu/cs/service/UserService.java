package cn.edu.sicnu.cs.service;

import cn.edu.sicnu.cs.model.User;
import cn.edu.sicnu.cs.pojo.NavigationBar;
import cn.edu.sicnu.cs.pojo.NavigationBarChilren;
import cn.edu.sicnu.cs.pojo.PageResult;
import cn.edu.sicnu.cs.pojo.UserPojo;
import cn.edu.sicnu.cs.utils.PageRequest;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2020/11/19 20:23
 * @Created by Huan
 */
public interface UserService{

    /**
     * 增加用户
     * @param user 需要增加的用户
     * @return 是否插入成功
     */
    @Transactional
    int insertUser(User user) throws SQLIntegrityConstraintViolationException;

    /**
     * 删除用户通过UID
     * @param uid 用户id
     * @return 删除是否成功
     */
    @Transactional
    int deleteUserByUid(int uid) throws SQLIntegrityConstraintViolationException;

    /**
     * 删除用户通过用户名
     * @param userName 用户名
     * @return 是否删除成功
     */
    @Transactional
    int deleteUserByUserName(String userName) throws SQLIntegrityConstraintViolationException;

    /**
     * 批量删除用户通过公司id
     * @param companyId 公司id
     * @return 是否删除成功
     */
    @Transactional
    int deleteUsersByCompanyId(int companyId) throws SQLIntegrityConstraintViolationException;

    @Transactional
    int deleteUsersByRoleId(int roleId);

    @Transactional
    int deleteUserSByRoleName(String rolename);

//    int deleteUserByMobile(String mobile);
//
//    int deleleUserByEmail(String emale);

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    User selectUserByUid(int uid);

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    UserPojo selectUserPojoByUid(int uid);

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    UserPojo selectUserPojoByUsername(String username);

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    User selectUserByUsername(String username);

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    User selectUserByMobile(String mobile);

//    User selectUserByEmail(String emali);

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    String selectUserNameByUid(int uid);

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    int selectUseridByUserName(String username);

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<User> selectAll();

    @Transactional
    int updateUserByUid(int uid,User user) throws SQLIntegrityConstraintViolationException;

    @Transactional
    int updateUserByUserName(String username,User user) throws SQLIntegrityConstraintViolationException;

    @Transactional
    int updateUserNameByUid(int uid,String username) throws SQLIntegrityConstraintViolationException;

    @Transactional
    int updatePasswordByUid(int uid,String oldPassword,String newpassword) throws SQLIntegrityConstraintViolationException;

    @Transactional
    int updateMobileByUid(int uid,String password,String mobile) throws SQLIntegrityConstraintViolationException;

    @Transactional
    int updatePasswordByUserName(String userName,String oldPassword,String newpassword) throws SQLIntegrityConstraintViolationException;


    @Transactional
    int updateDeletedByUid(int uid) throws SQLIntegrityConstraintViolationException;

    @Transactional
    int updateDeletedByUserName(String username) throws SQLIntegrityConstraintViolationException;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<NavigationBar> selectNavigationBarByUsername(String username);

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<NavigationBarChilren> selectNavigationBarChildrenByUsername(Integer roleid,Integer privid);

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    List<User> selectAllSysUser();

    PageResult findPage(PageRequest pageRequest);

}
