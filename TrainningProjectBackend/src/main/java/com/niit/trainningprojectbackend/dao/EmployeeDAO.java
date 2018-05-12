package com.niit.trainningprojectbackend.dao;

import java.util.List;

import com.niit.trainningprojectbackend.model.Employee;


public interface EmployeeDAO 
{

	public boolean registerEmployee(Employee employee);

	public boolean update(Employee employee);


	public List<Employee> list();

	
}
