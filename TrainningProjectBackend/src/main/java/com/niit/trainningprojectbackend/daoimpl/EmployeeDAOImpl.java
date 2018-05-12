package com.niit.trainningprojectbackend.daoimpl;

import java.util.List;

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
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public EmployeeDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
	public boolean registerEmployee(Employee employee) 
	{
		//log.info("Registration Employee Method Started");
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(employee);
		//	log.info("Employ Registration Method Success");
			return true;
		}
		catch(Exception ex)
		{
		//	log.error("Addding Employee has an Error");
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
		// TODO Auto-generated method stub
		return null;
	}

	
}
