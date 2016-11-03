package com.du.spring.controller;

import com.du.spring.Exception.SpittleNotFoundException;
import com.du.spring.dao.SpittleDao;
import com.du.spring.entity.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by hnyd1 on 2016/10/28.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {

    private static final String MAX_LONG_AS_STRING = "9223372036854775807";

    private static final String SPITTLE_PAGE_COUNT = "20";

    @Autowired
    private SpittleDao spittleDao;

    @Autowired
    public SpittleController(SpittleDao spittleDao) {
        this.spittleDao = spittleDao;
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public String spittles(Model model) {
//        model.addAttribute(spittleDao.findSpittles(Long.MAX_VALUE, 20));
//        return "spittles";
//    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Spittle> spittles(@RequestParam(value = "max", defaultValue = MAX_LONG_AS_STRING) long max,
                                  @RequestParam(value = "count", defaultValue = SPITTLE_PAGE_COUNT) int count) {
        return spittleDao.findSpittles(max, count);
    }

//    @RequestMapping(value = "/show", method = RequestMethod.GET)
//    public String showSpittle(@RequestParam("spittle_id") long spittleId, Model model){
//        model.addAttribute(spittleDao.findOne(spittleId));
//        return "spittle";
//    }

    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public String spittle(@PathVariable long spittleId, Model model) {
        Spittle spittle = spittleDao.findOne(spittleId);

        if (spittle == null) {
            throw new SpittleNotFoundException();
        }

        model.addAttribute(spittleDao.findOne(spittleId));
        return "spittle";
    }



}


































