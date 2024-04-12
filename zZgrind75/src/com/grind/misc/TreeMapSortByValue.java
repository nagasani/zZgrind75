package com.grind.misc;
import java.util.*;

public class TreeMapSortByValue {
    public static void main(String[] args) {
        // Create a TreeMap with some values
        Map<String, Integer> treeMap = new HashMap<>();
        treeMap.put("One", 1);
        treeMap.put("Three", 3);
        treeMap.put("Two", 2);
        treeMap.put("Four", 4);

        // Convert the entry set to a list to sort it
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(treeMap.entrySet());
       // Map.Entry<String, Integer> entry  = new AbstractMap.SimpleEntry<String, Integer>("",7);

        // Sort the list by values using a custom comparator
        entryList.sort(Map.Entry.comparingByValue());

        // Display the sorted values
        System.out.println("TreeMap sorted by values:");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
