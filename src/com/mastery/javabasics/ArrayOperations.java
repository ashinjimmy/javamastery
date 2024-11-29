package com.mastery.javabasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayOperations {

	public void evenOrOdd() {
		List<Integer> integerArray = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();

		for (int num : integerArray) {
			if (num % 2 == 0) {
				evenList.add(num);
			} else {
				oddList.add(num);
			}
		}

		System.out.println(evenList);
		System.out.println(oddList);
	}

	public static void removeDuplicates() {
		int[] intArray = { 1, 2, 3, 4, 4, 5, 3, 2 };
		System.out.println(Arrays.toString(intArray));
		int[] uniqueArray = Arrays.stream(intArray).distinct().toArray();
		System.out.println(Arrays.toString(uniqueArray));

	}

	public static void removeDuplicates2() {
		int[] intArray = { 1, 2, 3, 4, 4, 5, 3, 2 };
		System.out.println(Arrays.toString(intArray));

		Set<Integer> uniqueSet = new HashSet<>();

		for (int num : intArray) {
			uniqueSet.add(num);
		}

		System.out.println("Unique set -- " + uniqueSet);
		int[] uniqueArray = new int[uniqueSet.size()];
		int index = 0;
		for (int num : uniqueSet) {
			uniqueArray[index++] = num;
		}
		System.out.println(Arrays.toString(uniqueArray));
	}

	public static void printDuplicateElements() {

		int[] duplicateArray = { 1, 2, 3, 4, 4, 4, 4, 5 };
		Set<Integer> set = new HashSet<>();

		System.out.println(Arrays.toString(duplicateArray));
		for (int i = 0; i < duplicateArray.length; i++) {
			for (int j = i + 1; j < duplicateArray.length; j++) {
				if (duplicateArray[i] == duplicateArray[j]) {
					set.add(duplicateArray[i]);
				}
			}
		}
		System.out.println("duplicate value -- " + set);
	}

	public static void printDuplicateElements2() {

		int[] duplicateArray = { 1, 2, 3, 4, 4, 4, 4, 5 };
		Set<Integer> checkSet = new HashSet<>();
		Set<Integer> duplicateSet = new HashSet<>();

		for (int num : duplicateArray) {
			if (!checkSet.add(num)) {
				duplicateSet.add(num);
			}
		}

		System.out.println("duplicate value -- " + duplicateSet);
	}

	public void printSecondLargestNumber() {
		int[] intArr = { 12, 89, 35, 100, 100, 75, 15, 24, 31, 45, 56, 75, 89 };
		System.out.println(Arrays.toString(intArr));
		Arrays.sort(intArr);
		// Step 2: Find the largest unique number, then move to the previous unique
		// number
		int largest = intArr[intArr.length - 1];
		int s = 0;
		// Start from the second last element and find the first unique number that is
		// less than the largest
		for (int i = intArr.length - 2; i >= 0; i--) {
			if (intArr[i] < largest) {
				// Found the second largest
				s = intArr[i];
				break;
			}
		}
		System.out.println(s);
	}

	public static void commonElement() {
		int[] c1 = { 1, 2, 3, 4, 5 };
		int[] c2 = { 10, 2, 4, 6, 7 };
		HashSet<Integer> c3 = new HashSet<>();

		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c2.length; j++) {
				if (c1[i] == c2[j]) {
					c3.add(c1[i]);
				}
			}
		}
		System.out.println(c3);
		int[] c4 = new int[c3.size()];
		int index = 0;
		for (int val : c3) {
			c4[index++] = val;
		}
		System.out.println(Arrays.toString(c4));

	}

	public void mostFrquentElements() {
		int[] elements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 4, 4, 4, 5, 5, 3 };

		HashMap<Integer, Integer> map = new HashMap<>();
		int mostFreqElement = elements[0];
		int maxCount = 0;

		for (int num : elements) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
		
	    for(int key: map.keySet()) {
	    	int count = map.get(key);
	    	if(count > maxCount) {
	    		mostFreqElement = key;
	    		maxCount = count;
	    	}
	    }	
	    System.out.println(" ---"+map);
	    System.out.println(" ---"+maxCount);
	}

}
