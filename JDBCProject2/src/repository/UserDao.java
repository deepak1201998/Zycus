package repository;

import java.util.List;

import model.User;



public interface UserDao {

	
	 public List<User> getAllUsers();
	 public User getUser(int id);
	 public User createUser(User u);
	 public User updateUser(User u);
	 
	  public User deleteUser(int id);
	 
}
