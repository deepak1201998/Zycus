package com.zycus;

import org.springframework.context.annotation.Bean;

import com.zycus.model.Employee;

//using annotation
public class Configuration2 {
	
	@Bean
	public Employee getEmployee() {
		
		return new Employee();
		
		
	}
	
	
	
	

}
