package com.grind.misc;

public class Singleton {
	
	//private static variable to hot the single instance of the class
	private static Singleton instance;
	
	//private constructor in prevent external Instantiation
	private Singleton() {
		//Optional: Initialization of code here
	}

	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
