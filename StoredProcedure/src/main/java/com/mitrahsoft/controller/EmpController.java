package com.mitrahsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitrahsoft.Entity.Employee;
import com.mitrahsoft.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {
      
	@Autowired
	EmpService empservice;
	
	//end point to get emp by id 
	@GetMapping("/getempbyid/{id}")
	public List<Employee> getEmployeeById(@PathVariable Long id)
	{
		 return empservice.getEmployeeById(id);
	}
	
	
	//end point to display all emp
	@GetMapping("/display")
	public List<Employee> getAllEmp()
	{
		return empservice.getAllEmployees();
	}
	
	
	//end point to save emp
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		return empservice.saveEmployee(employee);
	}
}
