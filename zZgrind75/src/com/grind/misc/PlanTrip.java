package com.grind.misc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PlanTrip {
	
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

	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("SFO","JFK");
		map.put("JFK","LHR");
		map.put("LHR","DEL");
		map.put("DEL","PEK");
		map.put("PEK","SYD");
		map.put("SYD","LAX");	
		Set<String> set = map.keySet();		
	}
}
