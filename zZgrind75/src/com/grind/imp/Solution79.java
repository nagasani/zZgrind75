package com.grind.imp;
//Revisit
class Solution79 {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        
        // Loop through each cell in the board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean dfs(char[][] board, String word, int i, int j, int index) {
        int m = board.length;
        int n = board[0].length;
        
        // Base case: If we've matched all characters in the word, return true
        if (index == word.length()) {
            return true;
        }
        
        // Check boundaries and if the current cell matches the current character in the word
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word.charAt(index)) {
            return false;
        }
        
        // Temporarily mark the cell as visited
        char originalChar = board[i][j];
        board[i][j] = ' ';
        
        // Explore adjacent cells (up, down, left, right)
        boolean found = dfs(board, word, i - 1, j, index + 1) ||
                        dfs(board, word, i + 1, j, index + 1) ||
                        dfs(board, word, i, j - 1, index + 1) ||
                        dfs(board, word, i, j + 1, index + 1);
        
        // Restore the original character
        board[i][j] = originalChar;
        
        return found;
    }
}
