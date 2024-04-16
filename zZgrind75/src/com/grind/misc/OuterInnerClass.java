package com.grind.misc;

public class OuterInnerClass {
	
	private int outerInt = 10;
	private static int staticInt = 30;
	
	public class InnerClass
	{
		public int inerInt = 20;
		public void  innerMethod() 
		{
			System.out.println(outerInt);
			System.out.println(staticInt);
		}
	}

	
	public static void main(String[] args) {
		
		InnerClass in = new OuterInnerClass().new InnerClass();
		in.innerMethod();
		System.out.println(in.inerInt);
	}
}
