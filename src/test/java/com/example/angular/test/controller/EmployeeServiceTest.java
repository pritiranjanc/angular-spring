package com.example.angular.test.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.angular.model.Employee;
import com.example.angular.test.AngularDemoApplicationTests;

public class EmployeeServiceTest extends AngularDemoApplicationTests {

	@Test
	public void testAddEmployee() throws Exception 
	{
		String url = "/addemployee";
		Employee emp = new Employee(101, "John", "Sr. Engineer", 20000);
		String inputJson = mapToJson(emp);
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(url)
				.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON).content(inputJson)).andReturn();

		Assert.assertEquals(200,mvcResult.getResponse().getStatus());
	}

	@Test
	public void testGetEmployees() throws Exception 
	{
		String uri = "/employees";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
				.accept(MediaType.APPLICATION_JSON)).andReturn();
		Assert.assertEquals(200,mvcResult.getResponse().getStatus());
	}

	@Test
	public void testDeleteEmployee() throws Exception {

		String uri = "/deleteemployee/101";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)
				.accept(MediaType.APPLICATION_JSON)).andReturn();
		Assert.assertEquals(200,mvcResult.getResponse().getStatus());
	}
}
