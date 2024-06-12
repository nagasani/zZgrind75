package com.grind.nomura;

import java.util.LinkedList;
import java.util.List;

public class Snippet {
	String[] solutioncodeSignal(String[][] queries) {
	
	    List<Integer> values = new LinkedList<>();
	    String[] result = new String[queries.length];
	   
	    //System.out.println(queries.length);
	    for(int i= 0; i < queries.length; i++)
	    {
	        if(queries[i][0].equals("ADD"))
	        {
	            values.add(Integer.parseInt(queries[i][1]));
	            result[i] = Integer.toString(values.size());
	        }
	        else if(queries[i][0].equals("DELETE"))
	        {
	        	//Integer.parseInt(Integer.valueOf(Integer.parseInt(queries[i][1])));
	            Boolean b = values.remove(Integer.valueOf(Integer.parseInt(queries[i][1])));
	            result[i]= (b == true ? "true" : "false");
	        }
	        else if(queries[i][0].equals("GET_MEDIAN"))
	        {
	        	//Integer[] numbers  = values.toArray(new Integer[0]);
	        	List<Integer> numbers = values.stream().sorted().toList();	        		          
	            int middle = numbers.size() / 2;	            
	            if (numbers.size() % 2 == 1) 
	            {
	                result[i] = Integer.toString(numbers.get(middle));
	            } 
	            else 
	            {
	            	result[i] = String.valueOf((int) ((numbers.get(middle - 1) + numbers.get(middle)) / 2.0));
	                //return (numbers[middle - 1] + numbers[middle]) / 2.0;
	            }
	        }
	    }
	    return result;
	}	
	
	int solution(int n) 
	{
		char[] c = Integer.toString(n).toCharArray();
		int sum = 0;
		
		for(char c1 : c) 
		{
			sum += c1-'0';
		}
		
		
		
		
	    return 1;
	}

}

