package spiral_matrix_ii_59;

/*

Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
Input: 3
Output:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]

 */

public class Solution {

  public int[][] generateMatrix(int n) {

    int[][] ans = new int[n][n];
    if (n < 1) return ans;

    int mid = n / 2;
    int x = 1;

    for (int layer = 0; layer < mid; layer++) {
      int first = layer;
      int last = n - 1 - layer;           // not included in each layer

      for (int i = first; i < last; i++) ans[first][i] = x++; // top
      for (int i = first; i < last; i++) ans[i][last] = x++; // right
      for (int i = last; i > first; i--) ans[last][i] = x++; // bottom
      for (int i = last; i > first; i--) ans[i][first] = x++; // left;
    }

    // check case with even n
    if (n % 2 != 0) ans[mid][mid] = n * n;

    return ans;
  }

}
