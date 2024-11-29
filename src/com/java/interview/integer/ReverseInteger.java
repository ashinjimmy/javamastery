package com.java.interview.integer;

public class ReverseInteger {

	public static void main(String[] args) {

		int digit = 2147483647;
		try {
		reverseInt(digit);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void reverseInt(int digit) {
		int reverseDigit = 0, temp = 0;

		while (digit != 0) {
			temp = digit % 10;
			digit = digit / 10;

			if (reverseDigit > Integer.MAX_VALUE / 10 || reverseDigit < Integer.MIN_VALUE / 10) {
				throw new IllegalArgumentException("Reversed number got overflowed!!");
			}

			reverseDigit = reverseDigit * 10 + temp;
		}

		System.out.println(reverseDigit);

	}

}
