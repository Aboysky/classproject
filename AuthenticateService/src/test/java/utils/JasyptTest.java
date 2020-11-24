package utils;

/**
 * @Classname DruidBrypt
 * @Description TODO
 * @Date 2020/11/2 18:43
 * @Created by Huan
 */



import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentPBEConfig;
import org.junit.Test;

public class JasyptTest {
    @Test
    public void testEncrypt() throws Exception {
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        EnvironmentPBEConfig config = new EnvironmentPBEConfig();

        config.setAlgorithm("PBEWithMD5AndDES");     // 加密的算法，这个算法是默认的
        config.setPassword("SJLFjiflDJjksadfNjkasdffmop1JSOFIJ26re@#15r4324FE");            // 加密的密钥
        standardPBEStringEncryptor.setConfig(config);

        String url="jdbc:mysql:///autho?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8&useSSL=false&zeroDateTimeBehavior=CONVERT_TO_NULL";
//        System.out.println(standardPBEStringEncryptor.encrypt(userName));
//        System.out.println(standardPBEStringEncryptor.encrypt(password));
        System.out.println(standardPBEStringEncryptor.encrypt(url));
    }

    @Test
    public void testDe() throws Exception {
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        EnvironmentPBEConfig config = new EnvironmentPBEConfig();

        config.setAlgorithm("PBEWithMD5AndDES");
        config.setPassword("test");
        standardPBEStringEncryptor.setConfig(config);
        String encryptedText = "ip10XNIEfAMTGQLdqt87XnLRsshu0rf0";
        String plainText = standardPBEStringEncryptor.decrypt(encryptedText);
        System.out.println(plainText);
    }
}