package Dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class UserDbConnect {
	
	

	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "abc@123");
			
			return   con;
			
		} 
		
		catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
			
		} 
		catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	public static void closeConnection(UserDbConnect con) {
		if(con!=null) {
			try {
				((Connection) con).close();
			} 
			
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


}
