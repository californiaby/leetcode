package island_perimeter_463;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void islandPerimeter() {
    int[][] arr = new int[4][4];
    arr[0] = new int[] {0,1,0,0};
    arr[1] = new int[] {1,1,1,0};
    arr[2] = new int[] {0,1,0,0};
    arr[3] = new int[] {1,1,0,0};

    assertEquals(16, solution.islandPerimeter(arr));
  }
}