package com.niit.trainningprojectbackend.testcases;


import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.trainningprojectbackend.dao.EmployeeDAO;

import com.niit.trainningprojectbackend.model.Employee;

public class EmployeeTest 
{

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static EmployeeDAO employeeDAO;



	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");
		//employee = (Employee) context.getBean("employee");

	}

	@Test
	public void createEmployeeTestCase()
	{
		
		Employee employee=new Employee();
		//employee.setEmployId(1000);
		employee.setEmployFName("rahul");
		employee.setEmployLName("dravid");
		employee.setEmailId("rahul1@gmail.com");
		employee.setPassword("rahul");
		employee.setGendar('M');
		employee.setMobileNumber("9876765482");
		employee.setRole("Faculty");
		
	boolean flag = employeeDAO.registerEmployee(employee);

		assertEquals("new EmployeeTestCase", true, flag);

	}


}
