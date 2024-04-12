package com.grind.misc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyListClass {
    private List<String> myList;

    // Constructor initializes the list with some elements
    public MyListClass() {
        myList = new ArrayList<>();
        myList.add("Element 1");
        myList.add("Element 2");
        myList.add("Element 3");
        myList.add("Element 4");
    }

    // Method to display the list elements
    public void displayList() {
        System.out.println("List Elements:");
        for (String element : myList) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        MyListClass myClass = new MyListClass();
        for(String s : myClass.myList) 
        {
        	System.out.println(s);
        	//myClass.myList.remove("Element 2");
        }
        
        Iterator<String> it = myClass.myList.iterator();
        
        while(it.hasNext()) 
        {
        	String st = it.next();
        	if(st.equals("Element 2")) 
        	{
        		it.remove();
        	}
        	System.out.println(st);	
        }
        myClass.displayList();
    }
}
