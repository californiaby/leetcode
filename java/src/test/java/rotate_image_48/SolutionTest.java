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
}