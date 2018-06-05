package book;

public class MatrixZero {

  public void setZeros(int[][] matrix) {
    boolean[] row = new boolean[matrix.length];
    boolean[] col = new boolean[matrix[0].length];

    // Iterate over matrix, for each {0} store numbers of rows and columns
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          row[i] = true;
          col[j] = true;
        }
      }
    }

    // Nullify rows
    for (int i = 0; i < row.length; i++) {
      if (row[i]) {
        for (int j = 0; j < matrix.length; j++) {
          matrix[i][j] = 0;
        }
      }
    }

    // Nullify columns
    for (int j = 0; j < col.length; j++) {
      if (col[j]) {
        for (int i = 0; i < matrix.length; i++) {
          matrix[i][j] = 0;
        }
      }
    }
  }

}
