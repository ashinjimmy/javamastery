package com.java.interview.stringOp;

import java.util.Arrays;
import java.util.HashMap;

public class WordFrequencyCounter {

	public static void main(String[] args) {

		String sentence = "I Love My Job and I love my passion";
		HashMap<String, Integer> sentenceMap = calculateWordFreq(sentence);
		System.out.println(sentenceMap);

	}

	public static HashMap<String, Integer> calculateWordFreq(String sentence) {
		System.out.println("Input data ---- " + sentence);
		HashMap<String, Integer> map = new HashMap<>();

		if (sentence.isEmpty() && sentence.equals(null)) {
			return map;
		}

		String[] wordArray = sentence.trim().toLowerCase().split(" ");
		System.out.println(Arrays.toString(wordArray));

		for (String word : wordArray) {
//			if (map.containsKey(word)) {
//				map.put(word, map.get(word) + 1);
//			} else {
//				map.put(word, 1);
//			}
			
			map.put(word,map.getOrDefault(word,0)+1);
		}

		return map;

	}

}
