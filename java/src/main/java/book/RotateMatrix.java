package book;

public class RotateMatrix {

  public  boolean rotate(int[][] matrix) {

    if (matrix.length == 0 || matrix.length != matrix[0].length) { return false; }

    int n = matrix.length;

    for (int layer = 0; layer < n / 2; layer++) {
      int first = layer;
      int last = n - 1 - layer;

      for (int i = first; i < last; i++) {
        int offset = i - first;

        int top = matrix[first][i]; // save the top value

        matrix[first][i] = matrix[last - offset][i]; // left > top
        matrix[last - offset][i] = matrix[last][last-offset]; // bottom > left
        matrix[last][last-offset] = matrix[i][last]; // right > bottom
        matrix[i][last] = top; // rop > right
      }
    }

    return true;
  }

}
