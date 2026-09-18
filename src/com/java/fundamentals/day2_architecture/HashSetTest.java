package com.java.fundamentals.day2_architecture;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    static void main() {

        Set<String> uniqueTags = new HashSet<String>();

        uniqueTags.add("Customer 1");
        uniqueTags.add("Customer 2");
        uniqueTags.add("Customer 3");
        uniqueTags.add("Customer 4");

        Boolean tag = uniqueTags.add("Customer 5");
        System.out.println(tag);

        System.out.println("Hashset " + uniqueTags);
    }
}
