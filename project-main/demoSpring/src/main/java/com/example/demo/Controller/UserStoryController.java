package com.example.demo.Controller;
import java.util.List;

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

import com.example.demo.Entity.Epic;
import com.example.demo.Entity.UserStory;
import com.example.demo.Services.UserStoryService;

@RestController

public class UserStoryController {

	@Autowired
	private UserStoryService userstoryService;
	
	@PostMapping("/post-UserStory")
	public ResponseEntity<UserStory> saveUserStory(@RequestBody UserStory userstory){
		UserStory object=userstoryService.addUserStory(userstory);
		return new ResponseEntity<>(object,HttpStatus.OK);
	}
	
	@GetMapping("/get-UserStory")
	public ResponseEntity<List<UserStory>> getAllUserStory(){
		List<UserStory> userstory=userstoryService.getAllUserStory();
		return new ResponseEntity<>(userstory,HttpStatus.OK);
	}
	@PutMapping("/put-UserStory")
    public ResponseEntity<UserStory> updateUserStory(@RequestBody UserStory userStory) {
 
        UserStory object = userstoryService.editUserStory(userStory);
        return new ResponseEntity<>(object, HttpStatus.OK);
    }
 
    @DeleteMapping("/delete-UserStory/{userstory_id}")
    public void deleteUserStory(@PathVariable Long userstory_id) {
 
    	 userstoryService.deleteUserStory(userstory_id);
        
    }
		
}