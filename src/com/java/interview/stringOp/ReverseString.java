package com.java.interview.stringOp;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String word = "I love my job and passion";
		System.out.println(reverseString(word));
	}

	private static String reverseString(String word) {
		char[] wordArray = word.toLowerCase().trim().toCharArray();
		int start = 0;
		int end = wordArray.length;
		while(start < end) {
			char temp = wordArray[start];
			wordArray[start] = wordArray[end-1];
			wordArray[end-1] = temp;
			start++;
			end--;
		}
		return new String(wordArray);
	}
}
