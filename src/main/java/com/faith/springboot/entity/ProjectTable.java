package com.faith.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProjectTable {

	
	//instance variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projectId;
	private String projectName;
	
	
	
	//default constructor
	public ProjectTable() {
		super();
		// TODO Auto-generated constructor stub
	}



	//parameterilsed constructor
	public ProjectTable(int projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
	}



	//getters and setters
	public int getProjectId() {
		return projectId;
	}



	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}



	public String getProjectName() {
		return projectName;
	}



	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
	
	
}
