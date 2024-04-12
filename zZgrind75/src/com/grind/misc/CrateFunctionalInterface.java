package com.grind.misc;

@FunctionalInterface
public interface CrateFunctionalInterface {
	
	void funcInt();
	
	default void printSomeThing() {		
		System.out.println("Something");
	}
	
	static void printSomeThing1() {		
		System.out.println("Something");
	}

}
