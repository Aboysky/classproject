package utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Classname BcryptPasswordEncoder
 * @Description TODO
 * @Date 2020/11/16 23:43
 * @Created by Huan
 */
public class BcryptPasswordEncoderTest {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("123456").toString());
        //$2a$10$DPQGvZsbC6b9F5q3l2/JCO08LJ3xAl.Cx7tQwB30DQR4o2HBD8eF.
    }
}
