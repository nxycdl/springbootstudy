package com.example.demo;

import com.example.demo.controller.HelloController;
import com.example.demo.controller.UserController;
import com.example.demo.services.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class ChapterApplicationTests {
    @Autowired
    private MockMvc mvc;


    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("http://127.0.0.1:8000/users/"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
