package com.employeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeeManagement.entity.Employee;
import com.employeeManagement.repository.EmployeeRepository;

@CrossOrigin(origins = "*",allowedHeaders="*")
@RestController
public class AppController {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	 @GetMapping("/employeeSearch")
	    public List<Employee> getUsers() {
	        return (List<Employee>) employeeRepository.findAll();
	    }
	 
	    @PostMapping("/employeeSave")
	    void addUser(@RequestBody Employee employee) {
	    	employeeRepository.save(employee);
	    }
	

	
	
}

