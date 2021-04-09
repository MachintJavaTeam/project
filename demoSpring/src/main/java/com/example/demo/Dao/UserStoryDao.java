package com.example.demo.Dao;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.UserStory;

@Repository
@Transactional
public interface UserStoryDao extends JpaRepository<UserStory,Long>
{

}
