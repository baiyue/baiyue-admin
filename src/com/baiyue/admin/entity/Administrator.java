package com.baiyue.admin.entity;


public class Administrator {
	private String username;
	private String password;
	/*private Privilege privilege;*/
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
/*	public Privilege getPrivilege() {
		return privilege;
	}
	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}*/
	@Override
	public String toString(){
		return this.username+":"+this.password;
	}
}
