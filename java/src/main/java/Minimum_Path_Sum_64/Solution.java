package Minimum_Path_Sum_64;

/*

Given a m x n grid filled with non-negative numbers, find a path from top left to bottom
which minimizes the sum of all numbers along its path.
Note: You can only move either down or right at any point in time.

Input:
[
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
Output: 7
Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 */

public class Solution {

  public int minPathSum(int[][] grid) {

    int n = grid.length - 1;
    int m = grid[0].length - 1;

    for (int i = n; i >= 0; i--) {
      for (int j = m; j >= 0; j--) {

        if (i < n && j < m) {

          // not the lowest row or rightmost column - get min of neighbors + current weight
          grid[i][j] = grid[i][j] + Math.min(grid[i+1][j], grid[i][j+1]);

        } else if (i == n && j < m) {

          // lowest row - get only weight of right neighbor, except for bottom right corner
          grid[i][j] = grid[i][j] + grid[i][j+1];

        } else if (j == m && i < n) {

          // rightmost column - get only weight of lower neighbor, except for bottom right corner
          grid[i][j] = grid[i][j] + grid[i+1][j];

        }

      }
    }

    return grid[0][0];
  }

}
