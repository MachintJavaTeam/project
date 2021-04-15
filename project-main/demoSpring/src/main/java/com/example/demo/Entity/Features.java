package com.example.demo.Entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int feature_id;
    private String FeatureName;
	@OneToMany(mappedBy="features", cascade = CascadeType.ALL)
	@JsonManagedReference(value="projectt2")
	//@JoinColumn(name="feature_id",referencedColumnName = "feature_id", nullable = true)
	
	private List<UserStory> userstory;
	@ManyToOne
	@JoinColumn(name="epic_id")
	@JsonBackReference(value="projectt1")
	private Epic epic;
	public int getFeature_id() {
		return feature_id;
	}
	public void setFeature_id(int feature_id) {
		this.feature_id = feature_id;
	}
	public String getFeatureName() {
		return FeatureName;
	}
	public void setFeatureName(String featureName) {
		FeatureName = featureName;
	}
	public List<UserStory> getUserstory() {
		return userstory;
	}
	public void setUserstory(List<UserStory> userstory) {
		this.userstory = userstory;
	}
	public Epic getEpic() {
		return epic;
	}
	public void setEpic(Epic epic) {
		this.epic = epic;
	}
	
	
	

	

}
