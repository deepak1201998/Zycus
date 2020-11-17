package com.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Transient;

@Entity
@NamedQueries({@NamedQuery(name ="findByCity",  query= "SELECT a from Author a WHERE a.bio=:city"),
	@NamedQuery(name ="findAll",  query= "SELECT a from Author a")
	
	})
public class Author {


	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;

	  @Column(name = "first_name", length = 50)
	  private String firstName;

	  @Column(name = "last_name", nullable = false)
	  private String lastName;

	  @Column(length = 5000)
	  private String bio;

	  @Column(name = "date_of_birth")
	  private LocalDate dateOfBirth;

	  @Transient
	  private Integer age;

	public Author() {
		super();
	}

	public Author(String firstName, String lastName, String bio, LocalDate dateOfBirth, Integer age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.bio = bio;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
	}

	public Author(Long id, String firstName, String lastName, String bio, LocalDate dateOfBirth, Integer age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bio = bio;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "\n\t\t Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", bio=" + bio
				+ ", dateOfBirth=" + dateOfBirth + ", age=" + age + "]";
	}
	
	
	
	
	  
	  
	  
	  


	
}
