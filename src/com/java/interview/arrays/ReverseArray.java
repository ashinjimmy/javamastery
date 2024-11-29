package com.java.interview.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		String[] tech = { "Python", "SQL", "C#", ".Net", "COBOL", "R", "Scala", "JavaScript", "Java" };
		// System.out.println(" Reversed Array using While" +
		// Arrays.toString(reverseArrayWhile(tech)));
		System.out.println(" Reversed Array using For" + Arrays.toString(reverseArrayFor(tech)));

	}

	public static String[] reverseArrayWhile(String[] arr) {

		System.out.println("Default Array -- " + Arrays.toString(arr));
// [Python, C#, .Net, JavaScript, Java]
		int startPoint = 0;
		int endPoint = arr.length - 1;

		while (startPoint < endPoint) {

			String temp = arr[startPoint];
			arr[startPoint] = arr[endPoint];
			arr[endPoint] = temp;

			startPoint++;
			endPoint--;

		}

		return arr;
	}

	public static String[] reverseArrayFor(String[] arr) {

		System.out.println("Default Array -- " + Arrays.toString(arr));
// Default Array -- [Python, SQL, C#, .Net, COBOL, R, Scala, JavaScript, Java]
		int midPoint = arr.length / 2;
		for (int i = 0; i < midPoint; i++) {
			String temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

		return arr;
	}

}
