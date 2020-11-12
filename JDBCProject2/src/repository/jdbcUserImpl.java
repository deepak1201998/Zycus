package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import Dbconn.UserCRUDOps;
import Dbconn.UserDbConnect;
import model.User;


public class jdbcUserImpl  implements UserDao {
	
	
	List<User> userList = new ArrayList<User>();

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		
		try {
			
			 
	    	  Connection con = (Connection) UserDbConnect.getConnection();
	    	  
			PreparedStatement stmt = con.prepareStatement(UserCRUDOps.GET_ALL_USERS);
			
			ResultSet rs  = stmt.executeQuery();
			
			
			while(rs.next()){
			
				
				
				String useremail =  rs.getString("userEmail");
				String userfullname = rs.getString("userFullname");
				String userpassword = rs.getString("userPassword");
				int userid  = rs.getInt("userId");
				User us = new User(userid,useremail,userfullname, userpassword);
				
				userList.add(us);
						
			}
			
			
				
		}
		
        catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	         	return null;
	         }
	
	
		 return userList;
	 }
	

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		
		try {
			  Connection con = (Connection) UserDbConnect.getConnection();
	    	  
				PreparedStatement stmt = con.prepareStatement(UserCRUDOps.GET_USER);
				stmt.setInt(1, id);
		
				ResultSet rs = stmt.executeQuery();
				User user = null;
				
				while(rs.next()){
					
					user = new User();
					user.setEmail(rs.getString("userEmail"));
					user.setFullname(rs.getString("userFullname"));
					user.setPassword(rs.getString("userPassword"));
					user.setUserid(rs.getInt("userId"));
					System.out.println(user);
							
				}
				
				return user;
				
		}
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			         	return null;
			         }
			
		
	}

	
	@Override
	public User createUser(User u) {
		// TODO Auto-generated method stub
		
		try {
			  Connection con =  (Connection) UserDbConnect.getConnection();
	    	  
				PreparedStatement stmt = con.prepareStatement(UserCRUDOps.CREATE_USER);
				stmt.setInt(1, u.getUserid());
				stmt.setString(2, u.getEmail());
				stmt.setString(3, u.getFullname());
				stmt.setString(4, u.getPassword());
				
				int r = stmt.executeUpdate();
				System.out.println(r + " rows inserted");
				
				
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		         	return null;
		         }
		
		return u;
		
		
		
		
	}

	@Override
	public User updateUser(User u) {
		// TODO Auto-generated method stub
		
		try {
			  Connection con = (Connection) UserDbConnect.getConnection();
	    	  
				PreparedStatement stmt = con.prepareStatement(UserCRUDOps.UPDATE_USER);
				stmt.setInt(1, u.getUserid());
				stmt.setString(2, u.getEmail());
				stmt.setString(3, u.getFullname());
				stmt.setString(4, u.getPassword());
				int r = stmt.executeUpdate();
				System.out.println(r + " rows updated");
				
				
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		         	return null;
		         }
		
		return u;
		
		
		
	
	}

	@Override
	public User deleteUser(int id) {
		// TODO Auto-generated method stub
		
		try {
			  Connection con = (Connection) UserDbConnect.getConnection();
	    	  
				PreparedStatement stmt = con.prepareStatement(UserCRUDOps.DELETE_USER);
				stmt.setInt(1, id);
				int rs  = stmt.executeUpdate();
				System.out.println("Employee id is deleted " +id);
				
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		         	return null;
		         }
		
		return null;
		
	
	}

}
