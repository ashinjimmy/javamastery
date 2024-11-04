package com.mastery.javabasics;

import java.util.Arrays;

public class DataArrays {

	public static void printSingleDimensionalArray() {

		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		System.out.println("-------------Method 1-----------------------");
		System.out.println(Arrays.toString(days)); // method 1 to print array
		System.out.println();

		System.out.println("-------------Method 2-----------------------");
		for (int i = 0; i < days.length; i++) {
			System.out.println(days[i]); // method 2 to print the array
		}
		System.out.println("-------------Method 3-----------------------");
		for (String day : days) {
			System.out.println(day); // method 3 to print the array
		}

	}

	public void printTwoDimensionalArray() {

		int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("-------------Method 1-----------------------");
		System.out.println(Arrays.deepToString(numbers)); // method 1 to print array
		System.out.println();

		System.out.println("-------------Method 2-----------------------");
		for (int i = 0; i < numbers.length; i++) {
			// System.out.println(Arrays.toString(numbers[i])); // print the rows
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " "); // print elements
			}
			System.out.println();
		}

		System.out.println("-------------Method 3-----------------------");
		for (int[] row : numbers) {
			for (int element : row) {
				System.out.print(element + " "); // print elements
			}
			System.out.println();
		}

	}
	
	
	public static void sortArray(int[] array) {
		System.out.println("Unsorted Array -- "+Arrays.toString(array)); //[100, 30, 450, 25, 60]
		Arrays.sort(array);
		System.out.println("Sorted Array -- "+Arrays.toString(array)); //[25, 30, 60, 100, 450]
		
		System.out.println("--- BINARY SEARCH TO LOCATE THE INDEX ---");
		int index =  Arrays.binarySearch(array, 100); 
		System.out.println("Index -- "+index); // 3
	}

}
