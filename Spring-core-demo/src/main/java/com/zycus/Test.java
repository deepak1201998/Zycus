package com.zycus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zycus.dao.EmployeeDAO;
import com.zycus.model.Employee;
import com.zycus.services.EmployeeService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		//EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);
		//employeeDAO.saveEmployee();
		
		
		//EmployeeService employeeService = context.getBean(EmployeeService.class);
		//if(employeeService.getEmployeeDAO()!=null) {
		//	System.out.println("Autowired successful ");
		//}
		
		
       Employee e1 = context.getBean(Employee.class);
		
		System.out.println(e1);
		
		Employee e2 = context.getBean(Employee.class);
		
		System.out.println(e2);

	}

}
