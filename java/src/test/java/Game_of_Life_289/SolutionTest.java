package Game_of_Life_289;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void gameOfLife() {
    int[][] board = new int[][] {
            {0,1,0,1},
            {0,0,0,0},
            {0,1,1,1},
            {1,0,0,0},
            {0,0,0,0}
    };

    solution.gameOfLife(board);
  }


  @Test
  public void leet() {
    int[][] board = new int[][]{
            {0, 1, 0},
            {0, 0, 1},
            {1, 1, 1},
            {0, 0, 0}
    };

    solution.gameOfLife(board);
  }
}