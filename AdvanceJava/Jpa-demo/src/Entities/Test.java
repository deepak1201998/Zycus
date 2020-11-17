package Entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Jpa-demo");
		
		EntityManager manager = factory.createEntityManager();
		
		Employee emp = new Employee("Manohar", "mumbai",  2000.00);
		
		
		EntityTransaction tx = manager.getTransaction();
		
		 tx.begin();
	       manager.persist(emp);  //it insert the data into emp_db (employee table)
	     tx.commit();
		
		Employee e1 = manager.find(Employee.class, 3L);  //perform select operation
		
		//System.out.println(e1);
		
	      tx.begin();		
	       e1.setCity("chicago");
		    tx.commit();
		
		    System.out.println(e1);
		    
	//	tx.begin();
	//	manager.remove(e1);
	//	tx.commit();
	    }
	}


