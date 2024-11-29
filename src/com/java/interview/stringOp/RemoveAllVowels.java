package com.java.interview.stringOp;

import java.util.HashMap;

public class RemoveAllVowels {

	public static void main(String[] args) {
		String sent = "Hi I am Ashin Jimmmy, from India !!";
		removeVowles(sent);
	}

	private static void removeVowles(String sent) {
		System.out.println(sent);
		char[] word = sent.trim().toCharArray();

		HashMap<Character, Integer> frqMap = new HashMap<>();
		HashMap<Character, Integer> revFrqMap = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		String vowels = "aeiouAEIOU";
		for (int i = 0; i < word.length; i++) {
			if(word[i] != ' ')
			frqMap.put(word[i], frqMap.getOrDefault(word[i], 0) + 1);

//			if(word[i] != 'a' && word[i] != 'e' && word[i] != 'i' && word[i] != 'o' && word[i] != 'u') {
//				sb.append(word[i]);
//				revFrqMap.put(word[i], revFrqMap.getOrDefault(word[i], 0)+1);
//			}
			if (vowels.indexOf(word[i]) == -1) {
				sb.append(word[i]);
				if(word[i] != ' ')
				revFrqMap.put(word[i], revFrqMap.getOrDefault(word[i], 0) + 1);
			}
		}
		System.out.println(frqMap);
		System.out.println(sb);
		System.out.println(revFrqMap);
	}

}
