package com.example.demo.Entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="features")
@NamedQuery(name="Features.findAll",query="Select f from Features f")
public class Features 
{
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int feature_id;
	private String ProjectName;
	private String Epic;
	private String FeatureName;
	@OneToMany(mappedBy="features", cascade = CascadeType.ALL,orphanRemoval=false)
	@JsonManagedReference(value="projectt2")
	//@JoinColumn(name="feature_id",referencedColumnName = "feature_id", nullable = true)
	
	private List<UserStory> userstory;
	@ManyToOne
	@JoinColumn(name="epic_id")
	@JsonBackReference(value="projectt1")
	private Epic epic;
	
	public List<UserStory> getUserstory() 
	{
		return userstory;
	}
	public void setUserstory(List<UserStory> userstory) 
	{
		this.userstory = userstory;
	}
	public String getProjectName() 
	{
		return ProjectName;
	}
	public void setProjectName(String projectName) 
	{
		this.ProjectName = projectName;
	}
	public int getFeature_id() {
		return feature_id;
	}
	public void setFeature_id(int feature_id) {
		this.feature_id = feature_id;
	}
	
	public String getEpic() 
	{
		return Epic;
	}
	public void setEpic(String epic) 
	{
		this.Epic = epic;
	}
	public String getFeatureName() 
	{
		return FeatureName;
	}
	public void setFeatureName(String featureName) 
	{
		this.FeatureName = featureName;
	}
	public void setEpic(Epic epic) {
		this.epic = epic;
	}
	

}
