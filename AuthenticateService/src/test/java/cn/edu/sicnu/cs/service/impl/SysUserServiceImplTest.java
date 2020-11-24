//package cn.edu.sicnu.cs.service.impl;
//
//import cn.edu.sicnu.cs.AuthenticationService;
//import cn.edu.sicnu.cs.model.ClientStatus;
//import cn.edu.sicnu.cs.model.Sysuser;
//import cn.edu.sicnu.cs.model.User;
//import cn.edu.sicnu.cs.service.SysUserService;
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
// * @Classname SysUserServiceImplTest
// * @Description TODO
// * @Date 2020/11/15 23:37
// * @Created by Huan
// */
//@SpringBootTest(classes = AuthenticationService.class)
//@RunWith(SpringRunner.class)
//class SysUserServiceImplTest {
//
//    @Autowired
//    SysUserService sysUserService;
//
//
//    @Test
//    void addUserByUser() {
//        Sysuser user = new Sysuser(1,1,"1","1",1,"1","f","1","1","1",new Date(),1,"1",new Date(),"0","1");
//        Sysuser user1 = new Sysuser(2,2,"2","2",2,"2","f","2","2","1",new Date(),1,"1",new Date(),"0","1");
//        sysUserService.addUserByUser(user);
//
//    }
//
//    @Test
//    void deleteUserByUid() {
//    }
//
//    @Test
//    void testAddUserByUser() {
//    }
//
//    @Test
//    void testDeleteUserByUid() {
//    }
//
//    @Test
//    void deleteUserByUserName() {
//    }
//
//    @Test
//    void findUserByUid() {
//    }
//
//    @Test
//    void findUserByUserName() {
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
//    void updateClientStatusByUid() {
//        int i;
//        i = sysUserService.updateClientStatusByUid(1, ClientStatus.away);
//        System.out.println(i);
//    }
//
//    @Test
//    void updateDeptByUid() {
//    }
//}