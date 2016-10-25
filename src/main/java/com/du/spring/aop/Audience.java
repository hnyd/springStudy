package com.du.spring.aop;

import org.aspectj.lang.annotation.*;

/**
 * Created by hnyd1 on 2016/10/24.
 */
@Aspect
public class Audience {

    @Pointcut("execution(* com.du.spring.controller.Performance.perform(..))")
    public void performance() {}

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

}
