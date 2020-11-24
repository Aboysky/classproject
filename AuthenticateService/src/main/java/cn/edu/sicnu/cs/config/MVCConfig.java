//package cn.edu.sicnu.cs.config;
//
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
///**
// * @Classname MVCConfig
// * @Description TODO
// * @Date 2020/11/17 15:51
// * @Created by Huan
// */
//@Configuration
//public class MVCConfig extends WebMvcConfigurerAdapter {
//
//        public void addInterceptors(InterceptorRegistry registry) {
//            registry.addInterceptor(
//                    new CheckLoginInterceptor())
//                    .addPathPatterns("/*")
//                    .excludePathPatterns("/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**");
//        }
//
//        public CheckLoginInterceptor checkLoginInterceptor(){
//            return new CheckLoginInterceptor();
//        }
//
//    }
//}
