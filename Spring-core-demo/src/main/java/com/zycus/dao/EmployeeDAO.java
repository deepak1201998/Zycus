package com.zycus.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class EmployeeDAO {
	

	@Value("somedriverclassvalue")
	private String driverClass;
	
	@Value("someurl")
	private String url;
	
	@Value("someusername")
	private String username;
	
	@Value("somepass")
	private String password;
	
	public EmployeeDAO() {
		
		System.out.println("EmployeeDAO object is created..");
	}
	

	public EmployeeDAO(String driverClass, String url, String username, String password) {
		super();
		System.out.println("initializing values through parameterized constructor...");
		this.driverClass = driverClass;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "EmployeeDAO [driverClass=" + driverClass + ", url=" + url + ", username=" + username + ", password="
				+ password + "]";
	}
	

  //	public void  saveEmployee() {
	//	System.out.println("saving a new record..");
	//}
}
