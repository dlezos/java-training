package com.accenture.training.domain;

public class Player extends Object {
	
	protected String firstName = null;
	protected String lastName = null;
	
	public Player(String firstName, String lastName){
		this.firstName = new String(firstName);
		this.lastName = new String(lastName);
	}
	
	public String getfirstName(){
		return firstName;
	}
	
	public String getlastName(){
		return lastName;
	}

}