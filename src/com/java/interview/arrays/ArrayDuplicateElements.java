package com.java.interview.arrays;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicateElements {
	
	public static void printDuplicateElements() {

		int[] duplicateArray = { 1, 2, 3, 4, 4, 4, 4, 5 };
		Set<Integer> checkSet = new HashSet<>();
		Set<Integer> duplicateSet = new HashSet<>();

		for (int num : duplicateArray) {
			if (!checkSet.add(num)) {
				duplicateSet.add(num);
			}
		}

		System.out.println("duplicate value -- " + duplicateSet);
		if(!duplicateSet.isEmpty()) {
			System.out.println("Array contains duplicate elements  !!");
		} else {
			System.out.println("Array doesn't contain duplicates !!");
		}
	}
	
	public static void main(String[] args) {
		printDuplicateElements();
	}

}
