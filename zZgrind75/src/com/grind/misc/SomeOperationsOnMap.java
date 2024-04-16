package com.grind.misc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SomeOperationsOnMap {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("0", "Raj");
		map.putIfAbsent("1", "Ram");
		map.put("2", "Nagasani");
		System.out.println(map.getOrDefault("3","Not Present"));
		
		Set<Entry<String, String>> set = map.entrySet();
		
		for(Entry<String, String> entry : set) 
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		for(Entry<String, String> entry : set) 
		{
			if(entry.getKey().equalsIgnoreCase("Ram")) 
			{
				set.remove(entry);
			}
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		for(Entry<String, String> entry : set) 
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		System.out.println("Safe Removal by using iterator");
		
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            if (entry.getKey()  == "Ram") {  // Remove entries with even keys as an example
                it.remove();  // Safe removal using the iterator's remove method
            }
        }

        System.out.println(map); 
	}

}
