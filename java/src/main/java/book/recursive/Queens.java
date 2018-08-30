package book.recursive;

import java.util.ArrayList;
import java.util.List;

public class Queens {

  public List<Integer[]> magicQueens() {
    List<Integer[]> ans = new ArrayList<>();

    for (int row = 0; row <= 8; row++) {
      placeQueens(row, new Integer[8], ans);
    }

    return ans;
  }

  /**
   * Generates all possible combinations of Queens placements for a given row.
   * @param row
   * @param columns
   * @param ans
   */
  private void placeQueens(int row, Integer[] columns, List<Integer[]> ans) {
    if (row == 8) {               // Done traversing
      ans.add(columns.clone());   // Creates a copy
    } else {
      for (int col = 0; col < 8; col++) {
        if (checkPlace(columns, row, col)) {
          columns[row] = col;
          placeQueens(row + 1, columns, ans);
        }
      }
    }
  }

  /**
   * Checks if it's possible to place a in already generated combinations of locations with given col and row.
   * @param columns
   * @param currentRow
   * @param currentCol
   * @return
   */
  private boolean checkPlace(Integer[] columns, int currentRow, int currentCol) {
    for (int row = 0; row < currentRow; row++) {
      int col = columns[row];

      // Check if they are in the same column
      if (col == currentCol) return false;

      // Check diagonals
      int colDistance = Math.abs(col - currentCol);
      int rowDistance = Math.abs(row - currentRow);
      if (colDistance == rowDistance) return false;

      // No need to check for same row as we have populated only previous rows
    }
    return true;
  }

}
