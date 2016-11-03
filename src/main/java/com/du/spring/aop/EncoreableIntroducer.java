package com.du.spring.aop;

import com.du.spring.entity.DefaultEncoreable;
import com.du.spring.entity.Encoreable;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by hnyd1 on 2016/10/25.
 */
@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "com.du.spring.controller.PerformanceController+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;


}
