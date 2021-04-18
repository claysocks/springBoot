package com.bjpowernode.config;

import com.bjpowernode.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName:WebConfig
 * Package:com.bjpowernode.config
 * Description:<br/>
 *
 * @date:2021/4/14 17:43
 * @author:dingzhengzheng
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String [] addPathPatterns={
                "/**"
        };
        String []excludePathPatterns={
                "/boot/hello",
                "/boot/jsp"
        };

        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }
}
