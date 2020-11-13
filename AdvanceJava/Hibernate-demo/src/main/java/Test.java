import com.Entities.Employee;
import com.dao.EmployeeDAO;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		EmployeeDAO employeeDAO = new EmployeeDAO();
	   //  Employee emp = new Employee ("deepak", "Pune", 2000.00);
       
	   // employeeDAO.saveEmployee(emp);
	    
	    
	       
	    Employee e = employeeDAO.getEmployee(6L);
	    System.out.println(e);
	    
		//Employee e1 = new Employee (3L, "Sumit", "chennai", 5000.00);
	    //employeeDAO.updateEmployee(e1);
		//System.out.println(update);
		
	    
		//Employee e2 = new Employee ( 4L, "Manohar", "banglore", 5000.00);
	    //employeeDAO.deleteEmployee(e2);
		
		
		
		
		
		
	}

}
