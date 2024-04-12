package com.grind.imp;

//Revisit
public class Solution62 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        // Initialize the first row to 1, as there's only one way to reach any cell in the first row (move right).
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        // Initialize the first column to 1, as there's only one way to reach any cell in the first column (move down).
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // Fill in the rest of the dp array using dynamic programming.
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // The value in the bottom-right corner is the number of unique paths.
        return dp[m - 1][n - 1];
    }
    
    public static void main(String[] args) {
    	Solution62 solution = new Solution62();
        
        int m = 3; // Number of rows
        int n = 7; // Number of columns
        
        int uniquePaths = solution.uniquePaths(m, n);
        
        System.out.println("Number of unique paths from (0, 0) to (" + (m - 1) + ", " + (n - 1) + "): " + uniquePaths);
    }
}
