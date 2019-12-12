package com.example.angular.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.angular.model.Employee;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployeeService {
	
	private static List<Employee> employees;
	{
		employees = new ArrayList<Employee>();
		employees.add(new Employee(101, "John", "Sr. Engineer", 20000));
		employees.add(new Employee(201, "Russ", "Team Lead", 300000));
		employees.add(new Employee(301, "Kate", "Manager", 700000));
		employees.add(new Employee(401, "Viral", "Software Engineer", 10000));
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employees;
	}
	
	@PostMapping(value = "/addemployee")
	public ResponseEntity createEmployee(@RequestBody Employee employee) {
		employees.add(employee);
		return new ResponseEntity(employee, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteemployee/{empId}")
	public ResponseEntity deleteCustomer(@PathVariable Integer empId) {
		employees.removeIf(e -> e.getEmpId()== empId);
		return new ResponseEntity("{\"message\":\"Success\"}", HttpStatus.OK) ;
	}
}
