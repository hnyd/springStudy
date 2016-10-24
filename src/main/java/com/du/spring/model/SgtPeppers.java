package com.du.spring.model;

import org.springframework.stereotype.Component;

/**
 * Created by hnyd1 on 2016/10/16.
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely";
    private String artist = "The Beatles";


    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
