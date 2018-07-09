package island_perimeter_463;

/*

You are given a map in form of a two-dimensional integer grid where 1 represents land
and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally).
The grid is completely surrounded by water, and there is exactly one island (i.e., one or
more connected land cells). The island doesn't have "lakes" (water inside that isn't
connected to the water around the island). One cell is a square with side length 1.
The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

Example:
[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

Answer: 16
Explanation: The perimeter is the 16 yellow stripes in the image below:
 */

public class Solution {

  public int islandPerimeter(int[][] grid) {

    // iterate through matrix. each "land" cell with have perimeter of 4 unless it has adjacent land cell with
    // in this case for each adjacent land cell substract 1 from perimeter

    int ans = 0;

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1) {
          // found a land, add 4 to perimeter counter
          ans = ans + 4;

          // substract 1 for each land neighbor
          if (isLandCell(grid, i - 1, j)) ans--;
          if (isLandCell(grid, i + 1, j)) ans--;
          if (isLandCell(grid, i, j - 1)) ans--;
          if (isLandCell(grid, i, j + 1)) ans--;
        }
      }
    }

    return ans;
  }

  private boolean isLandCell(int[][] grid, int i, int j) {
    // out of bounds - return false
    if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return false;

    // land - return true
    if (grid[i][j] == 1) return true;

    // otherwise return false
    return false;
  }

}
