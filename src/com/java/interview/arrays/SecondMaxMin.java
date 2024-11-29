package com.java.interview.arrays;
public class SecondMaxMin {
    public static void main(String[] args) {
        int[] numbers = {10,5,1,2,3,4,5,6,7,8,9,23};

        // Call the method to find second max and min
        findSecondMaxAndMin(numbers);
    }

    public static void findSecondMaxAndMin(int[] intArray) {
        // Check if the array has at least 2 elements
        if (intArray == null || intArray.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        // Initialize max, secondMax, min, and secondMin using the first element
        int max = intArray[0];
        int secondMax = intArray[0];
        int min = intArray[0];
        int secondMin = intArray[0];

        // First pass to find the max and min
        for (int num : intArray) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // Second pass to find second max and second min
        for (int num : intArray) {
            if (num > secondMax && num < max) {
                secondMax = num; // Second largest is smaller than max but larger than others
            }
            if (num < secondMin && num > min) {
                secondMin = num; // Second smallest is larger than min but smaller than others
            }
        }

        // Handle cases where there are no distinct second max or min
        if (max == secondMax) {
            System.out.println("No distinct second maximum value.");
        } else {
            System.out.println("Second Maximum value: " + secondMax);
        }

        if (min == secondMin) {
            System.out.println("No distinct second minimum value.");
        } else {
            System.out.println("Second Minimum value: " + secondMin);
        }
    }
}
