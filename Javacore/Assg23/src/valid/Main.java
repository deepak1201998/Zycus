package valid;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class Main {

	
	static boolean validateAge() {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter year:");
		int year  = sc.nextInt();
		System.out.print("Enter month:");
		int month = sc.nextInt();
		System.out.print("Enter day of month:");
		int day = sc.nextInt();
	
		LocalDate date = LocalDate.of(year, month, day);
		LocalDate now = LocalDate.now();
		Period diff = Period.between(date, now);
		int age = diff.getYears();
		
		if(age>=18) {
			return true;
		}
		
		return false;  
	}

	
	static boolean validateName() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Name:"); 
		String s = sc.nextLine();
		
		  if (s == null) {
	            return false;
	        }
	 
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
	                return false;
	            }
	        }
	        return true;
		
		
	}
	
	
	static boolean validateLuckyCustomer() {
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter MobileNumber:");
		 String mobileNumber = sc.nextLine();
		
		int m = Integer.parseInt(mobileNumber);
		int mob = m;
		int sum= 0;
		 while (mob > 0 || sum >= 10)  
	        { 
	            if (mob == 0) { 
	                mob = sum; 
	                sum = 0; 
	            } 
	            sum += mob % 10; 
	            mob /= 10; 
	        } 
		    
	       if(sum == 1) {
	    	   return true;
	       } 
	       else {
	    	   return false;
	       }
		
		

	}
	
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat f = new SimpleDateFormat("DD-MM-YYYY");
		

	int ans;
	
		do {
			
			System.out.println("1.Validate Age\n2.Validate Name\n3.Lucky Customer\nEnter your choice");
			int choice =sc.nextInt();
			
			switch(choice)
			{ 
			  case 1:
				  //System.out.println("Enter Birtdate:");
				  //Date birthdate = f.parse(sc.nextLine());
				  //validateAge();
				  if(validateAge() == true) {
					  System.out.println("Age is Valid");
				  }
				  else {
					  System.out.println("Age is not Valid");
				  }
				  break;
				  
			  case 2:
				  System.out.println("Enter Name:"); 
				  String name = sc.nextLine();
				  //validateName(name);
				  if(validateName() == true) {
					  System.out.println("Name is Valid");
				  }
				  else {
					  System.out.println("Name is not Valid");
				  }
				  break;
				  
			  case 3:
				  //System.out.print("Enter MobileNumber:");
				  //String mobileNumber = sc.nextLine();
				  //validateLuckyCustomer(mobileNumber);
				  if(validateLuckyCustomer() == true) {
					  System.out.println("Lucky Customer");
				  }
				  else {
					  System.out.println("Unlucky Customer");
				  }
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
