package com.learn.tao.learn.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebAppConfig extends WebMvcConfigurationSupport {
    @Bean
    public SecureInterceptor secureInterceptorto() {
        return new SecureInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new inter()).addPathPatterns("api/path/**").excludePathPatterns("api/path/login");
        registry.addInterceptor(secureInterceptorto()).addPathPatterns("/**").excludePathPatterns("/test/*");

    }
}
