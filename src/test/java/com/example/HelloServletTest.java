// HelloServletTest.java
package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloServletTest {

    private final MockMvc mockMvc;

    public HelloServletTest(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    @Test
    public void testHelloServlet() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
               .andExpect(MockMvcResultMatchers.status().isOk())
               .andExpect(MockMvcResultMatchers.content().string("Hello, World!"));
    }
}
