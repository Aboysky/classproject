package cn.edu.sicnu.cs.service.impl;

import cn.edu.sicnu.cs.AuthenticationService;
import cn.edu.sicnu.cs.model.Metaoperation;
import cn.edu.sicnu.cs.service.PrigroupService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
    }

    @Test
    void selectPnameByPid() {
    }

    @Test
    void selectPidByPname() {
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