package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.FeaturesDao;
import com.example.demo.Entity.Features;

@Service
public class FeaturesService 
{
	@Autowired
	private FeaturesDao featuresDao;
	public List<Features> getAllFeatures() 
	{
		return featuresDao.findAll();
	}

	public Features addFeatures(Features features) {
		// TODO Auto-generated method stub
		return featuresDao.save(features);
	}

	/*
	public Features saveFeatures(Features features) 
	{
		return featuresDao.save(features);
	}
	
	public Optional<Features> getFeaturesDetails(int feature_id) 
	{
		
		return featuresDao.findById(feature_id);
	}*/
	
}
