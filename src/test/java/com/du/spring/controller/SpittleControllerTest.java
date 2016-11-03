package com.du.spring.controller;

import com.du.spring.dao.SpittleDao;
import com.du.spring.entity.Spittle;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by hnyd1 on 2016/10/28.
 */
public class SpittleControllerTest {


    @Test
    public void shouldShowRecentSpittles() throws Exception {

        List<Spittle> expectedSpittles = createSpittleList(20);

        SpittleDao mockSpittleDao = Mockito.mock(SpittleDao.class);
        Mockito.when(mockSpittleDao.findSpittles(Long.MAX_VALUE, 20)).thenReturn(expectedSpittles);

        SpittleController spittleController = new SpittleController(mockSpittleDao);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(spittleController).setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp")).build();

        mockMvc.perform(MockMvcRequestBuilders.get("/spittles")).andExpect(MockMvcResultMatchers.view().name("spittles"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("spittleList"))
                .andExpect(MockMvcResultMatchers.model().attribute("spittleList", Matchers.hasItems(expectedSpittles.toArray())));


    }

    @Test
    public void shouldShowPagedSpittles() throws Exception {
        List<Spittle> expectedSpittles = createSpittleList(20);

        SpittleDao mockSpittleDao = Mockito.mock(SpittleDao.class);
        Mockito.when(mockSpittleDao.findSpittles(238900, 50)).thenReturn(expectedSpittles);

        SpittleController spittleController = new SpittleController(mockSpittleDao);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(spittleController).setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp")).build();

        mockMvc.perform(MockMvcRequestBuilders.get("/spittles?max=238900&count=50")).andExpect(MockMvcResultMatchers.view().name("spittles"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("spittleList"))
                .andExpect(MockMvcResultMatchers.model().attribute("spittleList", Matchers.hasItems(expectedSpittles.toArray())));

    }


    private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("spittle " + i, new Date()));
        }
        return spittles;
    }


}
