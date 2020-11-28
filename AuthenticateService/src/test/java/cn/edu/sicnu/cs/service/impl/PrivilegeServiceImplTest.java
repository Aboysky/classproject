package cn.edu.sicnu.cs.service.impl;

import cn.edu.sicnu.cs.AuthenticationService;
import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.model.Rolepriv;
import cn.edu.sicnu.cs.pojo.ReturningPriv;
import cn.edu.sicnu.cs.pojo.ReturningPrivFourLevel;
import cn.edu.sicnu.cs.pojo.UserPojo;
import cn.edu.sicnu.cs.service.PrigroupService;
import cn.edu.sicnu.cs.service.RolePrivService;
import cn.edu.sicnu.cs.service.RoleService;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Classname PrivilegeServiceTest
 * @Description TODO
 * @Date 2020/11/16 18:19
 * @Created by Huan
 */
@SpringBootTest(classes = AuthenticationService.class)
@RunWith(SpringRunner.class)
class PrivilegeServiceImplTest {

    @Autowired
    PrigroupService prigroupService;

    @Autowired
    RoleService roleService;

    @Autowired
    RolePrivService rolePrivService;
    @Test
    void deleteByPrimaryKey() {
        List<Metaoperation> metaoperations = prigroupService.selectInAPrivGoupprivsByRole(2, 5);
        metaoperations.forEach(System.out::println);
    }

    @Test   ///v1.1/user/{uid}/_pagepermissions
    void deleteByPname() {
//        System.out.println("\n\n\n\n\n\n\n");
//        System.out.println(prigroupService.selectPrivilegesByPrimaryKey(10001));
//        System.out.println("\n");
        System.out.println(prigroupService.selectInAPrivGoupprivsByRoleAndFourlever(10001, 2, 11));
//        System.out.println("\n\n\n\n\n\n\n");
    }


    @Test
    void selectAll() {
        System.out.println(rolePrivService.selectErJiBiaoTiChildrenByRole(2, "HEAD_FORM"));
    }

    @Test
    void selectPnameByPid() {
        System.out.println(prigroupService.selectInAPrivGoupprivsByRoleAndFourlever(10001, 2, 3));
    }

    @Test
    void selectPidByPname() {
      List<Rolepriv> userPojos = new ArrayList<>();
      userPojos.add(new Rolepriv(1,2,3));
        userPojos.add(new Rolepriv(2,2,3));
        userPojos.add(new Rolepriv(3,2,3));
        userPojos.add(new Rolepriv(4,2,3));
        for (Rolepriv userPojo : userPojos) {
            userPojo.setRoleid(3);
        }
        System.out.println(userPojos);
    }

    @Test
    void selectByPname() {
    }

    @Test
    void selectByPrimaryKey() {
    }

    @Test
    void updateByPrimaryKey() {
    }

    @Test
    void updatePnameByPid() {
    }
}