package sevices;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import Bo.Employee;
import dao.DBDao;

public class EmployeeService {
	
	Scanner sc = new Scanner(System.in);
	
	DBDao da = new DBDao();
	
	public EmployeeService(DBDao da) {
		this.da = da;
	}
	
	
	public List<Employee> getAllEmployees(){
		//get all employees using da
		List<Employee> list =  da.getAllEmployees();
		//may perform some manipulation
		
		return list;
	}
	
	public Employee getEmployee(int id) {
		//get  employee using da
		   System.out.println("Enter the id to fetch particular row : ");
			int uid = sc.nextInt();
		   Employee emp = da.getEmployee(uid);
		
		
		//may perform some manipulation
				
		return null;
	}
	
	
	public Employee saveEmployee(Employee emp) throws ClassNotFoundException, SQLException {
		
		return emp;
		

			
	
	}

	
	
}