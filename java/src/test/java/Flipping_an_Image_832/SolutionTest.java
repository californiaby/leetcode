package Flipping_an_Image_832;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void flipAndInvertImage() {
    int[][] arr = new int[][] {
            {1,0,0},
            {0,1,0},
            {1,1,0}
    };

    int[][] ans = new int[][] {
            {1,1,0},
            {1,0,1},
            {1,0,0}
    };

    assertEquals(ans, solution.flipAndInvertImage(arr));
  }
}