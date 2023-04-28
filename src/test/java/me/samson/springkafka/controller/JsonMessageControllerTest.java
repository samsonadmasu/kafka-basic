package me.samson.springkafka.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class JsonMessageControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void stringPublish() {
//        assertThat(this.testRestTemplate.getForObject("http://localhost:" + port +" / api / v1 / kafka / publish", String.class)).contains("some thing");
//        this.mockMvc.perform()
    }

    @Test
    void jsonPublish() {
    }
}