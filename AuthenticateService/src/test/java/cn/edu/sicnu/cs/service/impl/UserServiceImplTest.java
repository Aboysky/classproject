//package cn.edu.sicnu.cs.service.impl;
//
//import cn.edu.sicnu.cs.AuthenticationService;
//import cn.edu.sicnu.cs.model.User;
//import cn.edu.sicnu.cs.service.UserService;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Date;
//
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// * @Classname UserServiceImplTest
// * @Description TODO
// * @Date 2020/11/15 22:11
// * @Created by Huan
// */
//@SpringBootTest(classes = AuthenticationService.class)
//@RunWith(SpringRunner.class)
//class UserServiceImplTest {
//
//    @Autowired
//    UserService userService;
//
//    @Test
//    void addUserByUser() {
//        User user = new User(1,"1","1",1,"1","f","1","1","1",1,"1",new Date(),new Date(),"1");
//        User user1 = new User(2,"2","2",2,"2","f","0","2","2",1,"2",new Date(),new Date(),"0");
//        userService.addUserByUser(user1);
//    }
//
//    @Test
//    void deleteUserByUid() {
//        int i = userService.deleteUserByUid(1);
//        System.out.println(i);
//    }
//
//    @Test
//    void deleteUserByUserName() {
//        System.out.println(userService.deleteUserByUserName("1"));
//    }
//
//    @Test
//    void findUserByUid() {
//        System.out.println(userService.findUserByUid(2));
//    }
//
//    @Test
//    void findUserByUserName() {
//        System.out.println(userService.findUserByUserName("2"));
//    }
//
//    @Test
//    void findUserByMobile() {
//    }
//
//    @Test
//    void findUserByEmail() {
//    }
//
//    @Test
//    void findUsersLikeUserName() {
//    }
//
//    @Test
//    void findUsersByCompany() {
//    }
//
//    @Test
//    void findUserVisitsByUid() {
//    }
//
//    @Test
//    void findUsernameByUid() {
//    }
//
//    @Test
//    void findUidByUsername() {
//    }
//
//    @Test
//    void updateUserNameByUid() {
//    }
//
//    @Test
//    void updateUserByUid() {
//    }
//
//    @Test
//    void updateUserByUserName() {
//    }
//
//    @Test
//    void updateUserPasswordByUsernameAndOldPassword() {
//    }
//
//    @Test
//    void updateVisitsByUid() {
//    }
//
//    @Test
//    void updateIpByUid() {
//    }
//
//    @Test
//    void updateLastByUid() {
//    }
//
//    @Test
//    void updateLockedByUid() {
//    }
//}