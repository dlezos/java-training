package com.accenture.training.domain;

import com.accenture.training.interfaces.TestInterface;

public class TestArray implements TestInterface {
	Integer[] array;
	
	public TestArray(int size){
		array = new Integer[size];
		/*
		 * array[0] = null;
		 * array[1] = null;
		 * ...
		 */
		for(int i=0; i<array.length; i++){
			array[i] = new Integer(i);
		}
	}

	@Override
	public void multiplyByTwo() {
		for(int i=0; i<array.length; i++){
			array[i] = array[i]*2;
		}
	}

	@Override
	public String show() {
		String retValue = "";
		for(int i=0; i<array.length; i++){
			retValue = retValue+array[i].toString()+", ";
		}
		return retValue;
	}
}
