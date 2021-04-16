package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.EmployeeDao;
import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Epic;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	public Employee saveEmp(Employee emps) {
		return employeeDao.save(emps);
	}
	public Optional<Employee> getEmployeeDetails(long id) {
		 return employeeDao.findById(id);
	}
	public Employee editEmployee(Employee entity) {
		return employeeDao.save(entity);
	}
	public void deleteEmployee(Long empid) {
		 employeeDao.deleteById(empid);
	}

}
