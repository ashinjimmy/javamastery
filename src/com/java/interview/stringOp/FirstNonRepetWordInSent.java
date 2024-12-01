package com.java.interview.stringOp;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepetWordInSent {

    public static void main(String[] args) {
        String input = "I level up my skills and duties !!";
        findWordFromSentences(input);
    }

    private static void findWordFromSentences(String input) {
        if (input == null || input.isEmpty()) {
            throw new NullPointerException("The input data is empty!!");
        }

        String[] words = input.replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s");
        ArrayList<Character> finalData = new ArrayList<>();

        for (String word : words) {
            Character result = findNonRepetCharacter(word);
            finalData.add(result);
        }

        System.out.println("First non-repeating characters for each word: " + finalData);
    }

    private static char findNonRepetCharacter(String word) {
        if (word == null || word.isEmpty()) {
            return ' '; // Placeholder for empty or null words
        }

        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count frequency of each character
        for (Character c : word.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        for (Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return ' '; // Placeholder if no non-repeating character is found
    }
}
