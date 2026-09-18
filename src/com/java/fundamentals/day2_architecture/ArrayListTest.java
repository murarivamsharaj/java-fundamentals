package com.java.fundamentals.day2_architecture;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    static void main() {
        List<String> list = new ArrayList<>();

     list.add("Java");
     list.add("Python");
     list.add("JavaScript");
     list.add("C");
     list.add("C++");
     list.add("C#");
     list.add("HTML");

        System.out.println("Print languages");

        for(String lang : list) {
            System.out.println(lang);
        }
    }
}
