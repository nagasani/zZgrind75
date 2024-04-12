package com.grind.misc;

import java.util.ArrayList;
import java.util.List;

public class PermucationsOfStocks {
	
	public static List<List<String>> lst = new ArrayList<>();
	
	public static void main(String[] args) {
	  	List<String> stockSymbols = new ArrayList<>();
        stockSymbols.add("AAPL");
        stockSymbols.add("GOOGL");
        stockSymbols.add("MSFT");        
        backTrack(new ArrayList<String>(), stockSymbols);
        for(List<String> l:lst) {
        	System.out.println(l);
        }
	}

	private static void backTrack(ArrayList<String> currentList, List<String> stockSymbols) {
		if(currentList.size() == stockSymbols.size()) {
			List<String> copiedList = new ArrayList<>();
			copiedList.addAll(currentList);
			lst.add(copiedList);
		}
		
		for(String s : stockSymbols) {
			if(currentList.contains(s)) {
				continue;
			}
			currentList.add(s);
			backTrack(currentList, stockSymbols);
			currentList.remove(currentList.size()-1);			
		}		
	}

}
