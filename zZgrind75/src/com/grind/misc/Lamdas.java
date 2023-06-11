package com.grind.misc;

public class Lamdas {
	
	public static void main(String[] args) {
		printThing((x)->System.out.println("Hello "+x), "Ram ");
	}
	
	public static void printThing(Printable print, String x) {
		print.print(x);
	}

}
