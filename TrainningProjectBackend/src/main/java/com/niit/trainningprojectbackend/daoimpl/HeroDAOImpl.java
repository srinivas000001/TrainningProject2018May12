package com.niit.trainningprojectbackend.daoimpl;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.niit.trainningprojectbackend.dao.HeroDAO;

import com.niit.trainningprojectbackend.model.Hero;

@Repository("heroDAO")
@Transactional

public class HeroDAOImpl implements HeroDAO 
{
	


	private SessionFactory sessionFactory;
	

	Hero hero;
	
	public HeroDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	


public boolean registerHero(Hero hero) {
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(hero);

				return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}


	public boolean update(Hero hero) {
		// TODO Auto-generated method stub
		return false;
	}


	public List<Hero> list() {
		String hql_string = "FROM Hero";
		Query query = sessionFactory.getCurrentSession().createQuery(hql_string);

	return query.list();
	}


	public Hero getHeroByName(String name) {
		try
		{
			 hero =  sessionFactory.getCurrentSession().get(Hero.class, name);
			 return hero;
		}
		catch(Exception ex)
		{
			
			return null;
		}

	}

}
