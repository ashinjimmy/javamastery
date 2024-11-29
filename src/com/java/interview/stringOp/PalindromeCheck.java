package com.java.interview.stringOp;

import java.util.Stack;

public class PalindromeCheck {
	
	public static void main(String[] args) {
		
		String word = "MalAyalam";
		if(checkPalindrome(word)) {
			System.out.println(word+" is a Palindrome");
		} else {
			System.out.println(word+" is not a Palindrome");
		}
		
	}

	private static boolean checkPalindrome(String word) {

		Stack<Character> stack = new Stack<>(); // LIFO
		for(char alpha: word.toLowerCase().toCharArray()) {
			stack.push(alpha);
		}
		
		for(char alpha: word.toLowerCase().toCharArray()) {
			if(alpha != stack.pop()) {
				return false;
			}
			
		}
		
		return true;
	}

}
