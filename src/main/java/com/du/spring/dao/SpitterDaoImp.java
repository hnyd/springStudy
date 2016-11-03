package com.du.spring.dao;

import com.du.spring.entity.Spitter;
import org.springframework.stereotype.Repository;

/**
 * Created by hnyd1 on 2016/10/31.
 */
@Repository
public class SpitterDaoImp implements SpitterDao {
    @Override
    public void save(Spitter spitter) {

    }

    @Override
    public Spitter findByUsername(String username) {
        return null;
    }
}
