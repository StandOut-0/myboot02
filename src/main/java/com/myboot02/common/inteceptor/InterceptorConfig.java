package com.myboot02.common.inteceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ViewNameInterceptor())
                .addPathPatterns("/*.do")
                .addPathPatterns("/*/*.do")
                ///users/login 요청에 대해서는 인터셉터 요청을 적용하지않습니다.
                .excludePathPatterns("/users/login"); 
    }
}
