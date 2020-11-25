package cn.edu.sicnu.cs.service.impl;

import cn.edu.sicnu.cs.AuthenticationService;
import cn.edu.sicnu.cs.pojo.UserPojo;
import cn.edu.sicnu.cs.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Classname SysUserServiceImplTest
 * @Description TODO
 * @Date 2020/11/15 23:37
 * @Created by Huan
 */
@SpringBootTest(classes = AuthenticationService.class)
@RunWith(SpringRunner.class)
class SysUserServiceImplTest {

    @Autowired
    UserService userService;


    @Test
    void addUserByUser() {
        UserPojo userPojo = userService.selectUserPojoByUid(1);
        System.out.println(userPojo);

         userPojo = userService.selectUserPojoByUid(1);
        System.out.println(userPojo);

         userPojo = userService.selectUserPojoByUid(1);
        System.out.println(userPojo);
         userPojo = userService.selectUserPojoByUid(1);
        System.out.println(userPojo);
         userPojo = userService.selectUserPojoByUid(1);
        System.out.println(userPojo);

        System.out.println("\n\n\n\n\n\n");
        UserPojo userPojo1 = userService.selectUserPojoByUid(1);
        System.out.println("\n\n\n\n\n\n");

    }

    @Test
    void deleteUserByUid() {
    }

    @Test
    void testAddUserByUser() {
    }

    @Test
    void testDeleteUserByUid() {
    }

    @Test
    void deleteUserByUserName() {
    }

    @Test
    void findUserByUid() {
    }

    @Test
    void findUserByUserName() {
    }

    @Test
    void findUserByMobile() {
    }

    @Test
    void findUserByEmail() {
    }

    @Test
    void findUsersLikeUserName() {
    }

    @Test
    void findUserVisitsByUid() {
    }

    @Test
    void findUsernameByUid() {
    }

    @Test
    void findUidByUsername() {
    }

    @Test
    void updateUserNameByUid() {
    }

    @Test
    void updateUserByUid() {
    }

    @Test
    void updateUserByUserName() {
    }

    @Test
    void updateUserPasswordByUsernameAndOldPassword() {
    }

    @Test
    void updateVisitsByUid() {
    }

    @Test
    void updateIpByUid() {
    }

    @Test
    void updateLastByUid() {
    }

    @Test
    void updateDeptByUid() {
    }
}