package com.niit.trainningprojectbackend.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.trainningprojectbackend.dao.SkillsDAO;
import com.niit.trainningprojectbackend.model.SkillMap;


@Repository("skillsDAO")
@Transactional

public class SkillsDAOImpl implements SkillsDAO
{
	

	private static final Logger log = LoggerFactory.getLogger(SkillsDAOImpl.class);

	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	SkillMap skillMap;

	
	public SkillsDAOImpl(SessionFactory sessionFactory)
	{
		
		
		this.sessionFactory=sessionFactory;
	}
	
	
	@Override
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

	@Override
	public boolean editSkills(SkillMap skills) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<SkillMap> getAllSkills() 
	{


		log.info("Starting  Employees List of Skills Method");
		String hql_string = "FROM Skills";
		Query query = sessionFactory.getCurrentSession().createQuery(hql_string);
		log.info("List of  Employee Skills Retrieved");
		return query.list();
		
	}

	@Override
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





