package com.niit.trainningprojectbackend.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.trainningprojectbackend.model.Employee;
import com.niit.trainningprojectbackend.service.EmployService;


@Service("employeeService")
@Transactional

public class EmployeeServiceImpl implements EmployService
{

	@Override
	public boolean registerEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
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
