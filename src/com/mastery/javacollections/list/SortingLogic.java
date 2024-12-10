package com.mastery.javacollections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingLogic {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>(Arrays.asList(new Employee(1032, "Ashin", 49000.00),
				new Employee(1209, "Aswathy", 52000.00), new Employee(10020, "Bina", 75000.00),
				new Employee(2344, "Cara", 34000.50), new Employee(3400, null, 3456.00)));

		System.out.println("List before sorting --- " + empList);

		 // Sorting by name in natural (alphabetical) order, placing nulls last, then by salary
        empList.sort(Comparator.comparing(
                Employee::getName, 
                Comparator.nullsLast(Comparator.naturalOrder())
            ).thenComparing(Employee::getSalary)
        );

        System.out.println("\nList sorted by name (alphabetical order, nulls last) and salary:");
        empList.forEach(System.out::println);

        // Sorting by the length of names, placing nulls last
        empList.sort(Comparator.comparing(
                Employee::getName, 
                Comparator.nullsLast(Comparator.comparingInt(name -> name != null ? ((String) name).length() : 0).reversed())
            ).thenComparing(Employee::getSalary).reversed()
        );
        
        
        empList.sort(
                Comparator.comparing(
                    Employee::getName,
                    Comparator.nullsLast(
                        Comparator.comparingInt(name -> name != null ? ((String) name).length() : 0)
                                  .reversed() // Sort by name length in descending order
                    )
                ).thenComparing(
                    Comparator.comparingDouble(Employee::getSalary).reversed() // Sort by salary in descending order if lengths are equal
                )
            );

        System.out.println("\nList sorted by name length (nulls last):");
        empList.forEach(System.out::println);
	}

}
