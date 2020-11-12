package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entities.Employee;


public class EmployeeDAO {
	
private SessionFactory sessionFactory;

	
	public EmployeeDAO() {
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        this.sessionFactory =  cfg.buildSessionFactory();
	}

	private void close() {
		sessionFactory.close();
	}

	public void saveEmployee(Employee emp) {
		
		Session session =  sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		
	}
	
	public Employee getEmployee(Long id) {
		Employee e = null;

		Session session =  sessionFactory.openSession();
		e = session.find(Employee.class, id);
		
		
		return e;
		
	}

	public void updateEmployee(Employee emp) {
		//Employee em= null;
         Session session =  sessionFactory.openSession();
		
		session.beginTransaction();
		session.update(emp);
		session.getTransaction().commit();
		
		
		
	
	}
	
	public void deleteEmployee(Employee emp) {
		Employee em = null;
         Session session =  sessionFactory.openSession();
		
		session.beginTransaction();
		session.delete(emp);
		session.getTransaction().commit();
		
		
	
	}
	
	
}
