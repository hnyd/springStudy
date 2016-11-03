package com.du.spring.dao;

import com.du.spring.entity.Spitter;

/**
 * Created by hnyd1 on 2016/10/31.
 */
public interface SpitterDao {

    void save(Spitter spitter);

    Spitter findByUsername(String username);
}
