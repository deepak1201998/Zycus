package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model.User;


public class UserDAO {

	
     Map<Integer,User> customer = new HashMap<>();
	
	
	       public User createUser(User u){
	          	customer.put(User.getUserid(), u);
		          
		          return u;
	               }
	
	        public User updateUser(User u){
	          	
	              	customer.put(User.getUserid(), u);
		        return u;
	              }
	
	         public User deleteUser(int id){
	               	customer.remove(id);
		         return null;
	                }
	
	         public User get(int id) {
	                   	User u1 = customer.get(id);
	                   	System.out.println(u1);
	                   	return u1;
	                  }
	         
	
	          public List<User> getAll(){
	        	  List<User> l = new ArrayList<>();

	      		for (Map.Entry<Integer, User> entry : customer.entrySet())
	      		{
	      			l.add(entry.getValue());
	      			
	      		}
	      		return l;
	           	//return new ArrayList<>(customer.values());
	             }
	
}
