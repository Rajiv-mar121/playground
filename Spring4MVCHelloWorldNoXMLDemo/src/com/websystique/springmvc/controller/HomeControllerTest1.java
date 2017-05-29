package com.websystique.springmvc.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

//import spittr.web.HomeController;;
public class HomeControllerTest1 {
	@Test
	public void testHelloPage() throws Exception {
		HelloWorldController controller = new HelloWorldController();
		MockMvc mockMvc = standaloneSetup(controller).build();
		mockMvc.perform(get("/")).andExpect(view().name("welcome"));
	}
	
	@Test
	public void testHelloAgain() throws Exception {
		HelloWorldController controller = new HelloWorldController();
		MockMvc mockMvc = standaloneSetup(controller).build();
		mockMvc.perform(get("/helloagain")).andExpect(view().name("welcome"));
	}
}
