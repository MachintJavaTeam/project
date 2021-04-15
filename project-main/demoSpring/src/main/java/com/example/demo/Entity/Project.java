package com.example.demo.Entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;




@Entity
@Table(name = "project")
@NamedQuery(name="Project.findAll",query="select f from Project f")
public class Project {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int project_id;
	private String project_name;
	private String project_description;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="project",fetch=FetchType.EAGER)
	@JsonManagedReference(value="projectt")
	private List<Epic> epic;
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getProject_description() {
		return project_description;
	}
	public void setProject_description(String project_description) {
		this.project_description = project_description;
	}
	public List<Epic> getEpic() {
		return epic;
	}
	public void setEpic(List<Epic> epic) {
		this.epic = epic;
	}
   
	}
	
