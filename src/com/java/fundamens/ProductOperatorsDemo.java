package com.java.fundamens;

public class ProductOperatorsDemo {
    static void main() {
        double price = 1500.0;
        int quantity = 3;
        double discountPercent = 10;
        boolean isAvailable = true;

        double totalCost = price * quantity;
        double discountAmount = totalCost * discountPercent / 100;
        double finalPrice = totalCost - discountAmount;
        boolean canPurchase = isAvailable;

        System.out.println("Total Cost: " + totalCost);
        System.out.println("Discount: " + discountAmount);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("Can Purchase: " + canPurchase);
    }
}
