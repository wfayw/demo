package com.example.demo;

import com.example.demo.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class MyControllerTests {

	@Autowired
	private MockMvc mvc;

	@Test
	public void testExample() throws Exception {
		this.mvc.perform(get("/hello").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(content().string("Hello World"));
	}

}
