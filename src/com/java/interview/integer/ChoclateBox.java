package com.java.interview.integer;

public class ChoclateBox {

	public static void main(String[] args) {
		int numOfChocaltes = 1000000000;
		calculatePeople(numOfChocaltes);
	}

	private static void calculatePeople(int numOfChocaltes) {
		int numOfPeople = 0, totalChoclateCount = 0;
		while (numOfChocaltes > totalChoclateCount) {
			numOfPeople++;
			totalChoclateCount += numOfPeople;
			
		}
		
		if (numOfChocaltes < totalChoclateCount) {
			numOfChocaltes--;
		}
		System.out.println(numOfPeople);
	}

}
