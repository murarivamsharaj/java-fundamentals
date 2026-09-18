package com.java.fundamentals.day2_architecture;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    static void main() {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");

        System.out.println("map " + map);
    }
}
