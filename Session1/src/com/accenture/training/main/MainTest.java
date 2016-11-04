package com.accenture.training.main;

import com.accenture.training.domain.SubTest;
import com.accenture.training.domain.Test;
import com.accenture.training.domain.TestArray;
import com.accenture.training.interfaces.TestInterface;

public class MainTest {

	public static void main(String[] args){
		System.out.println("Hello Class!");
		//Test test1 = new Test();		
		//Test test2 = new Test(2);
		//test1.increase(1);
		//test2.increase(1);
		//System.out.println(test1.getValue());
		//System.out.println(test2.getValue());
		//=========================
		//SubTest subTest = new SubTest(5); //Starts with 5
		//subTest.decrease(); //Goes to 0
		//subTest.increase(2); //Up to 4
		//((Test)subTest).increase(2); // Up to ?
		//subTest.multiplyByTwo(); //5*2=10
		//System.out.println(subTest.getValue());
		//=================================
		//TestInterface testInterface = new SubTest(5);//createTestInterface();
		//testInterface.show();
		//((SubTest)testInterface).increase(2);
		//testInterface.multiplyByTwo();
		//System.out.println(testInterface.show());
		TestInterface testInterface = createTestInterface();
		testInterface.multiplyByTwo();
		System.out.println(testInterface.show());
		//=========================
		SubTest myTest = new SubTest(15);
		myTest.increase(null);
	}
	
	public static TestInterface createTestInterface(){
		//return new SubTest(5);
		return new TestArray(10);
	}
}