package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.UserStory;
import com.example.demo.Services.UserStoryService;

@RestController

public class UserStoryController {

	@Autowired
	private UserStoryService userstoryService;
	
	@PostMapping("/userstory")
	public ResponseEntity<UserStory> saveUserStory(@RequestBody UserStory userstory){
		UserStory object=userstoryService.addUserStory(userstory);
		return new ResponseEntity<>(object,HttpStatus.OK);
	}
	
	@GetMapping("/get-userstory")
	public ResponseEntity<List<UserStory>> getAllUserStory(){
		List<UserStory> userstory=userstoryService.getAllUserStory();
		return new ResponseEntity<>(userstory,HttpStatus.OK);
	}

	
	
	/*@PostMapping("/userstory")
	public UserStory saveUserStory(@RequestBody UserStory userstory) {
		return userstoryService.saveUserStory(userstory);
	}*/
		
}