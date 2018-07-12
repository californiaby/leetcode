package Minimum_Path_Sum_64;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void minPathSum() {
    int[][] arr = new int[][] {
            {1,3,4,8},
            {3,2,2,4},
            {5,7,1,9},
            {2,3,2,3}
    };

    assertEquals(14, solution.minPathSum(arr));
  }
}