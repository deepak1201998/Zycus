package utils;

public class EmployeeCRUDOPs {

	
	public static final String GET_ALL_EMPLOYEES = "SELECT * FROM employee";
	
	public static final String GET_EMPLOYEE = "select * from employee where empId =?";
	
	public static final String SAVE_EMPLOYEE = "insert into employee values(?,?,?,?)";
	
	public static final String UPDATE_EMPLOYEE = "update employee set empName = '?',city ='?',salary ='?'  where empId = ?";
	
	public static final String DELETE_EMPLOYEE = "delete from employee where empId =?";
}
