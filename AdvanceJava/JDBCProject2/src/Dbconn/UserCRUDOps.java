package Dbconn;

public class UserCRUDOps {
	
	

	public static final String GET_ALL_USERS = "SELECT * FROM user";
	
	public static final String GET_USER = "select * from user where userId =?";
	
	public static final String CREATE_USER = "insert into user(userId, userEmail, userFullname, userPassword) values(?,?,?,?)";
	
	public static final String UPDATE_USER = "update user set userEmail = '?', userFullname ='?', userPassword ='?'  where userId = ?";
	
	public static final String DELETE_USER = "delete from user where userId =?";

}
