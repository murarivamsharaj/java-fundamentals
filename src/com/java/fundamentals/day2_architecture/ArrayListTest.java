package com.java.fundamentals.day2_architecture;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    static void main() {
        List<String> cart = new ArrayList<>();

        cart.add("Laptop"); // Fast (O(1)) - Just goes at the end
        cart.add("Mouse");  // Fast
        cart.add("Keyboard");

        // INSTANT ACCESS: O(1)
        System.out.println(cart.get(1)); // Output: Mouse

        // SLOW INSERTION: O(n)
        // "Mouse" and "Keyboard" must both shift one index to the right
        // to make room for "Monitor" at index 1.
        cart.add(1, "Monitor");
    }
}
