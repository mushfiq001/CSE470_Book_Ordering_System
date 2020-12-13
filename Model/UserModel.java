package Model;

import java.lang.*;

public class UserModel
{
	 String fullName;
	 String userName;
	 String password;
	
	public UserModel(){}
	public UserModel(String fullName, String userName, String adminPass)
	{
		this.fullName = fullName;
		this.userName = userName;
		this.password = password;
	}
	
	public void setFullname(String fullName){this.fullName = fullName;}
	public void setUserName(String userName){this.userName = userName;}
	public void setPassword(String password){this.password = password;}
	
	public String getFullName() {return fullName;}
	public String getUserName() {return userName;}
	public String getPassword() {return password;}
}