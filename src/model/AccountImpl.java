package model;

import interfaces.Account;
import interfaces.User;

public class AccountImpl implements Account {
	private String username;
	private String password;
	private User user;
	private int id;
	
	public AccountImpl(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public AccountImpl(String username, String password, int id) {
		this.username = username;
		this.password = password;
		this.id = id;
	}
	
	public AccountImpl(String username, String password, User user, int id) {
		this.username = username;
		this.password = password;
		this.user = user;
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public User getUser() {
		return user;
	}
	
	@Override
	public int getId() {
		return this.id;
	}
	
	public String toString() {
		return "Account ID: "+this.id+"\n"+
			   "User Data:\n"+user.toString();
	}
	
	public boolean equals(Object o) {
		return this.username.equals(((Account)o).getUsername()) &&
			   this.password.equals(((Account)o).getPassword());
	}
}
