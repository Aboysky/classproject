package cn.edu.sicnu.cs;


import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Generator
 * @Description TODO
 * @Date 2020/11/10 21:33
 * @Created by Huan
 */
public class Generator {
    public void generator() throws Exception{
        List<String> warnings=new ArrayList<>();
        boolean overwrite=true;
        //指向逆向工程的配置文件
        File newFile = new File("");
        System.out.println(newFile.getCanonicalPath()+"=="+newFile.getAbsolutePath());
        File configFile=new File("C:\\Users\\Huan\\IdeaProjects\\AuthenticateService\\src\\main\\resources\\generatorConfig.xml");
        ConfigurationParser parser=new ConfigurationParser(warnings);
        Configuration config=parser.parseConfiguration(configFile);
        DefaultShellCallback callback=new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator=new MyBatisGenerator(config,callback,warnings);
        myBatisGenerator.generate(null);
    }//generator
    public static void main(String[] args) throws Exception {
        cn.edu.sicnu.cs.Generator generatorSqlmap=new cn.edu.sicnu.cs.Generator();
        try {
            generatorSqlmap.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//main
}