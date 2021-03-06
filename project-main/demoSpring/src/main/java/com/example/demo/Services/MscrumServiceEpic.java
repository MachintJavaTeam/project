package com.example.demo.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.example.mscrum.Dao.MscrumDaoProject;
import com.example.demo.Dao.MscrumDaoEpic;
import com.example.demo.Entity.Epic;
import com.example.demo.Entity.Project;
//import com.example.mscrum.Entity.Epic;
//import com.example.mscrum.Entity.Project;
@Service
public class MscrumServiceEpic
{
//@Autowired
//private MscrumDaoProject mscrumDaoProject;
@Autowired
private MscrumDaoEpic mscrumDaoEpic;

public Epic addEpic(Epic epic)
{
	
	return mscrumDaoEpic.save(epic);
}
public List<Epic> getAllEpic()
{
	return mscrumDaoEpic.findAll();
}

public Epic editEpic(Epic entity) {
	return mscrumDaoEpic.save(entity);
}
public void deleteEpic(Integer epic_id) {
	 mscrumDaoEpic.deleteById(epic_id);
}
}
