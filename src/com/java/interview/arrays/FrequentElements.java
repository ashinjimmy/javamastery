package com.java.interview.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequentElements {
    public static void main(String[] args){
        int[] input = {1,2,1,2,2,2,3,4,5,6,3,2,4};
        findFrequentElements(input);
    }
    public static void findFrequentElements(int[] input){
    	
    	System.out.println(Arrays.toString(input));
    	Map<Integer, Integer> map = new HashMap<>();
    	for(int num : input) {
//    		if(map.containsKey(num)) {
//    			map.put(num, map.get(num)+1);
//    		} else {
//    			map.put(num, 1);
//    		}
    		map.put(num, map.getOrDefault(num,0)+1);
    		
    	}
    	
    	int mostFrequentVal = input[0],maxCount = 0;
    	for(int key: map.keySet()) {
    		int count = map.get(key);
    		if(maxCount < count) {
    			maxCount = count;
    			mostFrequentVal = key;
    			
    		}
    	}
    	
       System.out.println(map+" ");
       System.out.println("Most frequent value is "+mostFrequentVal+" Count is "+maxCount);
    }
}
