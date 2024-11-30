package com.java.interview.stringOp;

import java.util.HashMap;

public class CountVowelsConsonants {
	
	public static void main(String[] args) {
		
		String input = "I despirately want a job which is relevant to my Studies and Experiences!!.";
		
		countVowelsConsonants(input);
		
	}

	private static void countVowelsConsonants(String inputData) {
		
		HashMap<Character, Integer> vowelsMap =  new HashMap<>();
		HashMap<Character, Integer> consonantsMap =  new HashMap<>();
		String vowels = "aeiouAEIOU";
		char[] word = inputData.replaceAll("[^A-Za-z]","").toCharArray();
		
		for(int i=0; i<word.length; i++) {
			if(vowels.indexOf(word[i]) == -1) {
				consonantsMap.put(word[i], consonantsMap.getOrDefault(word[i], 0)+1);
			} else {
				vowelsMap.put(word[i], vowelsMap.getOrDefault(word[i], 0)+1);
			}
		}
		
		System.out.println(" Vowels frequency -- "+vowelsMap);
		System.out.println(" Consonant frequency -- "+consonantsMap);
	}
	
}
