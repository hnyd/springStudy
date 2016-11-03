package com.du.spring.controller;

import com.du.spring.dao.SpitterDao;
import com.du.spring.entity.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by hnyd1 on 2016/10/31.
 */
@Controller
@RequestMapping("/spitter")
public class SpitterController {

    @Autowired
    private SpitterDao spitterDao;

    @Autowired
    public SpitterController(SpitterDao spitterDao) {
        this.spitterDao = spitterDao;
    }

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String showRegistrationForm() {
        return "registerForm";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String processRegistration(@Valid Spitter spitter, Errors errors) {
        if (errors.hasErrors()) {
            return "registerForm";
        }

        spitterDao.save(spitter);
        return "redirect:/spitter/" + spitter.getUsername();
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable String username, Model model) {
        Spitter spitter = spitterDao.findByUsername(username);
        model.addAttribute(spitter);
        return "profile";
    }

    @RequestMapping(value = "registersf", method = RequestMethod.GET)
    public String showRegistrationFormsf(Model model) {
        model.addAttribute(new Spitter());
        return "registerFormsf";
    }


}
