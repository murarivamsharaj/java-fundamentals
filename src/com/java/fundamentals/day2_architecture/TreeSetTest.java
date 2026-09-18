package com.java.fundamentals.day2_architecture;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(4);
        set.add(2);
        set.add(1);
        set.add(5);

        System.out.println("set " + set);
        System.out.println("set contains " + set.contains(7));
        System.out.println("set contains " + set.contains(2));

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(7);
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(9);

        System.out.println("treeSet " + treeSet);
    }
}
