package com.du.spring.aop;

/**
 * Created by hnyd1 on 2016/10/25.
 */
public aspect CriticAspect {


    public CriticAspect() {
    }

    pointcut performance() : execution(* perform(..));

    after() returning : performance(){
        System.out.println();
    }


}
