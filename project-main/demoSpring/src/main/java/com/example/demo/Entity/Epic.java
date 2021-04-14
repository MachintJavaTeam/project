package com.example.demo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;




@Entity
@Table(name = "epic")
@NamedQuery(name="Epic.findAll",query="select f from Epic f")

public class Epic {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int project_id;
	private int epic_id;
	private String epic_name;
	private String project_name;
	
	@ManyToOne(fetch=FetchType.EAGER)
			//,optional=false)
	@JoinColumn(name="project_id",insertable=false,updatable=false)
	@JsonBackReference(value="projectt")
	private Project project;
	
	
	@OneToMany(mappedBy="epic",cascade = CascadeType.ALL)
	@JsonManagedReference(value="projectt1")
	private List<Features> features;
//comments...
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
	
	public int getEpic_id() {
		return this.epic_id;
	}
	public void setEpic_id(int epic_id) {
		this.epic_id = epic_id;
	}
	

	public String getEpic_name() {
		return this.epic_name;
	}
	public void setEpic_name(String epic_name) {
		this.epic_name = epic_name;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public List<Features> getFeatures() {
		return features;
	}
	public void setFeatures(List<Features> features) {
		this.features = features;
	}
	
}
	
	


