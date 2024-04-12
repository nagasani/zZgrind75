package com.grind.misc;

public class StaticOverloadChild extends StaticOverloadParent
{	
	static void hello() {
		System.out.println("child");
	}
	
	public static void main(String[] args) {
		StaticOverloadChild.hello();
		StaticOverloadParent.hello();
	}

}
