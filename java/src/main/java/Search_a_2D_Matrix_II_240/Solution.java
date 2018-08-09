package Search_a_2D_Matrix_II_240;

/*
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
- Integers in each row are sorted in ascending from left to right.
- Integers in each column are sorted in ascending from top to bottom.
 */

public class Solution {

  /*
  Solutions:
  1. Brute force: iterate over the whole matrix, .check each value
  2. Brute + binary: iterate through rows, use binary search for each
  3. Start in bottom left corner, check value and move up or right
   */
  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0) return false;

    int row = matrix.length - 1;
    int col = 0;

    while (row >= 0 && col <= matrix[0].length - 1) {
      if (matrix[row][col] > target) {
        row--;
      } else if (matrix[row][col] < target) {
        col++;
      } else {
        return true;
      }
    }

    return false;
  }

}
