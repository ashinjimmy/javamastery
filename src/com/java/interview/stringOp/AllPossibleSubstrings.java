package com.java.interview.stringOp;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleSubstrings {

	public static void main(String[] args) {
		String input = "Amenta+Ashin";
		allPossibleSubstrings(input);
	}

	private static void allPossibleSubstrings(String input) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j <= input.length(); j++) {
				list.add(input.substring(i, j));
			}
		}

		System.out.println(list);
		System.out.println(list.size());
	}

}
