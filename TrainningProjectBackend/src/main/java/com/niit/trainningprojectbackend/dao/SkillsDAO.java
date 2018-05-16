package com.niit.trainningprojectbackend.dao;

import java.util.List;

import com.niit.trainningprojectbackend.model.SkillMap;



public interface SkillsDAO 
{

	public boolean addSkills(SkillMap skills);

	public boolean editSkills(SkillMap skills);

	public List<SkillMap> getAllSkills();

    public SkillMap getSkillsByName(String skillName);
	
	
}
