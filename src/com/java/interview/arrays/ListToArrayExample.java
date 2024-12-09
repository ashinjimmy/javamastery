package com.java.interview.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");

        // Convert list to array
        String[] array = list.toArray(new String[list.size()]);

        System.out.println("Array: " + Arrays.toString(array));

        // Modifying the array does not affect the list
        array[0] = "A";
        System.out.println("Modified Array: " + Arrays.toString(array));
        System.out.println("Original List: " + list);
    }
}
