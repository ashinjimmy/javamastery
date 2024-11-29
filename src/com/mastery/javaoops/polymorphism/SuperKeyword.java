package com.mastery.javaoops.polymorphism;

public class SuperKeyword {
	
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	}

}


 class Parent {
    public void display() {
        System.out.println("Parent display method");
    }
}

 class Child extends Parent {
    public void display() {
        super.display(); // Calls Parent's display method
        System.out.println("Child display method");
    }
}
