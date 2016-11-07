package com.accenture.training.domain;

public class Player extends Object {
	
	protected String firstName = null;
	protected String lastName = null;
	
	public Player(String firstName, String lastName){
		firstName = new String(firstName);
		lastName = new String(lastName);
	}
	
	public String getfisrtName(){
		return firstName;
	}
	
	public String getlastName(){
		return lastName;
	}

}