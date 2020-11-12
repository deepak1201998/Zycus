package valid;

import java.util.Date;

public class Customer {
	
	private String name;
	private String mobileNumber;
	private int  age;
	private Date  birthdate;
	
	
	public Customer(String name, String mobileNumber, int age, Date birthdate) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.age = age;
		this.birthdate = birthdate;
	}

	public String getName() {
		return name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public int getAge() {
		return age;
	}
	
	public Date getBirthdate() {
		return birthdate;
	}
	
	
	
	
	

}
