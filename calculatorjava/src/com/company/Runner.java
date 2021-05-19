package com.company;

// Class has a scope
public class Runner {

	// Member - attributes
	public static int id;
	public static String msg = "Hello World";
	
	// Member - Method has a scope
	public static void main(String[] args) {
		double result;

		result = Calculator.add(2.5, 2.6);

		System.out.println(result);
	}

}