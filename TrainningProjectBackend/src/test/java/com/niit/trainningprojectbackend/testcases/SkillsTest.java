package com.niit.trainningprojectbackend.testcases;

import static org.junit.Assert.assertEquals;



import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.trainningprojectbackend.dao.SkillsDAO;
import com.niit.trainningprojectbackend.model.SkillMap;

public class SkillsTest 
{

/*	Logger log = LoggerFactory.getLogger(SkillsTest.class);
	
	
	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static SkillsDAO skillsDAO;
	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		skillsDAO = (SkillsDAO) context.getBean("skillsDAO");
		//employee = (Employee) context.getBean("employee");

	}

	@Test
	public void createSkillsTestCase()
	{
		SkillMap skillMap=new SkillMap();

		skillMap.setTechnical_Skills("C, C++,JAVA");
		skillMap.setCertifications("SCJP");            //OCJP
		skillMap.setEmailId("sunil@gmail.com");
		skillMap.setTotal_No_Of_Years_Exp("5");
		
		skillMap.setStudent_Feedback("Good");
		skillMap.setNo_Of_Students_Placed("10");
	    skillMap.setTotal_No_Of_Teachning_Hours("40");
	    skillMap.setNo_Of_Languages_knowns("English, Hindi");
		
	boolean flag = skillsDAO.addSkills(skillMap);

		assertEquals("new  Skills TestCase", true, flag);

	}

/*
	@Test
	public void listSkillsTestCase()
	{
		log.info("List of Skills");
		List<SkillMap> list = skillsDAO.getAllSkills();
		
		int size = list.size();
	
		for(int index = 0; index < size; index++)
		{
			System.out.print(" Technical Skills = "+list.get(index).getTechnical_Skills());
			System.out.println("\t Total Number of Years Exp  = "+list.get(index).getTotal_No_Of_Years_Exp());
			System.out.println("\t Certifications   = "+list.get(index).getCertifications());
			
			
		}
		assertEquals(2,size);
	}

*/

}
