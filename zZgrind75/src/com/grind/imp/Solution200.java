package com.grind.imp;

import java.util.HashSet;
import java.util.Set;


//Revisit
class Solution200 {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        Set<String> islands = new HashSet<>();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    StringBuilder shape = new StringBuilder();
                    exploreIsland(grid, i, j, visited, shape);
                    islands.add(shape.toString());
                }
            }
        }
        
        return islands.size();
    }
    
    private void exploreIsland(char[][] grid, int row, int col, boolean[][] visited, StringBuilder shape) {
        int m = grid.length;
        int n = grid[0].length;
        
        if (row < 0 || row >= m || col < 0 || col >= n || grid[row][col] == '0' || visited[row][col]) {
            return;
        }
        
        visited[row][col] = true;
        shape.append(row + "-" + col + " "); // Record relative coordinates
        
        exploreIsland(grid, row + 1, col, visited, shape); // Down
        exploreIsland(grid, row - 1, col, visited, shape); // Up
        exploreIsland(grid, row, col + 1, visited, shape); // Right
        exploreIsland(grid, row, col - 1, visited, shape); // Left
    }
}
