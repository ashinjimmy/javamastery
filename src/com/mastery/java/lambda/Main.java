package com.mastery.java.lambda;

/**
 * Main class to demonstrate the use of a lambda expression with the Calculator
 * interface.
 */
public class Main {

	public static void main(String[] args) {
		// Lambda expression to implement the add method of the Calculator interface
		Calculator calculator = (a, b) -> a + b;

		// Performing the addition and displaying the result
		int result = calculator.add(10, 45);
		System.out.println("The sum is: " + result);
	}
}