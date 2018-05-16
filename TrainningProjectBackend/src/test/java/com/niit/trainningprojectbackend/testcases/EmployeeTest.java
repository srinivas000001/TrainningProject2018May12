package com.niit.trainningprojectbackend.testcases;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

 
import com.niit.trainningprojectbackend.dao.EmployeeDAO;

import com.niit.trainningprojectbackend.model.Employee;

public class EmployeeTest 
{


	Logger log = LoggerFactory.getLogger(EmployeeTest.class);
	
	
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
		employee.setEmployFName("Sunil");
		employee.setEmployLName("Kumkar");
		employee.setEmailId("sunil@gmail.com");
		employee.setPassword("sunil");
		employee.setGendar('M');
		employee.setMobileNumber("9876765482");
		employee.setRole("HR");
		
	boolean flag = employeeDAO.registerEmployee(employee);
		assertEquals("new EmployeeTestCase", true, flag);
	}
/*	@Test
	public void listEmployeeTestCase()
	{
		log.info("List Users");
		List<Employee> list = employeeDAO.list();
		int size = list.size();
	
		for(int index = 0; index < size; index++)
		{
			System.out.print("Employee EmailId = "+list.get(index).getEmailId());
			System.out.println("\t Role = "+list.get(index).getRole());
			
		}
		assertEquals(2,size);
	}
	@Test
	public void validateEmployee()
	{
		log.info("Validate Employee Started");
		String emailId = "rahul1@gmail.com";
		String password = "rahul";
		boolean flag = employeeDAO.validateUser(emailId, password);
		assertEquals("Employee Validate Test", true, flag);
		log.info("Validate User Ended");
	}
*/
}