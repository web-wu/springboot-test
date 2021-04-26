package com.w2x.springboot.config;

import com.w2x.springboot.intercepter.MyIntercepter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class IntercepterConfig implements WebMvcConfigurer {

    @Bean
    public MyIntercepter getMyintercepter() {
        return new MyIntercepter();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getMyintercepter()).addPathPatterns("/*");
    }
}
