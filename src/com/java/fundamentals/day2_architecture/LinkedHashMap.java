package com.java.fundamentals.day2_architecture;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new java.util.LinkedHashMap<>();
        linkedHashMap.put("A", 1);
        linkedHashMap.put("B", 2);
        linkedHashMap.put("C", 3);
        linkedHashMap.put("D", 4);

        System.out.println("LinkedHashMap" + linkedHashMap);
    }
}
