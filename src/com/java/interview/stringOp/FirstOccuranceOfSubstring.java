package com.java.interview.stringOp;

import java.util.ArrayList;
import java.util.List;

public class FirstOccuranceOfSubstring {

	public static void main(String[] args) {

		String inputData = "This is my test data. This test data"
				+ " is determined to test my knowledge in string manipulation";
		String subString = "test";

		findFirstOccurance(inputData, subString);

	}

	private static void findFirstOccurance(String inputData, String subString) {
		
		int index = inputData.indexOf(subString);
		List<Integer> list = new ArrayList<>();
		while(index != -1) {
			list.add(index);
			index = inputData.indexOf(subString, index+1);
		}

		System.out.println(list);
	}

}
