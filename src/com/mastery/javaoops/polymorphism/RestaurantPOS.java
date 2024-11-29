// Abstract class for MenuItem
package com.mastery.javaoops.polymorphism;

abstract class MenuItem {
    protected String name;

    public MenuItem(String name) {
        this.name = name;
    }

    // Abstract method for calculating price
    public abstract double calculatePrice();

    public String getName() {
        return name;
    }
}

// Beverage class with size-based pricing
class Beverage extends MenuItem {
    private double basePrice;
    private String size; // "Small", "Medium", "Large"

    public Beverage(String name, double basePrice, String size) {
        super(name);
        this.basePrice = basePrice;
        this.size = size;
    }

    @Override
    public double calculatePrice() {
        double price = basePrice;
        switch (size) {
            case "Medium": price += 1.5; break;
            case "Large": price += 2.5; break;
        }
        return price;
    }
}

// Main Course with optional side dishes
class MainCourse extends MenuItem {
    private double basePrice;
    private boolean hasSideDish;
    private double sideDishPrice;

    public MainCourse(String name, double basePrice, boolean hasSideDish, double sideDishPrice) {
        super(name);
        this.basePrice = basePrice;
        this.hasSideDish = hasSideDish;
        this.sideDishPrice = sideDishPrice;
    }

    @Override
    public double calculatePrice() {
        return hasSideDish ? basePrice + sideDishPrice : basePrice;
    }
}

// Dessert with seasonal surcharge
class Dessert extends MenuItem {
    private double basePrice;
    private boolean isSeasonal;

    public Dessert(String name, double basePrice, boolean isSeasonal) {
        super(name);
        this.basePrice = basePrice;
        this.isSeasonal = isSeasonal;
    }

    @Override
    public double calculatePrice() {
        return isSeasonal ? basePrice * 1.2 : basePrice; // 20% surcharge for seasonal desserts
    }
}

// Main class to demonstrate polymorphism with MenuItem
public class RestaurantPOS {
    public static void main(String[] args) {
        MenuItem coffee = new Beverage("Coffee", 3.0, "Large");
        MenuItem burger = new MainCourse("Burger", 8.0, true, 2.5);
        MenuItem cheesecake = new Dessert("Cheesecake", 5.0, true);

        System.out.println(coffee.getName() + " Price: $" + coffee.calculatePrice());
        System.out.println(burger.getName() + " Price: $" + burger.calculatePrice());
        System.out.println(cheesecake.getName() + " Price: $" + cheesecake.calculatePrice());
    }
}
