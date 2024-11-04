package com.mastery.javabasics;

import java.util.Arrays;

/**
 * A class that demonstrates operations on single-dimensional and two-dimensional arrays.
 */
public class DataArrays {

    /**
     * Prints elements of a single-dimensional array using various methods.
     */
    public static void printSingleDimensionalArray() {
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        System.out.println("------------- Method 1: Using Arrays.toString() -----------------------");
        System.out.println(Arrays.toString(days));
        System.out.println();

        System.out.println("------------- Method 2: Using traditional for loop -----------------------");
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        System.out.println("------------- Method 3: Using enhanced for loop -----------------------");
        for (String day : days) {
            System.out.println(day);
        }
    }

    /**
     * Prints elements of a two-dimensional array using various methods.
     */
    public void printTwoDimensionalArray() {
        int[][] numbers = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        System.out.println("------------- Method 1: Using Arrays.deepToString() -----------------------");
        System.out.println(Arrays.deepToString(numbers));
        System.out.println();

        System.out.println("------------- Method 2: Using traditional for loop -----------------------");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------- Method 3: Using enhanced for loop -----------------------");
        for (int[] row : numbers) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    /**
     * Sorts an array and demonstrates binary search to find an element's index.
     *
     * @param array the array to be sorted and searched
     */
    public static void sortAndSearchArray(int[] array) {
        System.out.println("Unsorted Array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));

        System.out.println("--- BINARY SEARCH TO LOCATE THE INDEX ---");
        int searchElement = 100; // Define the element to search for
        int index = Arrays.binarySearch(array, searchElement);
        System.out.println("Index of " + searchElement + ": " + index);
    }

    /**
     * Finds and prints the maximum and minimum values in an integer array.
     *
     * @param intArray the array to be analyzed
     */
    public void printMaxAndMinElements(int[] intArray) {
        int maxValue = Arrays.stream(intArray).max().orElseThrow(() -> new IllegalArgumentException("Array is empty"));
        int minValue = Arrays.stream(intArray).min().orElseThrow(() -> new IllegalArgumentException("Array is empty"));

        System.out.println("Maximum value: " + maxValue);
        System.out.println("Minimum value: " + minValue);
    }
}
