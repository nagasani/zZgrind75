package com.grind.misc;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue with natural ordering
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(2);
        priorityQueue.add(8);
        priorityQueue.add(1);
        priorityQueue.add(10);

        System.out.println("PriorityQueue elements: " + priorityQueue);

        // Remove the highest priority element (min element)
        int minElement = priorityQueue.poll();
        System.out.println("Removed min element: " + minElement);
        System.out.println("PriorityQueue after removal: " + priorityQueue);

        // Peek the highest priority element (min element)
        int peekElement = priorityQueue.peek();
        System.out.println("Peeked min element: " + peekElement);
        System.out.println("PriorityQueue after peek: " + priorityQueue);

        // Add elements with custom comparator (reverse order)
        PriorityQueue<String> reversePriorityQueue = new PriorityQueue<>((s1, s2) -> s2.compareTo(s1));
        reversePriorityQueue.add("Apple");
        reversePriorityQueue.add("Banana");
        reversePriorityQueue.add("Orange");
        reversePriorityQueue.add("Grapes");

        System.out.println("Reverse PriorityQueue elements: " + reversePriorityQueue);
    }
}
