package com.grind.misc;

import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;

public class Snippet 
{
	public static List<String> getPaymentConfirmationStatus(List<Integer> timestamps, List<Pair<Integer, Integer>> payments, int timeLimit) 
	{        
	        List<String> lst = new ArrayList<>();
	        lst.add("false");
	        
	        for(int i =1; i < timestamps.size(); i++)
	        {
	            
	            if((timestamps.get(i) - timestamps.get(i-1)) > timeLimit)
	            {
	                lst.add("false");
	                System.out.println(lst);
	            }
	            else
	            {
	                int baseTimeStamp = i;
	                //List<Pair<Integer, Integer>> paymentsTemp = new ArrayList<>();      
	                boolean found = false;          
	                while(baseTimeStamp > 0 && (timestamps.get(baseTimeStamp) - timestamps.get(baseTimeStamp-1)) < timeLimit)
	                {
	                    if((payments.get(i).getKey() == payments.get(baseTimeStamp-1).getKey()) 
	                    		&& (payments.get(i).getValue() == payments.get(baseTimeStamp-1).getValue()))
	                    {
	                        found = true;
	                        lst.add("true");
	                        break;
	                    }
	                    baseTimeStamp--;
	                }
	                if(!found) lst.add("false");
	                System.out.println(lst);
	               //Pair<Integer, Integer> pair1 = new Pair<>("John", 25); 
	                
	            }            
	        }
	        return lst;
	    }
	
	public static void main(String[] args) {
		List<Pair<Integer, Integer>> payments = new ArrayList<Pair<Integer,Integer>>();		
		payments.add(new Pair<>(1,4));
		payments.add(new Pair<>(1,4));
		payments.add(new Pair<>(3,5));
		payments.add(new Pair<>(8,6));
		List<Integer> timestamps = new ArrayList<Integer>();
		timestamps.add(1);
		timestamps.add(1);
		timestamps.add(1);
		timestamps.add(8);
		//System.out.println(getPaymentConfirmationStatus(timestamps, payments, 4));
		
		List<Pair<Integer, Integer>> payments1 = new ArrayList<Pair<Integer,Integer>>();		
		payments1.add(new Pair<>(50,50));
		payments1.add(new Pair<>(55,90));
		payments1.add(new Pair<>(50,50));
		payments1.add(new Pair<>(55,90));
		payments1.add(new Pair<>(14,94));
		payments1.add(new Pair<>(50,50));
		
		List<Integer> timestamps1 = new ArrayList<Integer>();
		timestamps1.add(23);
		timestamps1.add(23);
		timestamps1.add(52);
		timestamps1.add(52);
		timestamps1.add(180);
		timestamps1.add(180);
		
		System.out.println(getPaymentConfirmationStatus(timestamps1, payments1, 55));

	}
}

