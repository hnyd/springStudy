package com.du.spring.dao;

import com.du.spring.entity.Spittle;

import java.util.List;

/**
 * Created by hnyd1 on 2016/10/28.
 */
public interface SpittleDao {
    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long spittleId);

}
