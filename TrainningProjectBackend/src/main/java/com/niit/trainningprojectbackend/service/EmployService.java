package com.niit.trainningprojectbackend.service;

import java.util.List;

import com.niit.trainningprojectbackend.model.Employee;

public interface EmployService
{
	public boolean registerEmployee(Employee employee);

	public boolean update(Employee employee);


	public List<Employee> list();
	
}
