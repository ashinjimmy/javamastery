package com.java.interview.integer;

public class FizzBuzz {

	public static void main(String[] args) {
		int range = 20;
		for (int i = 0; i < range; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz & value is "+i);
			} else if (i % 3 == 0) {
				System.out.println("Fizz & value is "+i);
			} else if (i % 5 == 0) {
				System.out.println("Buzz & value is "+i);
			} else {
				System.out.println("Not divisible");
			}
		}
	}

}
