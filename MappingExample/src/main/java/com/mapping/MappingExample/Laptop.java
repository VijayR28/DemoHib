package com.mapping.MappingExample;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
//@Table(name = "Laptop_details")
public class Laptop {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lid;
	//@Column(name="laptop_name")
	private String lname;
	
	//Mapping
	@ManyToMany(mappedBy = "laptop")
	private List<Student> student = new ArrayList<>();
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	
	
}
