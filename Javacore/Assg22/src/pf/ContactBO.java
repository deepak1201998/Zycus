package pf;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ContactBO {
	static List<Customer> cust = new ArrayList<>();
	static SimpleDateFormat sf = new SimpleDateFormat("DD-MM-YYYY");
	
	
	static Customer 
	createCustomer(String line) throws ParseException {
		String[] info = line.split(",");
		long id = Long.parseLong(info[0]);
		String name = info[1];
		
		String mobileNumber = info[2];
		
		Date birthdate = sf.parse(info[3]);
		double averageSpendAmount = Double.parseDouble(info[4]);
		double totalAmount =  Double.parseDouble(info[5]);
		double rating =   Double.parseDouble(info[6]);
		
		Date dateEnrolled = sf.parse(info[7]);
		
		
		Customer c = new Customer(id,name,mobileNumber,birthdate,averageSpendAmount,totalAmount, rating,dateEnrolled);
		return c;
		
	}
	
	static List<Customer> findCustomer(List<Customer> customerList, String name){
		for(Customer cname :customerList) {
			
			if(cname.getName().equals(name)) {
				cust.add(cname);
			}
			else {
				System.out.println("No Customers found");
			}
		}
		return cust;
		
		
	}
	
	static List<Customer> findCustomer(List<Customer> customerList,Date birth){
	for(Customer cbirth :customerList) {
			
			if(cbirth.getName().equals(birth)) {
				cust.add(cbirth);
			}
			else {
				System.out.println("No Customers found");
			}
		}
		return cust;
		
	} 

	
	
	static List<Customer> findCustomer(List<Customer> customerList,Double rating){
		
	for(Customer crating :customerList) {
			
			if(crating.getName().equals(rating)) {
				cust.add(crating);
			}
			else {
				System.out.println("No Customers found");
			}
		}
		return cust;
		
	}
}
