package rotate_image_48;

public class Solution {

  public void rotate(int[][] matrix) {

    int n = matrix.length;
    if (n <= 1) return;

    for (int layer = 0; layer < n / 2; layer++ ) {
      int first = layer;
      int last = n - 1 - layer;

      for (int i = first; i < last; i++) {
        int top = matrix[first][i];
         matrix[first][i] = matrix[last - i][first];
         matrix[last - i][first] = matrix[last][last - i];
         matrix[last][last - i] = matrix[i][last];
         matrix[i][last] = top;
      }
    }

    // if n is even, all layers have been rotated, otherwise no need to touch middle cell
  }

}
