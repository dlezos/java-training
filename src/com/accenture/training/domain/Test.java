package com.accenture.training.domain;

public class Test extends Object {
	
	protected Integer value = null;
	
//	private Integer valuePrivate;
//	protected Integer valueProtected;
//	public Integer valuePublic;
	
	public Test(){
		value = new Integer(0);
		value = 0;
	}
	
	public Test(int initial){
		value = initial;
	}
	
	public Integer getValue(){
		return value;
	}
	
	public void increase(Integer i){
		System.out.println("Test.increase()");
		if(i == null){
			value = 0;
		} else {
			value = value+i;
		}
	}
}