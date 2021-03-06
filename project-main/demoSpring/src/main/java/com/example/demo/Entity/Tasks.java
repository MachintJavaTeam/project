package com.example.demo.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; 
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Table(name="task")
@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","emptasks"})
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String taskname;
    private String status;
  @OneToMany(mappedBy = "task",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonManagedReference(value="user-person2")
   private List<EmployeeTask> tasksemp ;
  
  
  @ManyToOne
  @JoinColumn(name="UserStory_id")
	@JsonBackReference(value="projectt3")
  private UserStory userstory;
	public Long getId() {
		return id;
	}

	

	public void setId(Long id) {
		this.id = id;
	}

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



	public List<EmployeeTask> getTasksemp() {
		return tasksemp;
	}



	public void setTasksemp(List<EmployeeTask> tasksemp) {
		this.tasksemp = tasksemp;
	}



	public UserStory getUserstory() {
		return userstory;
	}



	public void setUserstory(UserStory userstory) {
		this.userstory = userstory;
	}
	
	

//	public List<Employee> getEmpname() {
//		return empname;
//	}
//
//	public void setEmpname(List<Employee> empname) {
//		this.empname = empname;
//	}
}
