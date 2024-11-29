package com.java.interview.integer;

public class FibnocciSeries {

	public static void main(String[] args) {
		int range = 10;
		try {
			printFinocciSeries(range);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Clean code !!");
		}
	}

	private static void printFinocciSeries(int range) {
		int first = 0, second = 1;
		System.out.print("Fibonacci Series: ");
		for (int i = 0; i < range; i++) {
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}

	}

}
