package com.java.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class LargestSubstring {

	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(findLargestSubString(s));
	}

	private static String findLargestSubString(String s) {

//		Sliding window method

		int start = 0, maxLength = 0, maxStart = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int end = 0; end < s.length(); end++) {
			char c = s.charAt(end);
			if (map.containsKey(c) && map.get(c) >= start) {
				start = map.get(c) + 1; // shifting the start index position of the window
			}
			map.put(c, end);

			if (end - start + 1 > maxLength) {
				maxLength = Math.max(maxLength, end - start + 1);
				maxStart = start;
			}

		}

		return "The largest substring is " + s.substring(maxStart, maxStart + maxLength) + " and its length is "
				+ maxLength;

	}

}
