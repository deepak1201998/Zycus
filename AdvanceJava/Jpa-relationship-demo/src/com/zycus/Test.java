package com.zycus;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.entities.Author;
import com.entities.Book;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Jpa-relationship-demo");

		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
               
		
	//	Author a1 = new Author("vishal", "shah", "knowledgeBook", LocalDate.of(1998, 03, 12), 22);
		//Author a3 = em.find(Author.class, 1);
	//Book b2 = new Book("Book1", "knowledgeBook", 50.0F, "acmhjj", 100, LocalDate.of(1998, 05, 24), a3);
		
		//one to one
		//tx.begin();
		//em.persist(a2); //inserting an object of author class
		//em.persist(b2);
		//tx.commit();
		
		
		Author a1 = new Author("vishal", "shah", "Mumbai", LocalDate.of(1998, 03, 12), 22);
		Author a2 = new Author("manohar", "shah", "pune", LocalDate.of(1998, 06, 22), 22);
		Author a3 = new Author("deepak", "jaiswar", "Mumbai", LocalDate.of(1998, 07, 25), 22);
		
		Set<Author> set = new HashSet<>();
		set.add(a1);
		set.add(a2);
		set.add(a3);
		
		Book b3 = new Book("Book1", "knowledgeBook", 50.0F, "acmhjj", 100, LocalDate.of(2000, 05, 24), set);
		
		tx.begin();
		em.persist(b3);
		tx.commit();
		
		
		Query query = em.createQuery("SELECT a from Author a WHERE a.bio=:city");
	    query.setParameter("city",  "Mumbai");
	
		List<Author> list = (List<Author>) query.getResultList();
	
		for(Author au : list) {
			System.out.println(au);
		}
		
		
	//TypedQuery<Author> query1 = em.createQuery("SELECT a from Author a WHERE a.bio=:city", Author.class);
  // 	query1.setParameter("city",  "Mumbai");
   		
//		List<Author> list = query.getResultList();

//		for(Author author : list) {
//			System.out.println(author);
//		}
		
		
		TypedQuery<Author> query2 = em.createNamedQuery("findByCity", Author.class);
		query2.setParameter("city",  "Mumbai");
		
		List<Author> list1 = query2.getResultList();
	
		for(Author author : list1) {
			System.out.println(author);
		}
   	
   	
		
	}

		
		
		
		
		
		
		
		

	}


