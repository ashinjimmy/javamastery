package com.mastery.javaoops.polymorphism;

import java.util.Arrays;

class Encap {

	private String name;
	private int[] ages = new int[2];

	public Encap() {
		name = "Ashin";
		ages[0] = 26;
		ages[1] = 30;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getAges() {
		return Arrays.copyOf(ages, ages.length);
	}

	public void setAges(int[] ages) {
		this.ages = ages;
	}

}

public class AdvanceEncapsulation {
	
	public static void main(String[] args) {
		Encap cap = new Encap();
		System.out.println(Arrays.toString(cap.getAges()));
		int[] ages = cap.getAges();
		ages[0] = 31;
		ages[1] =25;
		System.out.println(Arrays.toString(cap.getAges()));
		
		String name = cap.getName();
		System.out.println(name);
		name = "Amenta";
		System.out.println(cap.getName());
	}

}
