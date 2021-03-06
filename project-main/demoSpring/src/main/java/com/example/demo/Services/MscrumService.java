package com.example.demo.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.MscrumDaoProject;
//import com.example.mscrum.Dao.MscrumDaoEpic;
//import com.example.mscrum.Entity.Epic;
//import com.example.mscrum.Entity.Epic;
import com.example.demo.Entity.Project;
@Service
public class MscrumService 
{
@Autowired
private MscrumDaoProject mscrumDaoProject;
//@Autowired
//private MscrumDaoEpic mscrumDaoEpic;

public Project addProject(Project project) {
	
	return mscrumDaoProject.save(project);
}
public List<Project> getAllProjects()
{
	return mscrumDaoProject.findAll();
}
public Project editProject(Project entity) {
	return mscrumDaoProject.save(entity);
}
public void deleteProject(Integer project_id) {
	 mscrumDaoProject.deleteById(project_id);
}
}
