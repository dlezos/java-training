package com.accenture.training.domain;

import com.accenture.training.domain.Test;
import com.accenture.training.interfaces.TestInterface;

public class SubTest extends Test implements TestInterface {
	
	public SubTest(int initial){
		super(initial);
	}
	
	/**
	 * 
	 */
	//@Override
	public void increase(int i){
		System.out.println("SubTest.increase()");
		value = value+(i*2);
	}
	
	public void decrease(){
		value = value-1;
	}
	
	public void multiplyByTwo(){
		value = value*2;
	}
	
	public String show(){
		return value.toString();
	}
}