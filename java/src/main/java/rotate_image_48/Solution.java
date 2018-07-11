package rotate_image_48;

public class Solution {

  public void rotate(int[][] matrix) {

    int n = matrix.length;
    for (int i = 0; i < n/2; i++) {
      for (int j = i; j < n-i-1; j++) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[n - j - 1][i];
        matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
        matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
        matrix[j][n - i - 1] = tmp;
      }
    }

    // if n is even, all layers have been rotated, otherwise no need to touch middle cell
  }

}
