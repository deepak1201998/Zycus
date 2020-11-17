package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Employee;
import com.example.demo.entities.EmployeeRepository;

@SpringBootApplication
public class SpringBootDemo1Application implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository  empRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Optional<Employee> optionalEmp = empRepo.findById(3L);
		if(optionalEmp.isPresent()) {
			
			Employee e1 = optionalEmp.get();
			System.out.println(e1);
		}
		
		
	}

	
	
}
