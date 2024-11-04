package com.mastery.javabasics;

/**
 * Main class to demonstrate the functionality of the DataArrays class.
 */
public class MainClass {

    public static void main(String[] args) {
        // Demonstrate single-dimensional array printing
        DataArrays.printSingleDimensionalArray();

        // Create an instance of DataArrays to demonstrate two-dimensional array printing
        DataArrays dataArrays = new DataArrays();
        dataArrays.printTwoDimensionalArray();

        // Define an integer array for sorting and searching
        int[] intArray = { 100, 30, 450, 25, 60 };

        // Sort the array and perform binary search
        DataArrays.sortAndSearchArray(intArray);

        // Print maximum and minimum values from the integer array
        dataArrays.printMaxAndMinElements(intArray);
    }
}
