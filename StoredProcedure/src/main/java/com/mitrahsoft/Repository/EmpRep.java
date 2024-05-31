package com.mitrahsoft.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mitrahsoft.Entity.Employee;

@Repository
public interface EmpRep extends JpaRepository<Employee, Long>{
   //declaring a function to call the procedure
	@Procedure(name ="getEmployeeById")
	List<Employee> getEmployeeById(@Param("empId") Long id);
}
