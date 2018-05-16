package com.niit.trainningprojectbackend.model;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
public class SkillMap 
{

	@NotNull
	private String technical_Skills;

	@NotNull
	private String certifications;

	@NotNull
	private String total_No_Of_Years_Exp;
	
	@NotNull
	private String total_No_Of_Teachning_Hours;
	
	@NotNull
	private String total_No_Of_Students;
	
	@NotNull
	private String student_Feedback;
	
	private String no_Of_Students_Placed;
	
	@NotNull
	private String no_Of_Languages_knowns;

	@NotNull
	@Email
	private String emailId;

	public String getTechnical_Skills() {
		return technical_Skills;
	}

	public void setTechnical_Skills(String technical_Skills) {
		this.technical_Skills = technical_Skills;
	}

	public String getCertifications() {
		return certifications;
	}

	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}

	public String getTotal_No_Of_Years_Exp() {
		return total_No_Of_Years_Exp;
	}

	public void setTotal_No_Of_Years_Exp(String total_No_Of_Years_Exp) {
		this.total_No_Of_Years_Exp = total_No_Of_Years_Exp;
	}

	public String getTotal_No_Of_Teachning_Hours() {
		return total_No_Of_Teachning_Hours;
	}

	public void setTotal_No_Of_Teachning_Hours(String total_No_Of_Teachning_Hours) {
		this.total_No_Of_Teachning_Hours = total_No_Of_Teachning_Hours;
	}

	public String getTotal_No_Of_Students() {
		return total_No_Of_Students;
	}

	public void setTotal_No_Of_Students(String total_No_Of_Students) {
		this.total_No_Of_Students = total_No_Of_Students;
	}

	public String getStudent_Feedback() {
		return student_Feedback;
	}

	public void setStudent_Feedback(String student_Feedback) {
		this.student_Feedback = student_Feedback;
	}

	public String getNo_Of_Students_Placed() {
		return no_Of_Students_Placed;
	}

	public void setNo_Of_Students_Placed(String no_Of_Students_Placed) {
		this.no_Of_Students_Placed = no_Of_Students_Placed;
	}

	public String getNo_Of_Languages_knowns() {
		return no_Of_Languages_knowns;
	}

	public void setNo_Of_Languages_knowns(String no_Of_Languages_knowns) {
		this.no_Of_Languages_knowns = no_Of_Languages_knowns;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	
}
