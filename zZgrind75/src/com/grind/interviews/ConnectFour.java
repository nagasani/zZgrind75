package com.grind.interviews;
import java.util.Scanner;

//Citadel
public class ConnectFour {
    private static final int ROWS = 6;
    private static final int COLUMNS = 7;
    private static final char EMPTY = ' ';
    private static final char PLAYER1 = 'X';
    private static final char PLAYER2 = 'O';

    private char[][] board = new char[ROWS][COLUMNS];
    private boolean player1Turn = true;

    public ConnectFour() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                board[row][col] = EMPTY;
            }
        }
    }

    public void printBoard() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                System.out.print("|" + board[row][col]);
            }
            System.out.println("|");
        }
        System.out.println(" 1 2 3 4 5 6 7");
    }

    public boolean dropPiece(int column) {
        if (column < 0 || column >= COLUMNS || board[0][column] != EMPTY) {
            return false; // Invalid move
        }

        int row = ROWS - 1;
        while (row >= 0 && board[row][column] != EMPTY) {
            row--;
        }

        board[row][column] = player1Turn ? PLAYER1 : PLAYER2;
        player1Turn = !player1Turn;
        return true;
    }

    public boolean isGameOver() {
        // Check for a win
        char currentPlayer = player1Turn ? PLAYER2 : PLAYER1;
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                if (board[row][col] == currentPlayer &&
                    (checkHorizontal(row, col, currentPlayer) ||
                    checkVertical(row, col, currentPlayer) ||
                    checkDiagonal(row, col, currentPlayer))) {
                    return true;
                }
            }
        }

        // Check for a draw
        for (int col = 0; col < COLUMNS; col++) {
            if (board[0][col] == EMPTY) {
                return false; // There's an empty cell, the game is not a draw yet.
            }
        }

        return true; // All cells are filled, and no player has won; it's a draw.
    }

    private boolean checkHorizontal(int row, int col, char player) {
        return col + 3 < COLUMNS &&
                board[row][col + 1] == player &&
                board[row][col + 2] == player &&
                board[row][col + 3] == player;
    }

    private boolean checkVertical(int row, int col, char player) {
        return row + 3 < ROWS &&
                board[row + 1][col] == player &&
                board[row + 2][col] == player &&
                board[row + 3][col] == player;
    }

    private boolean checkDiagonal(int row, int col, char player) {
        return row + 3 < ROWS &&
                col + 3 < COLUMNS &&
                board[row + 1][col + 1] == player &&
                board[row + 2][col + 2] == player &&
                board[row + 3][col + 3] == player;
    }

    public static void main(String[] args) {
        ConnectFour game = new ConnectFour();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            game.printBoard();

            char currentPlayer = game.player1Turn ? PLAYER1 : PLAYER2;
            System.out.print("Player " + currentPlayer + ", enter column (1-7): ");
            
            int column = scanner.nextInt() - 1;

            if (column >= 0 && column < COLUMNS && game.dropPiece(column)) {
                if (game.isGameOver()) {
                    game.printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        scanner.close();
    }
}
