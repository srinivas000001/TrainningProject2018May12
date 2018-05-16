package com.niit.trainningprojectrestapp.controller;

import java.util.List;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.trainningprojectbackend.dao.EmployeeDAO;
import com.niit.trainningprojectbackend.model.Employee;

@RestController
public class EmployeeController 
{

	@Autowired
	private EmployeeDAO employeeDAO;
	

//	@Autowired
	private Employee employee;

	@Autowired
	HttpSession session;

	@GetMapping("/getEmployeeList")
	public ResponseEntity<List<Employee>> getEmployeeList() throws NullPointerException
	{
			List<Employee> list = employeeDAO.list();
			if (list.isEmpty()) 
			{
				employee.setErrorCode("100");
				employee.setErrorMsg("Users are not available");
			}
			else
			{

				for(Employee emp : list)
				{
					emp.setErrorCode("200");
					emp.setErrorMsg("Success");

				}
			}
			return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
	}

	@PostMapping("/add_Employee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) 
	{	    

		boolean value = employeeDAO.registerEmployee(employee);
		if (value == true) 
		{
			employee.setErrorCode("200");
			employee.setErrorMsg("New Employee added Successfully");
		} 
		else 
		{
			employee.setErrorCode("100");
			employee.setErrorMsg("Add Employee Failed");
		}
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}


}
