package com.example.demo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="userstory")
@NamedQuery(name="UserStory.findAll",query="Select f from UserStory f")

public class UserStory {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userstory_id;
    private String UserStoryName;
	private int StorySize;
	private String PlanStartDate;
	private String PlanEndDate;
	private String UserStoryDetails;
	@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL,optional=false)
	@JoinColumn(name="feature_id")
	@JsonBackReference(value="projectt2")
	private Features features;
	
	@OneToMany(mappedBy="userstory",cascade = CascadeType.ALL)
	@JsonManagedReference(value="projectt3")
	private List<Tasks> tasks;

	public int getUserstory_id() {
		return userstory_id;
	}

	public void setUserstory_id(int userstory_id) {
		this.userstory_id = userstory_id;
	}

	public String getUserStoryName() {
		return UserStoryName;
	}

	public void setUserStoryName(String userStoryName) {
		UserStoryName = userStoryName;
	}

	public int getStorySize() {
		return StorySize;
	}

	public void setStorySize(int storySize) {
		StorySize = storySize;
	}

	public String getPlanStartDate() {
		return PlanStartDate;
	}

	public void setPlanStartDate(String planStartDate) {
		PlanStartDate = planStartDate;
	}

	public String getPlanEndDate() {
		return PlanEndDate;
	}

	public void setPlanEndDate(String planEndDate) {
		PlanEndDate = planEndDate;
	}

	public String getUserStoryDetails() {
		return UserStoryDetails;
	}

	public void setUserStoryDetails(String userStoryDetails) {
		UserStoryDetails = userStoryDetails;
	}

	public Features getFeatures() {
		return features;
	}

	public void setFeatures(Features features) {
		this.features = features;
	}

	public List<Tasks> getTasks() {
		return tasks;
	}

	public void setTasks(List<Tasks> tasks) {
		this.tasks = tasks;
	}
	

	
	

}