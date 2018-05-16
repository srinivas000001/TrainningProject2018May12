package com.niit.trainningprojectbackend.service;

import java.util.List;

import com.niit.trainningprojectbackend.model.SkillMap;

public interface SkillsService {

	
	public boolean addSkills(SkillMap skills);

	public boolean editSkills(SkillMap skills);

	public List<SkillMap> getAllSkills();

    public SkillMap getSkillsByName(String skillName);
}
