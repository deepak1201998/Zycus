package com.zycus.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")
public class Employee {
	//@Value("Deepak")
	private String ename;
	
	//@Value("mumbai")
	private String city;
	
	
	
  public Employee() {
		
		System.out.println("Employee object is created..");
	}
  
      



   public Employee(String ename, String city) {
	super();
	this.ename = ename;
	this.city = city;
          }





public String getEname() {
	return ename;
}



public void setEname(String ename) {
	this.ename = ename;
}



public String getCity() {
	return city;
}



public void setCity(String city) {
	this.city = city;
}





@Override
public String toString() {
	return "Employee [ename=" + ename + ", city=" + city + "]";
}
     



         
   //@PostConstruct
	public void doSomethingAfterPropertiesSet() {
		
	}

	//@PreDestroy
	public void doBeforeBeanGetsDeleted() {  //this will run when container is destoyed i.e ApplicationContext line
		
	}

    
}
