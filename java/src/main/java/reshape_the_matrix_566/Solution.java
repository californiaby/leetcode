package reshape_the_matrix_566;

public class Solution {

  public int[][] matrixReshape(int[][] nums, int r, int c) {

    // if numbers do not match size of original matrix - do nothing
    if (nums.length == 0 || r * c != nums.length * nums[0].length)  return nums;

    int row = 0;
    int col = 0;
    int[][] ans = new int[r][c];

    // iterate through original array, use pointer for new array
    for (int i = 0; i < nums.length; i ++) {
      for (int j = 0; j < nums[0].length; j++) {
        ans[row][col] = nums[i][j];
        col++;
        if (col == c) {
          row++;
          col = 0;
        }
      }
    }
    return ans;
  }

}
