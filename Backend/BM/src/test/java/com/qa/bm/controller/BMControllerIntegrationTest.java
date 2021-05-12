package com.qa.bm.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.bm.domain.BM;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureMockMvc
@ActiveProfiles("deve")
public class BMControllerIntegrationTest {

	@Autowired
	private MockMvc mockMVC;

	@Autowired
	private ObjectMapper mapper;

	@Test
	@Order(1)
	void testCreate() throws Exception {
		this.mockMVC
				.perform(post("/create").contentType(MediaType.APPLICATION_JSON)
						.content(this.mapper.writeValueAsString(new BM("Jim", "Bun", "Tomato", "Yes"))))
				.andExpect(status().isCreated())
				.andExpect(content().json(this.mapper.writeValueAsString(new BM(1L, "Jim", "Bun", "Tomato", "Yes"))));
	}

	@Test
	@Order(2)
	void testGetAll() throws Exception {
		List<BM> bm = new ArrayList<>();
		bm.add(new BM(1L, "Jim", "Bun", "Tomato", "Yes"));
		this.mockMVC
		.perform(get("/getAll").contentType(MediaType.APPLICATION_JSON)
				.content(this.mapper.writeValueAsString(new BM())))
		.andExpect(content().json(this.mapper.writeValueAsString(bm.stream().collect(Collectors.toList()))));
	}

	@Test
	@Order(3)
	void testUpdate() throws Exception {
		this.mockMVC
				.perform(put("/update/1").contentType(MediaType.APPLICATION_JSON)
						.content(this.mapper.writeValueAsString(new BM(1L, "James", "Bun", "Tomato", "Yes"))))
				.andExpect(status().isAccepted())
				.andExpect(content().json(this.mapper.writeValueAsString(new BM(1L, "James", "Bun", "Tomato", "Yes"))));
	}

	@Test
	@Order(4)
	void testRemove() throws Exception {
		this.mockMVC
				.perform(delete("/remove/1").contentType(MediaType.APPLICATION_JSON)
						.content(this.mapper.writeValueAsString(new BM(1L))))
				.andExpect(status().isNoContent());
	}

}
