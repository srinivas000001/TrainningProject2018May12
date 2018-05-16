package com.niit.trainningprojectrestapp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.trainningprojectbackend.dao.HeroDAO;
import com.niit.trainningprojectbackend.model.Hero;


@RestController

public class HeroController {

	
	@Autowired
	private HeroDAO heroDAO;
	

//	@Autowired
	private Hero hero;

	@Autowired
	HttpSession session;

	@GetMapping("/getHeroList")
	public ResponseEntity<List<Hero>> getEmployeeList() throws NullPointerException
	{
			List<Hero> list = heroDAO.list();
			if (list.isEmpty()) 
			{
				hero.setErrorCode("100");
				hero.setErrorMsg("Users are not available");
			}
			else
			{

				for(Hero hero : list)
				{
					hero.setErrorCode("200");
					hero.setErrorMsg("Success");

				}
			}
			return new ResponseEntity<List<Hero>>(list, HttpStatus.OK);
	}

	@PostMapping("/add_Hero")
	public ResponseEntity<Hero> addEmployee(@RequestBody Hero hero) 
	{	    

		boolean value = heroDAO.registerHero(hero);
		if (value == true) 
		{
			hero.setErrorCode("200");
			hero.setErrorMsg("New Employee added Successfully");
		} 
		else 
		{
			hero.setErrorCode("100");
			hero.setErrorMsg("Add Employee Failed");
		}
		return new ResponseEntity<Hero>(hero, HttpStatus.OK);
	}


}
