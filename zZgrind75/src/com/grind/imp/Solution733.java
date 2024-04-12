package com.grind.imp;

class Solution733 
{
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
    	 int oldColor = image[sr][sc];
         if (oldColor == color)
             return image;
         
         dfs(image, sr, sc, oldColor, color);
         return image;
    }
    
    private void dfs(int[][] image, int row, int col, int oldColor, int newColor) {
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length || image[row][col] != oldColor)
            return;
        
        image[row][col] = newColor;
        
        dfs(image, row - 1, col, oldColor, newColor);  // Up
        dfs(image, row + 1, col, oldColor, newColor);  // Down
        dfs(image, row, col - 1, oldColor, newColor);  // Left
        dfs(image, row, col + 1, oldColor, newColor);  // Right
    }
    
    public int[][] floodFill2(int[][] image, int sr, int sc, int color) 
    {
    	 int oldColor = image[sr][sc];
         if (oldColor == color)
             return image;
         
         dfs1(image, sr, sc, oldColor, color);
         return image;
    }
    
    private void dfs1(int[][] img, int row, int col, int currentColor, int newColor) {
    	
    	if(row < 0 || row >= img.length || col <0 || col >= img[0].length || img[row][col] != currentColor) {
    		return;
    	}
    	dfs1(img, row+1, col, currentColor, newColor); //up
    	dfs1(img, row-1, col, currentColor, newColor); //down
    	dfs1(img, row, col-1, currentColor, newColor); //Left
    	dfs1(img, row, col+1, currentColor, newColor); //Right
    }  
    
    public static void main(String[] args) {
		
	}
}