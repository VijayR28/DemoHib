package com.hqldemo.hibquerydemp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Emp")
public class Employee {
	
   @Id
   private String ename;
   private int eid;
   private String dept;
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Employee [ename=" + ename + ", eid=" + eid + ", dept=" + dept + "]";
}
   
}
