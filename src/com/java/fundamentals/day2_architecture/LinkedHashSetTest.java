package com.java.fundamentals.day2_architecture;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
    static void main() {
        Set<String> cartItems = new LinkedHashSet<>();
        cartItems.add("Mouse");
        cartItems.add("Keyboard");
        cartItems.add("Mouse");
        cartItems.add("Monitor");

        System.out.println("CartItems " + cartItems);
    }
}
