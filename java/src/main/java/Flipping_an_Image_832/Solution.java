package Flipping_an_Image_832;

/*

Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
For example, inverting [0, 1, 1] results in [1, 0, 0].
 */

public class Solution {

  public int[][] flipAndInvertImage(int[][] A) {
    doFlip(A);
    doInvert(A);

    return A;
  }

  private void doFlip(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {      // for each row
      int n = arr[i].length;                    // get number of columns
      for (int j = 0; j < n / 2; j++) {         // iterate to the middle of row
        int temp = arr[i][j];
        arr[i][j] = arr[i][n - 1 - j];
        arr[i][n - 1 - j] = temp;
      }
    }
  }

  private void doInvert(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = arr[i][j] == 0 ? 1 : 0;
      }
    }
  }

}
