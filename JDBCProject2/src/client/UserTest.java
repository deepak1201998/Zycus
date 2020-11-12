package client;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.User;
import repository.jdbcUserImpl;


public class UserTest {
	
	
	
	  public static void main(String args[]) throws ClassNotFoundException, SQLException {
		  

		    Scanner sc = new Scanner(System.in);
		
			int choice,ans;
			
			jdbcUserImpl jdbcUser = new jdbcUserImpl();
			do {
			      System.out.println(" 1.Create User\n 2.Update User\n 3.Delete User\n 4.getUser\n 5.getAllUsers");
			      System.out.println("Enter your choice: ");
			      choice = sc.nextInt();
			
			switch(choice) {
			
	  case 1:
			System.out.println("Enter the number of Users:");
			int n = sc.nextInt();
			
			for(int i=1;i<=n;i++) {
				System.out.println("Enter the id of User:");
				int id = sc.nextInt();
			    
				System.out.println("Enter email of user:");
				String email = sc.next();
				
				
				System.out.println("Enter fullname of user:");
				String fullname = sc.next();
				
				System.out.println("Enter password for user:");
				String password = sc.next();
				
				User us = new User(id, email, fullname, password);
				jdbcUser.createUser(us);
			}
			break;
			
	   case 2:
				
				System.out.println("Enter the new values to update:");
				System.out.println("Enter the id of User:");
				int id = sc.nextInt();
			    
				System.out.println("Enter email of user:");
				String email = sc.next();
				sc.nextLine();
				
				System.out.println("Enter fullname of user:");
				String fullname = sc.next();
				
				System.out.println("Enter password for user:");
				String password = sc.next();
				
				User us = new User(id, email, fullname, password);
				jdbcUser.updateUser(us);
				
				break;
				
		case 3:
				System.out.println("Enter the id to be deleted: ");
				int did = sc.nextInt();
				jdbcUser.deleteUser(did);
				break;
				
		case 4:
			    System.out.println("Enter the id to fetch particular row : ");
				int uid = sc.nextInt();
				jdbcUser.getUser(uid);
				
				
				break;
				
		case 5:
				
				List<User> userlist = new ArrayList<>(jdbcUser.getAllUsers());
				for(User use : userlist)
					System.out.println(use);
				break;
				
		 default:
			  System.out.println("Invalid Choice:");
			  break;
				
				
			  }
			System.out.println("Do you want to continue if yes then enter 8 rather than 9");
			ans = sc.nextInt();
			
			}
			
			while(ans == 8);
			
			

		  
		  
		  
		  
	  }
	  
	  
	

	}


