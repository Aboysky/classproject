package cn.edu.sicnu.sc.softwareproduction.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Classname SwaggerConfig
 * @Description TODO
 * @Date 2020/11/11 13:38
 * @Created by Huan
 * Swagger的配置类
 */
@Configuration
@EnableOpenApi
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {

        return new Docket(DocumentationType.OAS_30)

                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .apis(RequestHandlerSelectors.basePackage("cn.edu.sicnu.sc.softwareproduction"))
                .paths(PathSelectors.any())
                .build();

    }



    private ApiInfo apiInfo() {

        return new ApiInfoBuilder()

                .title("软件售后系统api文档")

                .description("四川师范大学计算机科学学院2018级4班软件工程小组期末作品")

                .contact(new Contact("作者", "作者地址", "作者邮箱"))

                .version("1.0")

                .build();

    }
}
