package N_Queens_51;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<List<String>> solveNQueens(int n) {
    List<List<String>> ans = new ArrayList();
    if (n <= 0) return ans;

    int[] columns = new int[n];
    for (int i = 0; i < columns.length; i++) columns[i] = -1;

    doDFS(0, columns, ans, n);

    return ans;
  }

  private void doDFS(int row, int[] columns, List<List<String>> ans, int n) {
    if (row == n) {   // Reached end of rows
      List<String> solution = generateSolution(columns, n);
      ans.add(solution);
    } else {          // For each row try a column
      for (int col = 0; col < n; col++) {
        if (isValidLocation(columns, row, col, n)) {
          columns[row] = col;
          doDFS(row + 1, columns, ans, n);
          // No need to remove as we'll overwrite the value for each row until row == 8
        }
      }
    }
  }

  private boolean isValidLocation(int[] columns, int currentRow, int currentCol, int n) {
    for (int row = 0; row < currentRow; row++) {
      int col = columns[row];

      // Check that previous row does not have the same column occupied
      if (col == currentCol) return false;

      // Check that previous Queen and current aren't on the sami diagonal
      int colDist = Math.abs(currentCol - col);
      int rowDist = Math.abs(currentRow - row);
      if (colDist == rowDist) return false;
    }
    return true;
  }

  private List<String> generateSolution(int[] columns, int n) {
    List<String> list = new ArrayList<>();
    for (int row = 0; row < n; row++) {
      StringBuilder sb = new StringBuilder();
      for (int col = 0; col < n; col++) {
        if (columns[row] == col) {
          sb.append('Q');
        } else {
          sb.append('.');
        }
      }
      list.add(sb.toString());
    }
    return list;
  }
}
