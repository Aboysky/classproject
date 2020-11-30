package cn.edu.sicnu.cs.service.impl;

import cn.edu.sicnu.cs.AuthenticationService;
import cn.edu.sicnu.cs.model.User;
import cn.edu.sicnu.cs.service.UserService;
import cn.edu.sicnu.cs.utils.JsonUtils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Classname UserServiceImplTest
 * @Description TODO
 * @Date 2020/11/15 22:11
 * @Created by Huan
 */
class UserServiceImplTest {

    @Test
    void updateLockedByUid() {
        System.out.println(JsonUtils.serialize(new User(1, 2, "张三", "12323", 1, "张三", "男", "34234@qq.com", "123123", new Date(), 2, "12", new Date(), "1", "1")));
    }
}