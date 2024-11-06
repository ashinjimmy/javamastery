package com.mastery.javabasics;

/**
 * Main class to demonstrate the functionality of the DataArrays class.
 */
public class MainClass {

    public static void main(String[] args) {
        // Demonstrate single-dimensional array printing
        //DataArrays.printSingleDimensionalArray();

        // Create an instance of DataArrays to demonstrate two-dimensional array printing
        DataArrays dataArrays = new DataArrays();
       // dataArrays.printTwoDimensionalArray();

        // Define an integer array for sorting and searching
        int[] intArray = { 100, 30, 450, 25, 60 };

        // Sort the array and perform binary search
        //DataArrays.sortAndSearchArray(intArray);

        // Print maximum and minimum values from the integer array
        //dataArrays.printMaxAndMinElements(intArray);
        
        // Intersection of two array
        int[] ar1 = { 10, 30, 45, 25, 60 };
        int[] ar2 = { 100, 45, 73, 35, 60 };
        //DataArrays.inetersectionOfArrays(ar1, ar2);
        
        
        int[] s1 = {10,2,6,9,4,5};
        int[] s2 = {2,6,1,8,7,11};
        int[] s3 = {20,12,26,59,54,45};
        int[] s4 = {22,63,14,82,72,11};
        DataArrays.unionOfMultipleArrays(s1,s2,s3,s4);

    }
}
