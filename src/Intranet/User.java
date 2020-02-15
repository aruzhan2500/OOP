package Intranet;

import java.io.Serializable;

public abstract class User implements Comparable<Object>, Serializable {
	
	public String lastName;
	public String firstName;
	public String login;
	public String password;
	
	public String kind;//kind of User
	
	public User(String lastName, String firstName, String kind) {
		this.lastName = lastName;
		this.firstName = firstName;
		setLogin();
		this.login = getLogin();
		this.password = "12345678";
		this.kind = kind;
	}
	
	public String getName() {
	    return this.lastName + " " + this.firstName;
	}
	public void setLogin() {
		this.login = this.firstName.substring(0, 1).toLowerCase() + "_" + this.lastName.toLowerCase();
	}
	public String getLogin() {
		return this.login;
	}
	
	public String toString() {
	    return "Full name: " + getName();
	}
	
	public boolean changePassword(String oldPassword, String newPassword) {
		if (oldPassword.equals(this.password)){
			this.password = newPassword;
			return true;
		}
		else return false;
	}

}
