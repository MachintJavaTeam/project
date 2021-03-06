package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.TaskDao;
import com.example.demo.Entity.Epic;
import com.example.demo.Entity.Tasks;

@Service
public class TaskService {

	@Autowired
	TaskDao ts;
	public Tasks saveTask(Tasks task) {
		return ts.save(task);
	}
	public Tasks editTasks(Tasks entity) {
		return ts.save(entity);
	}
	public void deleteTasks(Long id) {
		 ts.deleteById(id);
	}

}
