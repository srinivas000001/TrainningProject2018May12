package com.niit.trainningprojectbackend.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.trainningprojectbackend.dao.EmployeeDAO;
import com.niit.trainningprojectbackend.model.Employee;

@Repository("employeeDAO")
@Transactional

public class EmployeeDAOImpl  implements EmployeeDAO
{
	
	
	private static final Logger log = LoggerFactory.getLogger(EmployeeDAOImpl.class);

	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	Employee employee;
	
	public EmployeeDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
	public boolean registerEmployee(Employee employee) 
	{
		log.info("Registration Employee Method Started");
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(employee);
			log.info("Employ Registration Method Success");
			return true;
		}
		catch(Exception ex)
		{
			log.error("Addding Employee has an Error");
			ex.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean update(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<Employee> list() {


		log.info("Starting of List Employees Method");
		String hql_string = "FROM Employee";
		Query query = sessionFactory.getCurrentSession().createQuery(hql_string);
		log.info("List Retrieved");
		return query.list();

	}

	@Override
	public boolean validateUser(String emailId, String password) {



			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from Employee where emailId=? and password=?");
			query.setString(0, emailId);
			query.setString(1, password);
			Employee employee = (Employee)query.uniqueResult();
			if(employee==null)
				return false;
			else
				return true;
			
		}

	@Override
	public Employee  getEmployById(int empId) {
		log.debug("Starting of Method Get Employ "+empId);
		try
		{
			 employee =  sessionFactory.getCurrentSession().get(Employee.class, empId);
			 return employee;
		}
		catch(Exception ex)
		{
			
			return null;
		}
	}

	@Override
	public Employee getEmployByName(String employName) 
	{
		log.debug("Starting of Method Get Employ "+employName);
		try
		{
			 employee =  sessionFactory.getCurrentSession().get(Employee.class, employName);
			 return employee;
		}
		catch(Exception ex)
		{
			
			return null;
		}

	}

	

	
}