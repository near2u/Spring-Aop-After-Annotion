package com.project.service;

import org.springframework.stereotype.Service;



public class EmployeeService {

	String empName;

	public String getEmpName() {
		System.out.println("get Employeee is running...");
		return empName;
	}

	public void setEmpName(String empName) {
		System.out.println("set Employeee is running...");
		this.empName = empName;
	}
	
	public void throwException(){
		System.out.println("throwing Exception");
		throw new RuntimeException();
	}
	
	
}
