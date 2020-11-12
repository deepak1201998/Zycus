package Cust;
import java.text.SimpleDateFormat;
import java.util.*;
public class Customer {
	
	private long id;
	private String name;
	private String mobileNumber;
	private Date  birthdate;
	private double averageSpendAmount;
	private double totalAmount;
	private double rating;
	private Date dateEnrolled;
	
	public Customer(long id, String name, String mobileNumber, Date birthdate, double averageSpendAmount,
			double totalAmount,  Date dateEnrolled, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.birthdate = birthdate;
		this.averageSpendAmount = averageSpendAmount;
		this.totalAmount = totalAmount;
		this.dateEnrolled = dateEnrolled;
		this.rating = rating;
	}

	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public double getAverageSpendAmount() {
		return averageSpendAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public double getRating() {
		return rating;
	}

	public Date getDateEnrolled() {
		return dateEnrolled;
	}

	

	@Override
	public String toString() {
		SimpleDateFormat sf = new SimpleDateFormat("DD-MM-YYYY");
		return "id:" + id + "\nName:" + name + ",\nMobileNumber:" + mobileNumber + "\nBirthdate:" + sf.format(birthdate)
				+ "\nAverageSpendAmount:" + averageSpendAmount + "\nTotalAmount:" + totalAmount + "\nRating:" + rating
				+ "\nDateEnrolled:" + sf.format(dateEnrolled);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		Customer other = (Customer) obj;
		
		if (birthdate == null) {
			if (other.birthdate != null)
				return false;
			
		} 
		else if (birthdate.equals(other.birthdate))
			return true;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (mobileNumber.equals(other.mobileNumber))
			return true;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (name.toLowerCase().equals(other.name.toLowerCase()))
			return true;
		return true;
	}



	
	
	
	
	
	
	

	
	 
}
