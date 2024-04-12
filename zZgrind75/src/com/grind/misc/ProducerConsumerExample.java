package com.grind.misc;

public class ProducerConsumerExample 
{
	public static void main(String[] args) 
	{
		Buffer buffer = new Buffer(5); // Create a buffer with capacity 5

		Producer producer = new Producer(buffer);
		Consumer consumer = new Consumer(buffer);

		producer.start(); // Start the producer thread
		consumer.start(); // Start the consumer thread
	}
}
