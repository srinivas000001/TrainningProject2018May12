package com.niit.trainningprojectbackend.serviceimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.trainningprojectbackend.daoimpl.SkillsDAOImpl;
import com.niit.trainningprojectbackend.model.SkillMap;
import com.niit.trainningprojectbackend.service.SkillsService;


@Repository("skillsService")
@Transactional

public class SkillsServiceImpl implements SkillsService
{
	
	private static final Logger log = LoggerFactory.getLogger(SkillsServiceImpl.class);

	
	private SessionFactory sessionFactory;

	SkillMap skillMap;

	public SkillsServiceImpl(SessionFactory sessionFactory)
	{
		
		
		this.sessionFactory=sessionFactory;
	}
	
	public boolean addSkills(SkillMap skills) 
	{
		log.info("Adding  Job Skillls Method Started");
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(skills);
			log.info(" Job Skills Registration Method Success");
			return true;
		}
		catch(Exception ex)
		{
			log.error("Addding Students Skills has an Error");
			ex.printStackTrace();
			return false;
		}
	}

	public boolean editSkills(SkillMap skills) {
		// TODO Auto-generated method stub
		return false;
	}

public List<SkillMap> getAllSkills()
	{
		log.info("Starting  Employees List of Skills Method");
		String hql_string = "FROM Skills";
		Query query = sessionFactory.getCurrentSession().createQuery(hql_string);
		log.info("List of  Employee Skills Retrieved");
		return query.list();
		
	}

	public SkillMap getSkillsByName(String skillName) {
		log.debug("Starting of Method for Get Skills "+skillName);
		try
		{
			skillMap =  sessionFactory.getCurrentSession().get(SkillMap.class, skillName);
			 return skillMap;
		}
		catch(Exception ex)
		{
			
			return null;
		}
	}

}
