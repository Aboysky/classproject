package cn.edu.sicnu.cs.service.impl;

import cn.edu.sicnu.cs.AuthenticationService;
import cn.edu.sicnu.cs.entity.Log;
import cn.edu.sicnu.cs.query.LogQueryCriteria;
import cn.edu.sicnu.cs.service.LogService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Classname LogServiceImplTest
 * @Description TODO
 * @Date 2020/11/30 15:46
 * @Created by Huan
 */
@SpringBootTest(classes = AuthenticationService.class)
@RunWith(SpringRunner.class)
class LogServiceImplTest {

    @Autowired
    LogService logService;

    @Test
    void queryAll() {
        LogQueryCriteria logQueryCriteria = new LogQueryCriteria();
        logQueryCriteria.setLogType("INGO");
        List<Log> logs = logService.queryAll(logQueryCriteria);
        System.out.println(logs);
    }

    @Test
    void testQueryAll() {
    }

    @Test
    void queryAllByUser() {
    }
}