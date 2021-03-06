package com.example.demo.Dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Entity.Employee;
@Repository
@Transactional
public interface EmployeeDao extends JpaRepository<Employee,Long>
{
	
}
