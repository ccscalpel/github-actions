package com.example.githubactions.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(controller.class)
public class controllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testController_success() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
//        System.out.println(result);
//        System.out.println(result.getResponse().getContentAsString());
        assertEquals("Hello world!!!", result.getResponse().getContentAsString());
    }

}
