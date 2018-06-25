package reshape_the_matrix_566;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void matrixReshape() {
    int[][] matrix = new int[2][3];
    matrix[0][0] = 1;
    matrix[0][1] = 2;
    matrix[0][2] = 3;
    matrix[1][0] = 4;
    matrix[1][1] = 5;
    matrix[1][2] = 6;

    int[][] ans =  new int [6][1];
    ans[0][0] = 1;
    ans[1][0] = 2;
    ans[2][0] = 3;
    ans[3][0] = 4;
    ans[4][0] = 5;
    ans[5][0] = 6;

    assertEquals(ans, solution.matrixReshape(matrix, 6, 1));
  }
}