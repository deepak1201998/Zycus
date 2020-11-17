package com.example.demo.entities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//same as EmployeeDAO
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
	    
	
}
 