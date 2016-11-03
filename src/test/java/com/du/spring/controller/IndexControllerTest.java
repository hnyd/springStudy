package com.du.spring.controller;

//import org.springframework.test.web.servlet.MockMvc;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by hnyd1 on 2016/10/27.
 */
public class IndexControllerTest {


    @Test
    public void testHomePage() throws Exception {
        IndexController indexController = new IndexController();
        MockMvc mockMvc = standaloneSetup(indexController).build();
        mockMvc.perform(get("/")).andExpect(view().name("index"));
    }







}
