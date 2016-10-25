package com.du.spring.config;

import com.du.spring.aop.Audience;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by hnyd1 on 2016/10/24.
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AopConfig {

    @Bean
    public Audience audience() {
        return new Audience();
    }


}
