package com.niit.trainningprojectbackend.dao;

import java.util.List;

import com.niit.trainningprojectbackend.model.Hero;

public interface HeroDAO {

	
	public boolean registerHero(Hero hero);

	public boolean update(Hero hero);


	public List<Hero> list();


	
	public Hero getHeroByName(String name);

}
