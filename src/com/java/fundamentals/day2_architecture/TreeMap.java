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


        System.out.println("TreeMap" + map);
    }
}
