package com.data.DTO;

public class UserLoginDto {
	
	private String userEmail;
    private String userPassword;
    
	private UserLoginDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	private UserLoginDto(String userEmail, String userPassword) {
		super();
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
    
    

}
