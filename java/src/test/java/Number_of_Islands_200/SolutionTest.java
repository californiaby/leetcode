package Number_of_Islands_200;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  /*
  11110
  11010
  11000
  00000
  */

  @Test
  public void numIslands() {
    char[][] arr = new char[][] {
            {'1','1','0','0'},
            {'0','1','0','1'},
            {'0','1','1','0'},
            {'0','1','0','1'},
            {'1','0','0','1'},
    };

    assertEquals(4, solution.numIslands(arr));
  }

  @Test
  public void oneTwo() {
    char[][] arr = new char[][] {
            {'1','1','1'},
            {'0','1','0'},
            {'1','1','1'},

    };

    assertEquals(1, solution.numIslands(arr));
  }
}