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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Epic;
import com.example.demo.Entity.Features;
import com.example.demo.Entity.Project;
import com.example.demo.Services.FeaturesService;
@RestController
public class FeaturesController {
	@Autowired
	FeaturesService featuresService;
	
	@PostMapping("/post-Features")
	public ResponseEntity<Features> saveFeatures(@RequestBody Features features){
		Features object1=featuresService.addFeatures(features);
		return new ResponseEntity<>(object1,HttpStatus.OK);
	}
	
	@GetMapping("/get-Features")
	public ResponseEntity<List<Features>> getAllFeatures(){
		List<Features> features=featuresService.getAllFeatures();
		return new ResponseEntity<>(features,HttpStatus.OK);
	}
	@PutMapping("/put-Features")
    public ResponseEntity<Features> updateFeature(@RequestBody Features feature) {
 
        Features object = featuresService.editFeatures(feature);
        return new ResponseEntity<>(object, HttpStatus.OK);
    }
 
    @DeleteMapping("/delete-Feature/{feature_id}")
    public void deleteFeatures(@PathVariable Long feature_id) {
 
    	featuresService.deleteFeatures(feature_id);
        
    }
	
	

}