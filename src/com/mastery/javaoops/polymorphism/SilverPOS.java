package com.mastery.javaoops.polymorphism;

//Abstract class for Discount
abstract class AbstractDiscount {
 protected String discountName;

 public AbstractDiscount(String discountName) {
     this.discountName = discountName;
 }

 // Abstract method to calculate discounted price
 public abstract double calculateDiscountedPrice(double originalPrice);

 // Common method to display discount information
 public void showDiscountInfo() {
     System.out.println("Applying " + discountName + " discount:");
 }
}

//Percentage-based discount
class PercentageDiscount extends AbstractDiscount {
 private double percentage;

 public PercentageDiscount(String discountName, double percentage) {
     super(discountName);
     this.percentage = percentage;
 }

 @Override
 public double calculateDiscountedPrice(double originalPrice) {
     showDiscountInfo();
     double discountAmount = originalPrice * (percentage / 100);
     return originalPrice - discountAmount;
 }
}

//Fixed amount discount
class FixedAmountDiscount extends AbstractDiscount {
 private double discountAmount;

 public FixedAmountDiscount(String discountName, double discountAmount) {
     super(discountName);
     this.discountAmount = discountAmount;
 }

 @Override
 public double calculateDiscountedPrice(double originalPrice) {
     showDiscountInfo();
     return originalPrice - discountAmount;
 }
}

//Seasonal discount with a special rate
class SeasonalDiscount extends AbstractDiscount {
 private double seasonalRate;

 public SeasonalDiscount(String discountName, double seasonalRate) {
     super(discountName);
     this.seasonalRate = seasonalRate;
 }

 @Override
 public double calculateDiscountedPrice(double originalPrice) {
     showDiscountInfo();
     double discountAmount = originalPrice * (seasonalRate / 100);
     return originalPrice - discountAmount;
 }
}

//Main class to demonstrate polymorphism with AbstractDiscount
public class SilverPOS {
 public static void main(String[] args) {
     double originalPrice = 100.0;

     AbstractDiscount percentageDiscount = new PercentageDiscount("10% Discount", 10); // 10% discount
     AbstractDiscount fixedAmountDiscount = new FixedAmountDiscount("Fixed $15 Discount", 15); // $15 discount
     AbstractDiscount seasonalDiscount = new SeasonalDiscount("Seasonal 20% Discount", 20); // 20% seasonal discount

     System.out.println("Original Price: $" + originalPrice);
     System.out.println("Price after Percentage Discount: $" + percentageDiscount.calculateDiscountedPrice(originalPrice));
     System.out.println("Price after Fixed Amount Discount: $" + fixedAmountDiscount.calculateDiscountedPrice(originalPrice));
     System.out.println("Price after Seasonal Discount: $" + seasonalDiscount.calculateDiscountedPrice(originalPrice));
 }
}


