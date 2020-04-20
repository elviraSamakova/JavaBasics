package com.syntax.class26;

public class Registration {
	
	private String email;
	private String userName;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	
	
	public void setEmail(String email) {
		
		if(!email.isEmpty()) {
			if(email.contains("yahoo")) {
				this.email=email;
			}else {
				System.out.println("Email must be of yahoo type");
			}
			
		}else {
			System.out.println("Email cannot be empty");
		}
}
	
	
	public void setUserName(String userName) {
		if(!userName.isEmpty() && userName.length()>6) {
			this.userName=userName;
		}
	}
	public void setPassword(String password) {
		if(!password.isEmpty() && password.length()>6 && !password.contains(userName)) {
			this.password=password;
		}
	}
	}