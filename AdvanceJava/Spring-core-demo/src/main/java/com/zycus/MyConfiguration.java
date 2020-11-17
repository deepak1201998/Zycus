package com.zycus;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.zycus.dao.EmployeeDAO;

//using annotation
@ComponentScan(basePackages = {"com.zycus"})
public class MyConfiguration {
	
	@Bean
	public EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAO();
	}

}
