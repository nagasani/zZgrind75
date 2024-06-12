package com.grind.misc;

class Solution832 
{
	public static int[][] flipAndInvertImage(int[][] image) 
	{

		for(int i=0; i < image.length; i++) 
		{
			for(int j =0; j < image[i].length; j++) 
			{
				System.out.println(image[i][j]);
			}			
		}
		System.out.println();
		
		return image;
	}
	
	public static void main(String[] args) 
	{
        int[][] image = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };

        int[][] flippedAndInvertedImage = flipAndInvertImage(image);
	}
}