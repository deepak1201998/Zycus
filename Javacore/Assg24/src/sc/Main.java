package sc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer e1 = new Customer(222, "john", '91671849', 12-12-1990, 4000,12000,12-12-2017, 3.5);
		Customer e2 = new Customer(111, "mark", "5678909876", 13-01-1992, 3000, 8000.0,14-04-2014, 4);
		Customer e3 = new Customer(333, "anil", "34567894567", 19-09-2015,6000,50000,16-09-2016,3.75);
		
		
      ArrayList<Customer> e = new ArrayList<Customer>();
      e.add(e1);
      e.add(e2);
      e.add(e3);
      
      Collections.sort(e);
      e.toString();
      
      
      
      Scanner sc = new Scanner(System.in);
		SimpleDateFormat f = new SimpleDateFormat("DD-MM-YYYY");
		

	int ans;
	
		do {
			
			System.out.println("1.Name\n2.Amount Spent\n3.Rating\nEnter type to sort:");
			int choice =sc.nextInt();
			
			switch(choice)
			{ 
			  case 1:
				  Customer c = new Customer();
				  break;
				  
			  case 2:
				  AmountComparator s = new AmountComparator();
				  break;
				  
			  case 3:
				  RatingComparator n = new RatingComparator();
				  break;
			  default:
				  System.out.println("Invalid Choice:");
				  break;
				  
	
			}
			
			System.out.println("Do you want to continue if yes then enter 8 rather than 9");
			ans = sc.nextInt();
			
		} // end of do
		
		while(ans == 8);
		
		

      
      
	}

}
