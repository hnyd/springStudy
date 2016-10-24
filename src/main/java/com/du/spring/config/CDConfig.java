package com.du.spring.config;

import com.du.spring.model.CompactDisc;
import com.du.spring.model.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hnyd1 on 2016/10/16.
 */
@Configuration
public class CDConfig {

    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }


}
