package com.example.demo.Controller;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.demo.Entity.Project;
import com.example.demo.Services.MscrumService;
 
@RestController
public class MscrumControllerProject {
 
    @Autowired
    private MscrumService mscrumService;
    
    @PostMapping("/post-Project")
    public Project saveProject(@RequestBody Project project) {
    	 
        return mscrumService.addProject(project);
      
    }
 
    @GetMapping("/get-Project")
    public ResponseEntity<List<Project>> getAllProjects() {
 
        List<Project> project = mscrumService.getAllProjects();
        return new ResponseEntity<>(project, HttpStatus.OK);
    }
 
    
    @PutMapping("/put-Project")
    public ResponseEntity<Project> updateProject(@RequestBody Project project) {
 
        Project object = mscrumService.editProject(project);
        return new ResponseEntity<>(object, HttpStatus.OK);
    }
 
    @DeleteMapping("/delete-Project/{project_id}")
    public void deleteProject(@PathVariable Integer project_id) {
 
        mscrumService.deleteProject(project_id);
        
    }
    
}