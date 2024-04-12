package com.grind.imp;

import java.util.ArrayList;
import java.util.List;

class Solution54 
{
    public static List<Integer> spiralOrder(int[][] matrix) {
        
    	List<Integer> lst =new ArrayList<Integer>();
    	if (matrix.length == 0) 
    	{
             return lst;
        }
		int startRow = 0;
		int endRow = matrix.length-1;
		int startColumn = 0;
		int endColumn = matrix[0].length-1;
		
		while(startRow <= endRow && startColumn <= endColumn ) 
		{
			for(int i=startColumn; i <= endColumn; i++) 
			{
				lst.add(matrix[startRow][i]);
			}
			startRow++;
			for(int i=startRow; i <= endRow; i++) 
			{
				lst.add(matrix[i][endColumn]);
			}
			endColumn--;
			if(startRow <= endRow) 
			{
				for(int i=endColumn; i >= startColumn; i--) 
				{
					lst.add(matrix[endRow][i]);
				}
				endRow--;
			}
			if(startColumn <= endColumn) 
			{
				for(int i=endRow; i >= startRow; i--) 
				{
					lst.add(matrix[i][startColumn]);
				}
				startColumn++;
			}
		}
    	return lst;
    }
    
    public static void main(String[] args) {
		int[][] nums = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(nums.length);
		System.out.println(nums[0].length);
		System.out.println("********************");
		System.out.println("********************");
		System.out.println("********************");
		for(int i=0; i < nums.length; i++) {
			//System.out.println(nums[0].length);
			for(int j =0; j < nums[0].length; j++) {
				//System.out.println(i+","+j+" --> "+nums[i][j]);
			}
			
		}
		int startRow = 0;
		int endRow = nums.length-1;
		int startColumn = 0;
		int endColumn = nums[0].length-1;
		
		while(startRow <= endRow && startColumn < endColumn ) 
		{
			for(int i=startColumn; i <= endColumn; i++) 
			{
				System.out.println(nums[startRow][i]);
			}
			startRow++;
			for(int i=startRow; i <= endRow; i++) 
			{
				System.out.println(nums[i][endColumn]);
			}
			endColumn--;
			if(startRow <= endRow) 
			{
				for(int i=endColumn; i >= startColumn; i--) 
				{
					System.out.println(nums[endRow][i]);
				}
				endRow--;
			}
			if(startColumn <= endColumn) 
			{
				for(int i=endRow; i >= startRow; i--) 
				{
					System.out.println(nums[i][startColumn]);
				}
				startColumn++;
			}
		}
	}
    
    List<Integer> spiralOrder1(int[][] matrix) {

        List<Integer> res = new ArrayList<>();

        if (matrix.length == 0) {
          return res;
        }

        int startRow = 0;
        int endRow = matrix.length - 1;
        int startColumn = 0;
        int endColumn = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
          // Traverse Right
          for (int j = startColumn; j <= endColumn; j++) {
            res.add(matrix[startRow][j]);
          }
          startRow++;

          // Traverse Down
          for (int j = startRow; j <= endRow; j++) {
            res.add(matrix[j][endColumn]);
          }
          endColumn--;

          if (startRow <= endRow) {
            // Traverse Left
            for (int j = endColumn; j >= startColumn; j--) {
              res.add(matrix[endRow][j]);
            }
          }
          endRow--;

          if (startColumn <= endColumn) {
            // Traverse Up
            for (int j = endRow; j >= startRow; j--) {
              res.add(matrix[j][startColumn]);
            }
          }
          startColumn++;
        }

        return res;
      }
}