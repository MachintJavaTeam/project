package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.FeaturesDao;
import com.example.demo.Entity.Epic;
import com.example.demo.Entity.Features;
import com.example.demo.Entity.Project;

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

	public Features editFeatures(Features entity) {
		return featuresDao.save(entity);
	}
	public void deleteFeatures(Long feature_id) {
		 featuresDao.deleteById(feature_id);
	}
	
	
}
