package com.mitrahsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitrahsoft.Entity.Employee;
import com.mitrahsoft.Repository.EmpRep;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class EmpService {
  @Autowired
  private EmpRep emprep;
  
  //function to find employee by id
  public List<Employee> getEmployeeById(Long id)
  {
	  return emprep.getEmployeeById(id);
  }
  
  //function to get all employees
  
  public List<Employee> getAllEmployees()
  {
	  return emprep.findAll();
  }
  
  //function to save employee
  
  public Employee saveEmployee(Employee emp)
  {
	  return emprep.save(emp);
  }
}
