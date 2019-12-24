package com.example.angular.test.controller;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.example.angular.controller.EmployeeService;
import com.example.angular.model.Employee;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

	@InjectMocks
	EmployeeService employeeService;

	@Test
	public void testAddEmployee() 
	{
		Employee emp = new Employee(101, "John", "Sr. Engineer", 20000);
		ResponseEntity<Object> responseEntity = employeeService.createEmployee(emp);
		Assert.assertEquals(responseEntity.getStatusCodeValue(),200);
	}

	@Test
	public void testGetEmployees() 
	{
		List<Employee> empList = employeeService.getEmployees();
		Assert.assertFalse(empList.isEmpty());
	}
	
	@Test
	public void testDeleteEmployee() {
		ResponseEntity<Object> responseEntity = employeeService.deleteEmployee(101);
		Assert.assertEquals(responseEntity.getStatusCodeValue(),200);
	}
}
