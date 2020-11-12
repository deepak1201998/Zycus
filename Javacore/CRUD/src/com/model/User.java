package com.model;

public class User {
	
	
	private  int userid;
	private String email;
	private String fullname;
	private String password;
	
	
	public User() {
		super();
	}
	
	
	public User(int userid,String email, String fullname, String password) {
		super();
		this.userid = userid;
		this.email = email;
		this.fullname = fullname;
		this.password = password;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	public int getUserid() {
		return userid;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "UserId =" + userid + "Email =" + email + " Fullname =" + fullname +  " Password =" + password;
	}


	
	

}
