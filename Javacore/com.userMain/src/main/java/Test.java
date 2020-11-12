import com.Entities.Employee;
import com.dao.EmployeeDAO;
import com.dao.UserDAO;
import com.us.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		UserDAO userDAO = new UserDAO();
	    User us = new User ("deepakjaiswar120@gmail.com", "deepak", "abc123");
       
	   userDAO.saveUser(us);
	    
	    
	       
	   // User e = userDAO.getUser();
	   // System.out.println(e);
	    
		//User e1 = new User(3L, "Sumit", "chennai", 5000.00);
	    //userDAO.updateUser(e1);
		//System.out.println(update);
		
	    
		//User e2 = new User ( 4L, "Manohar", "banglore", 5000.00);
	    //userDAO.deleteUser(e2);
		
		
	

	}

}
