package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Epic;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface MscrumDaoEpic extends JpaRepository<Epic,Integer>
{

	
	
}

