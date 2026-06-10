package me.hyomin.sonartest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class BasicControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void basicTest() throws Exception {
        // given && when
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/")
        )
                .andExpect(content().string("Hello World"));

    }

    @Test
    void basicTest2() throws Exception {
        // given && when
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/2")
                )
                .andExpect(content().string("Hello World2"));

    }

    @Test
    void basicTest3() throws Exception {
        // given && when
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/3")
                )
                .andExpect(content().string("Hello World3"));

    }

    @Test
    void basicTest4() throws Exception {
        // given && when
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/4")
                )
                .andExpect(content().string("Hello World4"));

    }

    @Test
    void basicTest5() throws Exception {
        // given && when
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/5")
                )
                .andExpect(content().string("Hello World5"));

    }

    @Test
    void basicTest6() throws Exception {
        // given && when
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/6")
                )
                .andExpect(content().string("Hello World6"));

    }

    @Test
    void basicTest7() throws Exception {
        // given && when
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/7")
                )
                .andExpect(content().string("Hello World7"));

    }

    @Test
    void basicTest8() throws Exception {
        // given && when
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/8")
                )
                .andExpect(content().string("Hello World8"));

    }

    @Test
    void basicTest9() throws Exception {
        // given && when
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/9")
                )
                .andExpect(content().string("Hello World9"));

    }

    @Test
    void basicTest10() throws Exception {
        // given && when
        mockMvc.perform(
                        MockMvcRequestBuilders.get("/10")
                )
                .andExpect(content().string("Hello World10"));

    }


}