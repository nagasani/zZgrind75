package com.grind.misc;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Mian {
	static int i=0;
	
	public static void main(String[] args) {
		System.out.println("Hi");
		
		LinkedList<String> lst = new LinkedList<>();
		lst.add("Hello");
		lst.add("World");
		lst.add("!!!");
		
		ArrayDeque<String> queue = new ArrayDeque<>();
		queue.add("Hello");
		queue.add("World");
		queue.add("!!!");
		
		lst.addFirst("H");
		lst.removeLast();  
		
		queue.addFirst("WQ");
		queue.removeFirst();
		
		
		
		Thread task1 = new Thread(
				()->{
						//int i =0;
						while(i < 10) 
						{
							System.out.println("Hello Task1 "+i);
							try
							{
								Thread.sleep(100);
							}
							catch (Exception e) {
								// TODO: handle exception
							}
							i++;
						}
					}
				);
			Employee emp1 = new Employee(1, "Ram", "rama.nagasani@gmail.com");
			Employee emp2 = new Employee(1, "Ram", "rama.nagasani@gmail.com");
			
			System.out.println(emp1.hashCode());
			System.out.println(emp2.hashCode());
			
			System.out.println(emp1.equals(emp2));
			
			System.out.println(emp1== emp2);
	}
	

}
