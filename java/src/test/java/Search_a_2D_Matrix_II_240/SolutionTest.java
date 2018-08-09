package Search_a_2D_Matrix_II_240;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  int[][] matrix = new int[][] {
          {10,20,30,40,50},
          {12,22,32,42,52},
          {14,24,34,44,54},
          {16,26,36,46,56},
          {18,31,80,90,99}
  };

  @Test
  public void searchMatrix() {
    assertTrue(solution.searchMatrix(matrix, 22));
  }

  @Test
  public void search_99() {
    assertTrue(solution.searchMatrix(matrix, 99));
  }

  @Test
  public void search_98() {
    assertFalse(solution.searchMatrix(matrix, 98));
  }

  @Test
  public void leet() {
    int[][] m = new int[][] {{1,1}};
    assertFalse(solution.searchMatrix(m, 2));
  }
}