package com.example.demo.Controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.TaskDao;
import com.example.demo.Entity.Epic;
import com.example.demo.Entity.Tasks;
import com.example.demo.Services.TaskService;


@RestController
public class TaskController {
	@Autowired
	TaskService taskService;
	@Autowired
	TaskDao taskDao;
	
	
	@PostMapping("/post-Tasks")
	public Tasks saveTasks(@RequestBody Tasks task)
	{
		return taskService.saveTask(task);
	}
	@GetMapping("/get-Tasks")
	public List<Tasks> getAllTasks()
	{
		return taskDao.findAll();
	}
	@GetMapping("get-Tasks/{id}")
	public Optional<Tasks> getTaskById(@PathVariable long id)
	{
		return taskDao.findById(id);
	}
	@PutMapping("/put-Tasks")
    public ResponseEntity<Tasks> updateTasks(@RequestBody Tasks tasks) {
 
        Tasks object = taskService.editTasks(tasks);
        return new ResponseEntity<>(object, HttpStatus.OK);
    }
 
    @DeleteMapping("/delete-Tasks/{id}")
    public void deleteTasks(@PathVariable Long id) {
 
        taskService.deleteTasks(id);
        
    }

}
