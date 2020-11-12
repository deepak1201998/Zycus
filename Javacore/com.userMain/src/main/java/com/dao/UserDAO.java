package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.us.User;

public class UserDAO {

	
	
private SessionFactory sessionFactory;

	
	public UserDAO() {
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        this.sessionFactory =  cfg.buildSessionFactory();
	}

	private void close() {
		sessionFactory.close();
	}

	public   void saveUser(User user) {
		
		Session session =  sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		
	}
	
	public User getUser(int  id) {
		User u = null;

		Session session =  sessionFactory.openSession();
		u = session.find(User.class, id);
		
		
		return u;
		
	}

	public void updateUser(User user) {
		
         Session session =  sessionFactory.openSession();
		
		session.beginTransaction();
		session.update(user);
		session.getTransaction().commit();
		
		
		
	
	}
	
	public void deleteUser(User user) {
	
         Session session =  sessionFactory.openSession();
		
		session.beginTransaction();
		session.delete(user);
		session.getTransaction().commit();
		
		
	
	}
	

}
