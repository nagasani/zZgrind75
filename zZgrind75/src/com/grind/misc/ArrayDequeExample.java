package com.grind.misc;
import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Create an ArrayDeque
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        // Add elements to the front of the ArrayDeque
        arrayDeque.addFirst("Apple");
        arrayDeque.addFirst("Banana");
        arrayDeque.addFirst("Orange");

        // Add elements to the end of the ArrayDeque
        arrayDeque.addLast("Grapes");
        arrayDeque.addLast("Mango");

        System.out.println("ArrayDeque elements: " + arrayDeque);

        // Get the first element (front) of the ArrayDeque
        String firstElement = arrayDeque.getFirst();
        System.out.println("First element: " + firstElement);

        // Get the last element (end) of the ArrayDeque
        String lastElement = arrayDeque.getLast();
        System.out.println("Last element: " + lastElement);

        // Remove the first element from the ArrayDeque
        String removedFirstElement = arrayDeque.removeFirst();
        System.out.println("Removed first element: " + removedFirstElement);
        System.out.println("ArrayDeque after removal: " + arrayDeque);

        // Remove the last element from the ArrayDeque
        String removedLastElement = arrayDeque.removeLast();
        System.out.println("Removed last element: " + removedLastElement);
        System.out.println("ArrayDeque after removal: " + arrayDeque);
    }
}
