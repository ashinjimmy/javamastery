package com.java.interview.stringOp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ShortestWordCount {
	public static void main(String[] args) {

		String input = "Java8&Spring!#@Framework2024 is %$popular?@with Devs, code...and developers!! 99times&more#than$others.\";\r\n"
				+ "Explanation of Components:";

		System.out.println(input);
		String[] words = input.replaceAll("[^a-zA-z\\s]", "").trim().split("\\s");
		ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
		list.removeIf(String::isBlank);
		list.sort(Comparator.comparingInt(String::length));
		System.out.println(list);
	}

}
