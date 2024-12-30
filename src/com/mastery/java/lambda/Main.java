package com.mastery.java.lambda;

import java.util.function.Consumer;
import java.util.function.Function;

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
		
		
		Function<Integer, Boolean> functionInterface = (n) -> {return (n%2==0)?true:false;};
		System.out.println("The result is -- "+functionInterface.apply(64));
		
		
		Function<String, String> upperCaseFunction2 = (n) -> {return n.toUpperCase();};
		System.out.println("The converted word -- "+upperCaseFunction2.apply("Ashin"));
		
		Function<String, String> upperCaseFunction1 = (n) -> {return n.toUpperCase();};
		System.out.println("The converted word -- "+upperCaseFunction1.apply("Amanta"));
		
		Consumer<String> messageConsumer = (a)-> {System.out.println(a);};
		messageConsumer.accept("Message from the consumer !!!!");
		
	}
}