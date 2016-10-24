package com.du.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by hnyd1 on 2016/10/16.
 */
@Configuration
@ComponentScan(basePackages = "com.du.spring")
@Import({CDPlayerConfig.class, CDConfig.class})
@ImportResource("spring-root.xml")
public class SoundSystemConfig {


}
