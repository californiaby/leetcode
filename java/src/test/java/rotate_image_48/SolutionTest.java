package rotate_image_48;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void rotate() {
    int[][] arr = new int[3][3];
    arr[0] = new int[] {1,2,3};
    arr[1] = new int[] {4,5,6};
    arr[2] = new int[] {7,8,9};

    int[][] exp = new int[3][3];
    exp[0] = new int[] {7,4,1};
    exp[1] = new int[] {8,5,2};
    exp[2] = new int[] {9,6,3};

    solution.rotate(arr);

    assertEquals(exp, arr);
  }

  @Test
  public void leet() {
    int[][] arr = new int[4][4];
    arr[0] = new int[] {5,1,9,11};
    arr[1] = new int[] {2,4,8,10};
    arr[2] = new int[] {13,3,6,7};
    arr[3] = new int[] {15,14,12,16};

    int[][] exp = new int[4][4];
    exp[0] = new int[] {15,13,2,5};
    exp[1] = new int[] {14,3,4,1};
    exp[2] = new int[] {12,6,8,9};
    exp[3] = new int[] {16,7,10,11};

    solution.rotate(arr);

    assertEquals(exp, arr);
  }
}