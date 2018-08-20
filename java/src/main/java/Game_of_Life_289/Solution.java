package Game_of_Life_289;

/*
Given a board with m by n cells, each cell has an initial state live (1) or dead (0).
Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules:

1. Any live cell with fewer than two live neighbors dies, as if caused by under-population.
2. Any live cell with two or three live neighbors lives on to the next generation.
3. Any live cell with more than three live neighbors dies, as if by over-population..
4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
Write a function to compute the next state (after one update) of the board given its current state. The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously.
 */

public class Solution {
  public void gameOfLife(int[][] board) {
    if (board == null || board.length == 0) return;

    int[][] next = new int[board.length][board[0].length];

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        int n = countNeighboors(board, i, j);

        if (board[i][j] == 0) {
          // Handle dead
          if (n == 3) {
            next[i][j] = 1;
          } else {
            next[i][j] = 0;
          }
        } else if (board[i][j] == 1) {
          // Handle live
          if (n < 2 || n > 3) {
            next[i][j] = 0;
          } else {
            next[i][j] = 1;
          }
        }

      }
    }

    // Repopulate the original
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        board[i][j] = next[i][j];
      }
    }

  }

  private int countNeighboors(int[][] board, int i, int j) {
    int minRow = Math.max(i - 1, 0);
    int maxRow = Math.min(i + 1, board.length - 1);
    int minCol = Math.max(j - 1, 0);
    int maxCol = Math.min(j + 1, board[0].length - 1);
    int n = 0;

    for (int row = minRow; row <= maxRow; row++) {
      for (int col = minCol; col <= maxCol; col++) {
        if (board[row][col] == 1 && !(row == i && col == j)) n++;
      }
    }

    return n;
  }

  public void gameOfLifeBinary(int[][] board) {
    if (board == null || board.length == 0) return;

    // We'' use binary code to store current and next state. 0 == dead, 1 == live. 1st bit == next, 2nd == current
    // Examples: 01: currently live, next dead. 11: currently live, next live.
    // With this format all initial values are 00 or 01 - i.e. only with current state.
    // 00 == 0; 01 == 1; 10 == 2; 11 = 3.

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        int n = countNeighboors(board, i, j);

        if (board[i][j] == 1 && n >= 2 && n <= 3) {
          board[i][j] = 3;
        } else if (board[i][j] == 0 && n == 3) {
          board[i][j] = 2;
        }
      }
    }

    // Iterate over board again and remove the last bit
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        board[i][j] >>= 1;
      }
    }

  }
}

