package spiral_matrix_ii_59;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test_odd() {
    int[][] exp = new int[3][3];
    exp[0] = new int[] {1, 2, 3};
    exp[1] = new int[] {8, 9, 4};
    exp[2] = new int[] {7, 6, 5};

    assertEquals(exp, solution.generateMatrix(3));
  }

  @Test
  public void test_even() {
    int[][] exp = new int[2][2];
    exp[0] = new int[] {1, 2};
    exp[1] = new int[] {4, 3};

    assertEquals(exp, solution.generateMatrix(2));
  }

  @Test
  public void test_zero() {
    int[][] exp = new int[0][0];

    assertEquals(exp, solution.generateMatrix(0));
  }

  @Test
  public void test_one() {
    int[][] exp = new int[1][1];
    exp[0] = new int[] {1};

    assertEquals(exp, solution.generateMatrix(1));
  }
}