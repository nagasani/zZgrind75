package com.grind.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExmaple {

	public static void main(String[] args) {
				
		
		List<Map> lists = new ArrayList<>(); 
		lists.stream().map(map1 -> {
			try {
				return update(map1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return map1;
		}).collect(Collectors.toList());		
	}
	
	
    static Map update(Map map) throws Exception 
	{
		throw new Exception(); 
	}
}
