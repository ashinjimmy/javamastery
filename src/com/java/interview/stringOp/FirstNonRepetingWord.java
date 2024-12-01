package com.java.interview.stringOp;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FirstNonRepetingWord {
	
	private final static Scanner data = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the string value ");
		System.out.println(" The first non repetative word is "+ findFirstNonRepWord(data.next()));
	}
	
	private static char findFirstNonRepWord(String data) {
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		if(data == null || data.isEmpty())
			throw new NullPointerException("There is no data entered!!");
		
		for(char c : data.toLowerCase().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}

		for(Entry<Character, Integer> mapdata : map.entrySet()) {
			if(mapdata.getValue() == 1) {
				return mapdata.getKey();
			}
		}
		
		throw new NullPointerException("There is no word non repetiting!!");
	}

}
