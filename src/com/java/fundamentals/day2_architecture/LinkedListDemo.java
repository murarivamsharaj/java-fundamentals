package com.java.fundamentals.day2_architecture;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> queue = new LinkedList<>();

        queue.add("Customer 1");
        queue.add("Customer 2");
        queue.add("Customer 3");

        // SLOW ACCESS: O(n)
        // Java starts at Customer 1, asks for the next pointer,
        // goes to Customer 2, asks for the next pointer...
        System.out.println(queue.get(1)); // Output: Customer 3

        // FAST INSERTION/DELETION: O(1) if iterating
        // Only the pointers around "Customer 2" need to be updated.
        // No shifting occurs.
        queue.remove("Customer 1");
    }
}
