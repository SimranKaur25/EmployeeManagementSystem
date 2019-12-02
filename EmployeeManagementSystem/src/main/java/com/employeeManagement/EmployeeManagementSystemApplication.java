package com.employeeManagement;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.employeeManagement.entity.Employee;
import com.employeeManagement.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(EmployeeRepository empRepository) throws ParseException
	{ 
		

			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			final Date date = sdf.parse(sdf.format(new Date()));
	
		
		return args-> {
			Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name->{
				Employee employee =new Employee(name, name+"Last", "IT dept", 12, date,
				date);
				empRepository.save(employee);
			});
		};
		}
		
		
	}
		



