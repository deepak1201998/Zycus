import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBDao {
	
	List<Employee> empList = new ArrayList<Employee>();
	
	
	public  List<Employee> getEmployee(int uid) {
		
		
		 try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "abc@123")) {
			 Employee emp = null ;

				Class.forName("com.mysql.cj.jdbc.Driver");

				String sql = "select * from employee where empId =?";
						
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setInt(1, uid);
				
				
				ResultSet rs  = stmt.executeQuery();
				
				
				
					while(rs.next()) {
						int empid = rs.getInt("empId");
					
						String ename = rs.getString("empName");
						String city = rs.getString("city");
						double salary = rs.getDouble("salary");
						
						
						Employee emp1 = new Employee(empid, ename, city, salary);

						System.out.println("\t " +empid+ "\t " +ename+"\t " +city + "\t" +salary);
						empList.add(emp1);
						
						
					}
				
					
				
			} 
		 catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		 
		 return empList;
		}
		
		
		
	
	public Employee saveEmployee(Employee emp) throws SQLException, ClassNotFoundException {
		
		 try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "abc@123")) {

				Class.forName("com.mysql.cj.jdbc.Driver");

				String sql = "insert into employee(empId,empName,city, salary) values(?,?,?,?)";
						
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setInt(1, emp.getEmpId());
				stmt.setString(2, emp.getEmpName());
				stmt.setString(3, emp.getCity());
				stmt.setDouble(4, emp.getSalary());
				
				int r = stmt.executeUpdate();
				if(r>0) {
				
				System.out.println(r + " rows inserted");
				}
		
		 }
		 
		  catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		 
		
		 return emp;
		 
	} 
	
	
	public Employee updateEmployee(Employee emp) {
		
		//find the emp
		//int eid = 109;
		//String name ="Abhishek";
		
		//update 
		
		   try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "abc@123")) {

				Class.forName("com.mysql.cj.jdbc.Driver");

				String sql = "update employee set empName = ?, city =?, salary = ?  where empId = ?";
						
				PreparedStatement stmt = con.prepareStatement(sql);
				
				stmt.setString(1, emp.getEmpName());
				stmt.setString(2, emp.getCity());
				stmt.setDouble(3, emp.getSalary());
				stmt.setInt(4, emp.getEmpId());
				
				int s = stmt.executeUpdate();
				if(s>0) {
				System.out.println(s + " rows updated");
				
				}
				
			} 
		   
		 //return updated emp
		   catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		
		
		

		
		return emp;
	}
	
	public Employee deleteEmployee(int id) {
		//find emp
		
		//delete 
		//return deleted emp
		
		  try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "abc@123")) {

				Class.forName("com.mysql.cj.jdbc.Driver");

				String sql = "delete from employee where empId =?";
						
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setInt(1, id);
				
				int rs  = stmt.executeUpdate();
				if(rs>0) {
				   System.out.println("Employee id is deleted " +id);
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		
		
		return null;
	}





public  List<Employee> getAllEmployees(){
	
  try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "abc@123")) {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String sql = "SELECT * FROM employee";
				
		PreparedStatement stmt = con.prepareStatement(sql);
		
		ResultSet rs  = stmt.executeQuery();
		
		
		
			while(rs.next()) {
				
				//int empid = rs.getInt("empId");
				int empid = rs.getInt(1);
				String ename = rs.getString("empName");
				String city = rs.getString("city");
				double salary = rs.getDouble("salary");
				
				Employee emp1 = new Employee(empid, ename, city, salary);
				
				empList.add(emp1);
			}
		
			
		
	     }  
  
       catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	       } 
  
        catch (SQLException e) {
		  // TODO Auto-generated catch block
	         	e.printStackTrace();
		     return null;
	           }
  
return empList;
  
  
   }
}

