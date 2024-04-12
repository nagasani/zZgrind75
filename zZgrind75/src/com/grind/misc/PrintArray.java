package com.grind.misc;

public class PrintArray {
	
	// 1  2  3
	// 4  5  6
	// 7  8  9
	public static void main(String[] args) {
		int[][] nums = new int[3][4];
		nums[0][0] = 1;
		nums[0][1] = 2;
		nums[0][2] = 3;
		nums[0][3] = 3;

		nums[1][0] = 4;
		nums[1][1] = 5;
		nums[1][2] = 6;
		nums[1][3] = 6;
		
		
		nums[2][0] = 7;
		nums[2][1] = 8;
		nums[2][2] = 9;
		nums[2][3] = 9;
		
		for(int i=0; i < nums.length; i++) {
			for(int j=0; j < nums[i].length; j++) 
			{
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
	}

}
