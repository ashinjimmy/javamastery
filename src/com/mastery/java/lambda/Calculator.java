package com.mastery.java.lambda;

/**
 * Functional interface representing a Calculator with a single method for
 * addition.
 */
@FunctionalInterface
public interface Calculator {
	int add(int a, int b); // Abstract method for addition
}