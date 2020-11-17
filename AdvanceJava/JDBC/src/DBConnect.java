import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class DBConnect {
	
	
	
	  public static void main(String args[]) throws ClassNotFoundException, SQLException {
		  

		    Scanner sc = new Scanner(System.in);
		
			int choice;
			DBDao d = new DBDao();
			do {
			      System.out.println(" 1.Save Employee\n 2.Update Employee\n 3.Delete Employee\n 4.getEmployee\n 5.getAllEmployees\n 6.Exit");
			      System.out.println("Enter your choice: ");
			      choice = sc.nextInt();
			
			switch(choice) {
			
	  case 1:
			System.out.println("Enter the number of Users:");
			int n = sc.nextInt();
			
			for(int i=1;i<=n;i++) {
				System.out.println("Enter the id of Employee:");
				int id = sc.nextInt();
			    
				System.out.println("Enter name of employee:");
				String name = sc.next();
				
				
				System.out.println("Enter city of employee:");
				String city = sc.next();
				
				System.out.println("Enter salary for employee:");
				double salary = sc.nextDouble();
				
				Employee e = new Employee(id, name, city, salary);
				d.saveEmployee(e);
			}
			break;
			
	   case 2:
				
				System.out.println("Enter the new values to update:");
				
				System.out.println("Enter the id of Employee:");
				int id = sc.nextInt();
			    
				System.out.println("Enter name of employee:");
				String name = sc.next();
				
				
				System.out.println("Enter city of employee:");
				String city = sc.next();
				
				System.out.println("Enter salary for employee:");
				double salary = sc.nextDouble();
				
				Employee e =new Employee(id, name, city, salary);
				d.updateEmployee(e);
				
				break;
				
		case 3:
				System.out.println("Enter the id to be deleted: ");
				int did = sc.nextInt();
				d.deleteEmployee(did);
				break;
				
		case 4:
			    System.out.println("Enter the id to fetch particular row : ");
			    int uid =sc.nextInt();
			    d.getEmployee(uid);
				
				
				break;
				
		case 5:
				
				List<Employee> emplist = new ArrayList<>(d.getAllEmployees());
				for(Employee emp : emplist)
					System.out.println(emp);
				break;
				
		case 6:
				System.exit(0);
				
				
				
			}
			}while(choice !=7);
			
			

		  
		  
		  
		  
	  }
	  
	  
	}
	
	
		
	
	
	
	
	
	
	
	
