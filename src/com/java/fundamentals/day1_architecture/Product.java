package com.java.fundamentals.day1_architecture;

public class Product {
    // 1. Encapsulation: Private variables (hidden from outside)
    private String name;
    private double price;

    // Static Variable: Belongs to the CLASS, not the object.
    // It counts total products created across the entire program.
    public static int totalProducts = 0;

    // 2. Constructor: Sets up the object when 'new' is used
    public Product(String name, double price) {
        this.name = name;
        setPrice(price); // Use the setter for validation!
        totalProducts++;
    }

    // 3. Encapsulation: Public getter
    public double getPrice() {
        return price;
    }

    // 4. Encapsulation: Public setter with validation logic
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative!");
        }
    }

    // Overriding the default toString() method to print nicely
    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }

    public static void main(String[] args) {
        // Creating Objects from the Class Blueprint
        Product laptop = new Product("Gaming Laptop", 1200.00);
        Product mouse = new Product("Wireless Mouse", 25.50);

        System.out.println(laptop.toString());

        // Trying to set a negative price (Encapsulation protects it!)
        mouse.setPrice(10);

        System.out.println("Total products created: " + Product.totalProducts);
    }
}