package com.mastery.javabasics;

public class MainClass {

	public static void main(String[] args) {
		
		//DataArrays.printSingleDimensionalArray();
		// since the method is static, it can be invoked directly using class name.

		//new DataArrays().printTwoDimensionalArray();
		// the method isn't static, so to access the data need to invoke the method
		// through instance.
		
		int[] intArray = {100,30,450,25,60};
		DataArrays.sortArray(intArray);
	}

}
