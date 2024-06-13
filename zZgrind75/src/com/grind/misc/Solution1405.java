package com.grind.misc;

import java.util.PriorityQueue;


//Do it later
class Solution1405 {
    public String longestDiverseString(int a, int b, int c) {
        // Max heap to keep characters with the most remaining counts
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((x, y) -> y.count - x.count);
        //"sdf".charAt(5);
        // Add initial counts of 'a', 'b', 'c' to the heap
        if (a > 0) maxHeap.offer(new Pair('a', a));
        if (b > 0) maxHeap.offer(new Pair('b', b));
        if (c > 0) maxHeap.offer(new Pair('c', c));
        
        StringBuilder result = new StringBuilder();
        
        while (!maxHeap.isEmpty()) {
            Pair first = maxHeap.poll();
            
            // Check if we can add the most frequent character
            if (result.length() >= 2 && result.charAt(result.length() - 1) == first.ch && result.charAt(result.length() - 2) == first.ch) {
                if (maxHeap.isEmpty()) break; // No other character to add
                
                Pair second = maxHeap.poll();
                result.append(second.ch);
                second.count--;
                
                if (second.count > 0) {
                    maxHeap.offer(second);
                }
                
                // Put the first character back into the heap
                maxHeap.offer(first);
            } else {
                result.append(first.ch);
                first.count--;
                
                if (first.count > 0) {
                    maxHeap.offer(first);
                }
            }
        }
        
        return result.toString();
        
    }

     private static class Pair {
        char ch;
        int count;
        
        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
}