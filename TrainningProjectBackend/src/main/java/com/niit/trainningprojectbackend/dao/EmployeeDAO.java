package com.niit.trainningprojectbackend.dao;

import java.util.List;

import com.niit.trainningprojectbackend.model.Employee;


public interface EmployeeDAO 
{

	public boolean save(Employee user);

	public boolean update(Employee user);

	public boolean delete(Employee id);

	public List<Employee> list();

	
}
