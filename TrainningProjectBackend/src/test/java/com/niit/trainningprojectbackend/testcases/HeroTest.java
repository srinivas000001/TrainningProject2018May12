package com.niit.trainningprojectbackend.testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.trainningprojectbackend.dao.HeroDAO;
import com.niit.trainningprojectbackend.model.Hero;

public class HeroTest {
/*
	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static HeroDAO heroDAO;
	
	@BeforeClass
	public static void initialize()
	{

		System.out.println("starting initializtion.....");

		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		heroDAO = (HeroDAO) context.getBean("heroDAO");

		System.out.println("Ending  initializtion.....");

	}

	@Test
	public void createHeroTestCase()
	{

		System.out.println("starting  creation.....");
		
		Hero hero=new Hero();

		hero.setId(1000);
		hero.setName("Rahul");
		
	boolean flag = heroDAO.registerHero(hero);

		assertEquals("new HeroTestCase", true, flag);

	}

/*
	@Test
	public void listHeroTestCase()
	{

List<Hero> list = heroDAO.list();
		int size = list.size();
	
		for(int index = 0; index < size; index++)
		{
			System.out.print("HeroId = "+list.get(index).getId());
			System.out.println("\t Name = "+list.get(index).getName());
			
		}
		assertEquals(2,size);
	}
*/


}
