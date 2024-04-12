package com.grind.misc;

import java.util.HashMap;
import java.util.Map;

/*
You are given a stack of boarding passes from a one-way multi-stop trip. 
Each city was only visited once.  Write an algorithm that returns the itinerary of the trip.


E.g.
SFO -> JFK
JFK -> LHR
LHR -> DEL
DEL -> PEK
PEK -> SYD
SYD -> LAX

Should return
SFO -> JFK -> LHR -> DEL -> PEK -> SYD -> LAX

*/


public class PrintItenery {
	
	public static void main(String[] args) {
		
		Map<String, String> sourceDest = new HashMap<String, String>(); 
		
		StringBuffer sb = new StringBuffer();
		
		sourceDest.put("SFO", "JFK");
		sourceDest.put("JFK", "LHR");
		sourceDest.put("LHR", "DEL");
		sourceDest.put("DEL", "PEK");
		sourceDest.put("PEK", "SYD");
		sourceDest.put("SYD", "LAX");
		
		String initialPoint = getFirstAirport(sourceDest);
		
		//String lastPoint = getLastAirport(sourceDest);
		
		//System.out.println(lastPoint);
		
		sb.append(initialPoint +" --> ");
		
		for(String src :  sourceDest.keySet()) {
			String next = sourceDest.get(initialPoint);
			sb.append(next+" --> ");
			initialPoint = next;
		}
		//sb.append(lastPoint);
		System.out.println(sb.toString());
	}
	
	public static String getFirstAirport(Map<String, String> sourceDest) {
		String initialPoint = "";
		for(String src :  sourceDest.keySet()) {
			if(!sourceDest.values().contains(src)) {
				initialPoint = src;
				break;
			}
		}
		return initialPoint;
	}
	
	/*
	 * public static String getLastAirport(Map<String, String> sourceDest) { String
	 * endPoint = ""; for(String src : sourceDest.values()) {
	 * if(!sourceDest.keySet().contains(src)) { endPoint = src; } } return endPoint;
	 * }
	 */

}
