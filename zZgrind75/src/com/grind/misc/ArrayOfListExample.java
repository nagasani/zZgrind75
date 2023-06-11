package com.grind.misc;
import java.util.ArrayList;
import java.util.List;

public class ArrayOfListExample {
    public static void main(String[] args) {
    	String a = "123";
    	String b = "123";
    	
    	if(a==b) {
    		System.out.println("true");
    	}
    	
        // Define an array of List
        List<Integer>[] arrayOfList = new ArrayList[3];

        // Initialize each element of the array as an ArrayList
        arrayOfList[0] = new ArrayList<>();
        arrayOfList[1] = new ArrayList<>();
        arrayOfList[2] = new ArrayList<>();

        // Add elements to each list
        arrayOfList[0].add(10);
        arrayOfList[0].add(20);

        arrayOfList[1].add(30);
        arrayOfList[1].add(40);
        arrayOfList[1].add(50);

        arrayOfList[2].add(60);

        // Access elements from the array of List
        int element1 = arrayOfList[0].get(0); // 10
        int element2 = arrayOfList[1].get(2); // 50
        int element3 = arrayOfList[2].get(0); // 60

        System.out.println(element1);
        System.out.println(element2);
        System.out.println(element3);
    }
}
