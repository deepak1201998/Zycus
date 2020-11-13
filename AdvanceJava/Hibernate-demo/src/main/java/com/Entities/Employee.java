package com.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String eName;
	private String city;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(String eName, String city, double salary) {
		super();
		this.eName = eName;
		this.city = city;
		this.salary = salary;
	}

	public Employee(Long id, String eName, String city, double salary) {
		super();
		this.id = id;
		this.eName = eName;
		this.city = city;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\n\t Employee [id=" + id + ", eName=" + eName + ", city=" + city + ", salary=" + salary + "]";
	}
	

}
