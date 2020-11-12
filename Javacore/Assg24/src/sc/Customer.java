package sc;

import java.util.Date;

public class Customer implements Comparable<Customer> {

	
	
	private long id;
     String name;
	private String mobileNumber;
	private Date  birthdate;
	 double averageSpendAmount;
	private double totalAmount;
	 double rating;
	private Date dateEnrolled;
	
	
	
	public Customer(long id, String name, String mobileNumber, Date birthdate, double averageSpendAmount,
			double totalAmount, double rating, Date dateEnrolled) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.birthdate = birthdate;
		this.averageSpendAmount = averageSpendAmount;
		this.totalAmount = totalAmount;
		this.rating = rating;
		this.dateEnrolled = dateEnrolled;
	}
	
	public int compareTo(Customer e) {
		return name.compareTo(e.name);
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
		return String.format("%lf\n %s\n %s\n %t\n %f\n %f\n %t\n %f",  id , name, mobileNumber, birthdate
				,averageSpendAmount,totalAmount,dateEnrolled,rating);
	}


	
}
