package Number_of_Islands_200;

/*
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.

Example 1:

11110
11010
11000
00000

Output: 1
 */

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
  public int numIslands(char[][] grid) {

    if (grid == null || grid.length == 0) return 0;

    int n = grid.length;      // height, i
    int m = grid[0].length;   // width, j
    int islands = 0;
    Queue<Cell> q = new LinkedList<>();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {

        // if found the island
        if (grid[i][j] == '1') {
          q.add(new Cell(i, j));

          // run BFS
          while(!q.isEmpty()) {
            Cell cell = q.poll();
            checkSurroundings(grid, cell.x, cell.y, q);
          }

          islands++;
        }
      }
    }

    return islands;
  }

  private class Cell {
    int x;
    int y;

    public Cell(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  private void checkSurroundings(char[][] grid, int i, int j, Queue<Cell> q) {
    int n = grid.length;      // height, i
    int m = grid[0].length;   // width, j

    // check bottom cell
    if (i+1 < n && grid[i+1][j] == '1') {
      q.add(new Cell(i+1, j));
      grid[i+1][j] = '0';
    }

    // check right cell
    if (j+1 < m && grid[i][j+1] == '1') {
      q.add(new Cell(i, j+1));
      grid[i][j+1] = '0';
    }

    // check left cell
    if (j-1 >= 0 && grid[i][j-1] == '1') {
      q.add(new Cell(i, j-1));
      grid[i][j-1] = '0';
    }

    // check upper cell
    if (i-1 >= 0 && grid[i-1][j] == '1') {
      q.add(new Cell(i-1, j));
      grid[i-1][j] = '0';
    }
  }
}
