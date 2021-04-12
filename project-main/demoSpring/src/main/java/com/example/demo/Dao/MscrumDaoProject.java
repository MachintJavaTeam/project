package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Project;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface MscrumDaoProject extends JpaRepository<Project,Integer>
{

	
	
}

