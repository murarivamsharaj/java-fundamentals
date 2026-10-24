package com.java.fundamentals.day2_architecture;

import java.util.HashMap;
import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new java.util.TreeMap<>();
        map.put("A", 1);
        map.put("D", 4);
        map.put("B", 2);
        map.put("C", 3);
        map.put("E", 5);
        map.put("F", 6);
        map.put("G", 7);
        map.put("H", 8);
        map.put("I", 9);
        map.put("J", 10);
        map.put("K", 11);
        map.put("L", 12);
        map.put("M", 13);
        map.put("N", 14);
        map.clear();

        System.out.println("TreeMap" + map);
    }
}
