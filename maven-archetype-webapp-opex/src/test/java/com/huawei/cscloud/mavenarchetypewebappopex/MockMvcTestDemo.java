package com.huawei.cscloud.mavenarchetypewebappopex;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MockMvcTestDemo {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getUserByIdTest() throws Exception {
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/getUserById"))
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
		TestCase.assertEquals(200, mvcResult.getResponse().getStatus());
	}

	@Test
	public void getUserByParamIdTest() throws Exception {
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/getUserByParamId").param("id", "1"))
				.andExpect(MockMvcResultMatchers.jsonPath("name").value("my name is Hanmeimei")).andReturn();
		System.out.println(mvcResult.getResponse().getContentAsString());
		TestCase.assertEquals("{\"name\":\"my name is Hanmeimei\",\"id\":1}", mvcResult.getResponse().getContentAsString());
	}
}
