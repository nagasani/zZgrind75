package com.grind.misc;
import java.util.*;

public class MainAddEntry {
    public static void main(String[] args) {
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
            (x, y) -> x.getValue().compareTo(y.getValue())
        );

        Map.Entry<Integer, Integer> entry1 = new AbstractMap.SimpleEntry<>(1, 20);
        Map.Entry<Integer, Integer> entry2 = new AbstractMap.SimpleEntry<>(2, 10);
        Map.Entry<Integer, Integer> entry3 = new AbstractMap.SimpleEntry<>(3, 30);

        queue.add(entry1);
        queue.add(entry2);
        queue.add(entry3);

        while (!queue.isEmpty()) {
            Map.Entry<Integer, Integer> entry = queue.poll();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
