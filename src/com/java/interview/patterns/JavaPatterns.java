package com.java.interview.patterns;

public class JavaPatterns {

	public static void main(String[] args) {

		int numOfRows = 7;

		printPattern1(numOfRows);

		printPattern2(numOfRows);

		pyramidPattern(numOfRows);
		
		hallowSquarePattern(numOfRows);

	}

	private static void hallowSquarePattern(int numOfRows) {

		for(int row=1; row <= numOfRows; row++) {
			for (int col = 1; col <= numOfRows; col++) {
				if(row==1 || row==numOfRows || col==1 || col==numOfRows) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

	private static void pyramidPattern(int numOfRows) {

		for (int row = 1; row <= numOfRows; row++) {

			for (int space = 1; space <= numOfRows - row; space++) {
				System.out.print(" ");
			}

			for (int col = 1; col <= (2 * row - 1); col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int row = numOfRows; row >= 1; row--) {

			for (int space = 1; space <= numOfRows - row; space++) {
				System.out.print(" ");
			}

			for (int col = 1; col <= (2 * row - 1); col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static void printPattern2(int numOfRows) {
		for (int row = 1; row <= numOfRows; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int row = numOfRows; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private static void printPattern1(int numOfRows) {
		for (int row = numOfRows; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

}
