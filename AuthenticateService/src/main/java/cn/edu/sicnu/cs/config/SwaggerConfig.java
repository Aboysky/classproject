package cn.edu.sicnu.cs.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
//import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;

import static java.util.Arrays.asList;
import static springfox.documentation.builders.PathSelectors.ant;

@Configuration
@EnableSwagger2
//@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {

        return new Docket(DocumentationType.SWAGGER_2)

                .apiInfo(apiInfo())

                .select()

                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))

                .paths(PathSelectors.any())

                .build();

    }



    private ApiInfo apiInfo() {

        return new ApiInfoBuilder()

                .title("软件公司售后系统接口API文档")

                .description("四川师范大学计算机科学学院2018级软件工程专业4班第四小组")

                .contact(new Contact("作者", "作者地址", "作者邮箱"))

                .version("1.0")

                .build();

    }

//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.OAS_30)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.aboysky.swagger.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("基于Swagger3.0.0的接口文档")
//                .description("api信息列表")
//                .version("2.0")
//                .contact(new Contact("Evan", "http://www.baidu.com", "123456@qq.com"))
//                .build();
//    }
}
