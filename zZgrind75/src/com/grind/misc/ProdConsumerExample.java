package com.grind.misc;

public class ProdConsumerExample {
	
	public static void main(String[] args) {
		Buffer1 buf = new Buffer1(5);
		
		Thread t1 = new Thread(new Producer1(buf));
		
		Thread t2 = new Thread(new Consumer1(buf));
		t1.start();
		t2.start();
	}

}
