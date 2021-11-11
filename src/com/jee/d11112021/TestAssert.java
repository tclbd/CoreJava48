package com.jee.d11112021;

public class TestAssert{
public static void main(String[] args) {
	int x=0;
	//assert(x>0);							//1. simple form
	assert(x>0):"Assertion Error Caught"; //2. augmented form
	System.out.println("Everything ok ");
	}
}

//javac TestAssert.java
//java -ea TestAssert