package com.example.demo.Controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.EmployeeDao;
import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Epic;
import com.example.demo.Services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@Autowired
	EmployeeDao employeeDao;
	
	@GetMapping("/get-Employee")
	public List<Employee> getEmployee()
	{
		return employeeDao.findAll();
	}
	@GetMapping("/get-Employee/{empid}")
	public Optional<Employee> getEmployeeById(@PathVariable long id )
	{
		return empService.getEmployeeDetails(id);
	}
	
	@PostMapping("/post-Employee")
	public Employee saveEmployee(@RequestBody Employee emps)
	{
		return empService.saveEmp(emps);
	}
	@PutMapping("/put-Employee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
 
        Employee object = empService.editEmployee(employee);
        return new ResponseEntity<>(object, HttpStatus.OK);
    }
 
    @DeleteMapping("/delete-Employee/{empid}")
    public void deleteEmployee(@PathVariable Long empid) {
 
        empService.deleteEmployee(empid);
        
    }
	
	

}
