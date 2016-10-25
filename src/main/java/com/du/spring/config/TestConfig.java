package com.du.spring.config;

import com.du.spring.model.MagicBean;
import com.du.spring.service.MagicExistsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by hnyd1 on 2016/10/18.
 */
@Configuration
public class TestConfig {


    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
