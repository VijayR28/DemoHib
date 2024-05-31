package com.mitrahsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitrahsoft.entity.*;
import com.mitrahsoft.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpService service;
	@PostMapping("/add")
    public Employee addEmp(@RequestBody Employee emp) {
		return service.addEmp(emp);
		
    	
    }
	@GetMapping("/search/{id}")
	public Employee search(@PathVariable int id) {
		return service.searchEmployee(id);
		
	}
	@PutMapping("updatename/{id}/{newName}")
	public Employee updateEmpName(@PathVariable int id,@PathVariable String newName) {
		return service.updateEmpName(id, newName);
	}
	@PutMapping("updatecno/{id}/{cno}")
	public Employee updateEmpCno(@PathVariable int id,@PathVariable long cno) {
		return service.updateEmpCno(id, cno);
		
		
	}
	@PutMapping("updatejob/{id}/{Job}")
	public Employee updateEmmjob(@PathVariable int id,@PathVariable String job) {
		return service.updateEmpjob(id, job);
		
	}
	@DeleteMapping("removeemp/{id}")
	public Employee removeemp(@PathVariable int id) {
		return service.removeEmployee(id);
	}
	@GetMapping("/display")
	public List<Employee> getAllEmp(){
		return service.getAllEmp();
	}

	

}
