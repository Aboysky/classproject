package cn.edu.sicnu.cs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import javax.swing.*;

/**
 * @Classname AuthenticationService
 * @Description TODO
 * @Date 2020/11/15 16:23
 * @Created by Huan
 */
@SpringBootApplication
@EnableCaching
@MapperScan(basePackages = "cn.edu.sicnu.cs.dao")
public class AuthenticationService {
    public static void main(String[] args) {
        SpringApplication.run(AuthenticationService.class,args);
    }
}
