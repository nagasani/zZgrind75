package com.grind.misc;

import java.util.HashSet;
import java.util.Set;

public class Panagram {

	public static void main(String[] args) {
		String s = "we promptly judged antique ivory buckles for the next prize";
		System.out.println(isPan(s));
	}
	
	public static boolean isPan(String s) {
		
		char[] c = s.toCharArray();
		
		Set<Character> set= new HashSet<>();
		for(Character c1 : c) {
			set.add(c1);
			//System.out.println(set.size());
			if(set.size() == 26) {return true;}
		}
		return set.size() == 26 ? true: false;
	}
}
