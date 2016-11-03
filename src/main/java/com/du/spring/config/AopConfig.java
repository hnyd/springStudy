package com.du.spring.config;

import com.du.spring.aop.Audience;
import com.du.spring.aop.AudienceOfAround;
import com.du.spring.aop.EncoreableIntroducer;
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

    @Bean
    public AudienceOfAround audienceOfAround() {
        return new AudienceOfAround();
    }

    @Bean
    public EncoreableIntroducer encoreableIntroducer() {
        return new EncoreableIntroducer();
    }

}
