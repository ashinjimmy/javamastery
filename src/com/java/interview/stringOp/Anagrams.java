package com.java.interview.stringOp;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

	public static void main(String[] args) {

		String s1 = "listen", s2 = "silent";

		if (checkAnagrams(s1, s2))
			System.out.println("The data is Anagram");
		else
			System.out.println("The data is not Anagram");
	}

	private static boolean checkAnagrams(String s1, String s2) {

		s1 = s1.replaceAll("\\s+", "").toLowerCase();
		s2 = s2.replaceAll("\\s+", "").toLowerCase();

		if (s1.length() != s2.length()) {
			return false;
		}

		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		map1 = buildMap(s1);
		map2 = buildMap(s2);

		return (map1.equals(map2)) ? true : false;

	}

	private static Map<Character, Integer> buildMap(String data) {
		Map<Character, Integer> map = new HashMap<>();
		for (char c1 : data.toCharArray()) {
			map.put(c1, map.getOrDefault(c1, 0) + 1);
		}

		return map;
	}

}
