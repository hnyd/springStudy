package com.du.spring.config;

import com.du.spring.model.IceCream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by hnyd1 on 2016/10/21.
 */
@Configuration
@PropertySource("classpath:app.properties")
public class ExpressiveConfig {

    @Autowired
    private Environment environment;

    @Bean
    private IceCream getIceCream() {


        return null;
    }

}
