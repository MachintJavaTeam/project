package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Features;
import com.example.demo.Services.FeaturesService;
@RestController
public class FeaturesController {
	@Autowired
	FeaturesService featuresService;
	
	@PostMapping("/features")
	public ResponseEntity<Features> saveFeatures(@RequestBody Features features){
		Features object1=featuresService.addFeatures(features);
		return new ResponseEntity<>(object1,HttpStatus.OK);
	}
	
	@GetMapping("/get-features")
	public ResponseEntity<List<Features>> getAllFeatures(){
		List<Features> features=featuresService.getAllFeatures();
		return new ResponseEntity<>(features,HttpStatus.OK);
	}
	
	/*@GetMapping("/get-userstory")
	public ResponseEntity<List<UserStory>> getAllUserStory(){
		List<UserStory> userstory=userstoryService.getAllUserStory();
		return new ResponseEntity<>(userstory,HttpStatus.OK);
	}*/

}