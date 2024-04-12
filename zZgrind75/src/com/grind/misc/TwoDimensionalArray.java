package com.grind.misc;

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		
		int[][][] l = new int[2][3][4];
		
		System.out.println(l[0][0].length);
		System.out.println(l[0].length);
		System.out.println(l.length);
		
		for(int i =0; i < l[0][0].length; i++) {
			
			for(int j =0; j < l[0].length; j++) {
				
				for(int k =0; k < l.length; k++) {					
					//System.out.println(i+" "+j+" "+k);
				}
				
			}
		}
		
		
	}

}
