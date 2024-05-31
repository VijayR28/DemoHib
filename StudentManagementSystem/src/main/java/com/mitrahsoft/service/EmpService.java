package com.mitrahsoft.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitrahsoft.entity.Employee;
import com.mitrahsoft.repository.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	private  EmpRepo emprepo;
	
	public Employee addEmp(Employee emp) {
		return emprepo.save(emp);
		
	}
	public Employee   searchEmployee(int id) {
		
		return emprepo.findById(id).orElse(null);
		
	}
	public Employee removeEmployee(int id) {
		Employee e=emprepo.findById(id).orElse(null);
		if(e==null)
			return null;
		else {
					emprepo.delete(e);
					return e;
			}
	}
	
	public Employee updateEmpName(int id,String newName) {
		Employee emp=(Employee)emprepo.findById(id).orElse(null);
		if(emp==null)
			return null;
		else {
			emp.setName(newName);
			emprepo.save(emp);
			return emp;
		}
	}
	public Employee updateEmpCno(int id,long cno) {
		Employee emp=(Employee)emprepo.findById(id).orElse(null);
		if(emp==null)
			return null;
		else {
			emp.setCno(cno);
			emprepo.save(emp);
			return emp;
		}
	}
	public Employee updateEmpjob(int id,String job) {
		Employee emp=(Employee)emprepo.findById(id).orElse(null);
		if(emp==null)
			return null;
		else {
			emp.setName(job);
			emprepo.save(emp);
			return emp;
		}
	}
	public List<Employee> getAllEmp(){
		return emprepo.findAll();
	}

}