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
//@Table(name ="Student_details")
public class Student {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
	//@Column(name = "student_name")
	private String name;
	private int marks;
	
	//Mapping one to one
    @ManyToMany
	private List<Laptop> laptop = new ArrayList<>();
		
		
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", laptop=" + laptop + "]";
	}
	
	
}
