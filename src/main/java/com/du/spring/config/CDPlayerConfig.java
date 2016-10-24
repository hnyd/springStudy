package com.du.spring.config;

import com.du.spring.model.CDPlayer;
import com.du.spring.model.CompactDisc;
import org.springframework.context.annotation.*;

/**
 * Created by hnyd1 on 2016/10/16.
 */
@Configuration
public class CDPlayerConfig {


    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }


}
