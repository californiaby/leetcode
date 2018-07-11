package spiral_matrix_54;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public List<Integer> spiralOrder(int[][] matrix) {
    List ans = new ArrayList();
    if (matrix == null || matrix.length == 0) return ans;

    // get variables that define rang of iteration for each spiral circle
    int yMax = matrix.length - 1;
    int xMax = matrix[0].length - 1;
    int yMin = 0;
    int xMin = 0;

    // cycle until min and max overlap
    while (xMin <= xMax && yMin <= yMax) {

      // add top row (including last element)
      for (int i = xMin; i <= xMax; i++) ans.add(matrix[yMin][i]);

      // add right column (excluding first element, including last)
      for (int i = yMin + 1; i <= yMax; i++) ans.add(matrix[i][xMax]);

      // check if max and min are not overlapping yet
      if (xMin < xMax && yMin < yMax) {
        // add bottom row (excluding first, excluding last)
        for (int i = xMax - 1; i > xMin; i--) ans.add(matrix[yMax][i]);

        // add left column (including first, excluding last)
        for (int i = yMax; i > yMin; i--) ans.add(matrix[i][xMin]);
      }

      // increase boundaries
      xMin++;
      yMin++;
      xMax--;
      yMax--;
    }

    return ans;
  }

}
