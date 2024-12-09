package com.mastery.javacollections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingLogic {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>(Arrays.asList(new Employee(1032, "Ashin", 49000.00),
				new Employee(1209, "Aswathy", 52000.00), new Employee(10020, "Tina", 75000.00),
				new Employee(2344, "Cara", 34000.50), new Employee(3400, null, 3456.00)));

		System.out.println("List before sorting --- "+empList);

		empList.sort(Comparator.comparing(Employee::getName, Comparator.nullsLast(Comparator.naturalOrder()))
				.thenComparing(Employee::getSalary));
		System.out.println();
		System.out.println("List sorted with alphabetic order ");
		empList.forEach(System.out::println);
		System.out.println();
	}

}
