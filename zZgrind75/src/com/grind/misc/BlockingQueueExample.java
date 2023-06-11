package com.grind.misc;
import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) {
    	
    	PriorityQueue<String> pq = new PriorityQueue<String>((x,y)->x.compareTo(y));
    	pq.add(null);
    	
        // Create a blocking queue with a capacity of 3
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        // Producer thread
        Thread producerThread = new Thread(() -> {
            try {            	
                // Add elements to the blocking queue
                blockingQueue.put("Message 1");
                System.out.println("Produced: Message 1");

                blockingQueue.put("Message 2");
                System.out.println("Produced: Message 2");

                blockingQueue.put("Message 3");
                System.out.println("Produced: Message 3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer thread
        Thread consumerThread = new Thread(() -> {
            try {
                // Retrieve elements from the blocking queue
                String message1 = blockingQueue.take();
                System.out.println("Consumed: " + message1);

                String message2 = blockingQueue.take();
                System.out.println("Consumed: " + message2);

                String message3 = blockingQueue.take();
                System.out.println("Consumed: " + message3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the producer and consumer threads
        producerThread.start();
        consumerThread.start();
    }
}
