package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.UserStoryDao;
import com.example.demo.Entity.UserStory;

@Service
public class UserStoryService 
{
	@Autowired
	private UserStoryDao userstoryDao;
	
	public List<UserStory> getAllUserStory() {
		return userstoryDao.findAll();
	}
	public UserStory addUserStory(UserStory userstory) 
	{
		return userstoryDao.save(userstory);
	}
	
	
	/*public UserStory saveUserStory(UserStory userstory) 
	{
		return userstoryDao.save(userstory);
	}
	public Optional<UserStory> getUserStoryDetails(int feature_id) 
	{
		return userstoryDao.findById(feature_id);
	}*/

}
