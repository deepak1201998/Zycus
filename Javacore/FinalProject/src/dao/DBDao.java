package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bo.Employee;
import utils.DBConnect;
import utils.EmployeeCRUDOPs;

public class DBDao {
	
	
	public  Employee getEmployee(int uid) {
		
		Connection con = (Connection) DBConnect.getConnection();
		
		List<Employee> listEmp = new ArrayList<>();
		
		
		 try {
			 
			 Employee emp = null ;

				PreparedStatement stmt = con.prepareStatement(EmployeeCRUDOPs.GET_EMPLOYEE);
				stmt.setInt(1, uid);
				
				
				ResultSet rs  = stmt.executeQuery();
				
				
				
					while(rs.next()) {
						int empid = rs.getInt("empId");
					
						String ename = rs.getString("empName");
						String city = rs.getString("city");
						double salary = rs.getDouble("salary");
						
						
						Employee emp1 = new Employee(empid, ename, city, salary);

						System.out.println("\t " +empid+ "\t " +ename+"\t " +city + "\t" +salary);
						
						//listEmp.add(emp1);
					}
				
					return emp;
				
			} 
		 
		  catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		
		
		
	
	public Employee saveEmployee(Employee emp) throws SQLException, ClassNotFoundException {
		
		 try {
			 
			  
			 Connection con = (Connection) DBConnect.getConnection();

						
				PreparedStatement stmt = con.prepareStatement(EmployeeCRUDOPs.SAVE_EMPLOYEE);
				stmt.setInt(1, emp.getEmpId());
				stmt.setString(2, emp.getEmpName());
				stmt.setString(3, emp.getCity());
				stmt.setDouble(4, emp.getSalary());
				
				int r = stmt.executeUpdate();
				
				System.out.println(r + " rows inserted");
		
		 }
		 
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		 
		return null;
		 
	} 
	
	
	public Employee updateEmployee(Employee emp) {
		
		//find the emp
		//int eid = 109;
		//String name ="Abhishek";
		
		//update 
		
		   try {

			   Connection con = (Connection) DBConnect.getConnection();

				
				PreparedStatement stmt = con.prepareStatement(EmployeeCRUDOPs.UPDATE_EMPLOYEE );
				
				stmt.setString(1, emp.getEmpName());
				stmt.setString(2, emp.getCity());
				stmt.setDouble(3, emp.getSalary());
				stmt.setInt(4, emp.getEmpId());
				
				int s = stmt.executeUpdate();
				System.out.println(s + " rows updated");
				
				
				
			} 
		   
		 //return updated emp
		  
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		
		
		

		
		return null;
	}
	
	
	public Employee deleteEmployee(int id) {
		//find emp
		
		//delete 
		//return deleted emp
		
		  try {

			  Connection con = (Connection) DBConnect.getConnection();
			  
				PreparedStatement stmt = con.prepareStatement(EmployeeCRUDOPs.DELETE_EMPLOYEE);
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





public static List<Employee> getAllEmployees(){
	
      try{
    	  
    	  Connection con = (Connection) DBConnect.getConnection();

		
		PreparedStatement stmt = con.prepareStatement(EmployeeCRUDOPs.GET_ALL_EMPLOYEES);
		
		ResultSet rs  = stmt.executeQuery();
		
		List<Employee> listEmp = new ArrayList<>();
		
			while(rs.next()) {
				
				//int empid = rs.getInt("empId");
				int empid = rs.getInt(1);
				String ename = rs.getString("empName");
				String city = rs.getString("city");
				double salary = rs.getDouble("salary");
				
				Employee emp1 = new Employee(empid, ename, city, salary);
				
				listEmp.add(emp1);
			}
		
			return (List<Employee>) listEmp;
		
	   } 
  
          catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	         	return null;
	         }
    
 
           }


}


