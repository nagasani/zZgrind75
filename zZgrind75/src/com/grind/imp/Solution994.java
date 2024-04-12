package com.grind.imp;
import java.util.LinkedList;
import java.util.Queue;

//Revisit
class Solution994 {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;
        
        // Initialize the queue and count fresh oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j, 0});
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }
        
        int minutes = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while (!queue.isEmpty()) {
            int[] orange = queue.poll();
            int row = orange[0];
            int col = orange[1];
            minutes = orange[2];
            
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == 1) {
                    grid[newRow][newCol] = 2; // Mark as rotten
                    queue.offer(new int[]{newRow, newCol, minutes + 1});
                    freshOranges--;
                }
            }
        }
        
        return freshOranges == 0 ? minutes : -1;
    }
}
