package Cust;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new  StringTokenizer(sc.nextLine(), ",");
		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
		
		
		System.out.println("Enter the details of Customer 1: ");
		long id = Long.parseLong(st.nextToken());
		String name = st.nextToken();
		
		String mobileNumber = st.nextToken();
		
		Date birthdate = f.parse(st.nextToken());
		double averageSpendAmount = Double.parseDouble(st.nextToken());
		double totalAmount =  Double.parseDouble(st.nextToken());
		double rating =   Double.parseDouble(st.nextToken());
		
		Date dateEnrolled = f.parse(st.nextToken());
		
		Customer c1 = new Customer(id, name, mobileNumber, birthdate, averageSpendAmount, totalAmount,  dateEnrolled, rating);
		System.out.println(c1);
	
		
		

		System.out.println("Enter the details of Customer 2: ");
		StringTokenizer st1 = new  StringTokenizer(sc.nextLine(), ",");
	    id = Long.parseLong(st1.nextToken());
	    name = st1.nextToken();
		
		mobileNumber = st1.nextToken();
		
	    birthdate = f.parse(st1.nextToken());
		averageSpendAmount = Double.parseDouble(st1.nextToken());
		totalAmount =  Double.parseDouble(st1.nextToken());
	    rating =   Double.parseDouble(st1.nextToken());
		
		dateEnrolled = f.parse(st1.nextToken());
		
		Customer c2 = new Customer(id, name, mobileNumber, birthdate, averageSpendAmount, totalAmount,  dateEnrolled, rating);
		System.out.println(c2);
		if(c1.equals(c2))
		{
			System.out.println("Customer 1 and Customer 2 are same");
			
		}
		else
		{
			System.out.println("Customer 1 and Customer 2 are different");
			
		}		
	
		
		sc.close();
	}
	

}
