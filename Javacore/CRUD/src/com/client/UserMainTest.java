package com.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.UserDAO;
import com.model.User;

public class UserMainTest {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	//	Map<Integer,User> createdCustomer = new HashMap<>();
		int choice;
		UserDAO d = new UserDAO();
		do {
		System.out.println(" 1.create User\n 2.update user\n 3.Delete User\n 4.get\n 5.getAll\n 6.Exit");
		System.out.println("Enter your choice: ");
		choice = scan.nextInt();
		switch(choice) {
		
		case 1:
		System.out.println("Enter the number of employees:");
		int n = scan.nextInt();
		
		for(int i=1;i<=n;i++) {
		System.out.println("Enter Your Details:");
		//scan.nextLine();

		System.out.println("Enter your id:");
		int id = scan.nextInt();
		
		System.out.println("Enter your fullname:");
		String name = scan.next();
		System.out.println("Enter your email:");
		String email = scan.next();
		System.out.println("Enter the password:");
		String pass = scan.next();
		User u = new User(id,email,name,pass);
		d.createUser(u);
		}
		break;
		case 2:
			System.out.println("Enter the id to update:");
			
			int id = scan.nextInt();
			System.out.println("Enter the new values:");
			System.out.println();
			System.out.println("Enter your fullname:");
			String name = scan.next();
			System.out.println("Enter your email:");
			String email = scan.next();
			System.out.println("Enter the password:");
			String pass = scan.next();
			User u =new User(id,email,name,pass);
			d.updateUser(u);
			
			break;
			
		case 3:
			System.out.println("Enter the id  delete: ");
			int rid = scan.nextInt();
			d.deleteUser(rid);
			break;
			
		case 4:
			int gid;
			System.out.println("Enter the id");
			gid = scan.nextInt();
			d.get(gid);
			
			break;
			
		case 5:
			
			List<User> cust = new ArrayList<>(d.getAll());
			for(User customers : cust)
				System.out.println(customers);
			break;
			
			
		}
		}while(choice!=6);
		
		
	}
}


