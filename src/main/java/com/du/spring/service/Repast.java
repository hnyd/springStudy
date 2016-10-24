package com.du.spring.service;

import com.du.spring.model.Cold;
import com.du.spring.model.Dessert;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hnyd1 on 2016/10/19.
 */
public class Repast {

    private Dessert dessert;

    @Autowired
    @Cold
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

}
