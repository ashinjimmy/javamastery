package com.mastery.javabasics;

import java.util.Objects;

public class Person {

    // Instance variables
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Override toString() for object representation
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", address='" + address + "'}";
    }

    // Override equals() to compare Person objects by their field values
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
               Objects.equals(name, person.name) &&
               Objects.equals(address, person.address);
    }

    // Override hashCode() for use in hash-based collections
    @Override
    public int hashCode() {
        return Objects.hash(name, age, address);
    }

    // Main method for testing purposes
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30, "123 Main St");
        System.out.println(person1);  // Uses the toString() method
    }
}
