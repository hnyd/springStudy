package com.du.spring.config.Application;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by hnyd1 on 2016/10/26.
 */
@Configuration
@ComponentScan(basePackages = {"com.du.spring"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class SpringRootConfig {


}
