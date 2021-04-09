package com.example.demo.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="userstory")
@NamedQuery(name="UserStory.findAll",query="Select f from UserStory f")

public class UserStory {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int feature_id;
	private String ProjectName;
	private String Epic;
	private String Feature;
	private String UserStoryName;
	private int StorySize;
	private String PlanStartDate;
	private String PlanEndDate;
	private String UserStoryDetails;
	@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.ALL,optional=false)
	@JoinColumn(name="feature_id",insertable=false,updatable=false)
	private Features features;
	public String getProjectName() 
	{
		return ProjectName;
	}
	public void setProjectName(String projectName) 
	{
		ProjectName = projectName;
	}
	public String getEpic() 
	{
		return Epic;
	}
	public void setEpic(String epic) 
	{
		Epic = epic;
	}
	public String getFeature() 
	{
		return Feature;
	}
	public void setFeature(String feature) 
	{
		Feature = feature;
	}
	public int getFeature_id() 
	{
		return feature_id;
	}
	public void setFeature_id(int feature_id) 
	{
		this.feature_id = feature_id;
	}
	public String getUserStoryName() 
	{
		return UserStoryName;
	}
	public void setUserStoryName(String userStoryName) 
	{
		UserStoryName = userStoryName;
	}
	public int getStorySize() 
	{
		return StorySize;
	}
	public void setStorySize(int storySize) 
	{
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
	public String getUserStoryDetails() 
	{
		return UserStoryDetails;
	}
	public void setUserStoryDetails(String userStoryDetails) 
	{
		UserStoryDetails = userStoryDetails;
	}

}