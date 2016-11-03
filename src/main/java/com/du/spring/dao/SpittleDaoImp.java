package com.du.spring.dao;

import com.du.spring.entity.Spittle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by hnyd1 on 2016/10/28.
 */
@Repository
public class SpittleDaoImp implements SpittleDao {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> list = new ArrayList<>();

        list.add(new Spittle(new Long(1), "Spittle01", new Date(System.currentTimeMillis())));
        list.add(new Spittle(new Long(2), "Spittle02", new Date(System.currentTimeMillis())));
        list.add(new Spittle(new Long(3), "Spittle03", new Date(System.currentTimeMillis())));

        return list;
    }

    @Override
    public Spittle findOne(long spittleId) {
        return new Spittle(new Long(4), "Spittle04", new Date(System.currentTimeMillis()));
    }

}
