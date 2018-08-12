package Split_Array_into_Consecutive_Subsequences_659;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void isPossible() {
    int[] arr = new int[] {1,2,3,4,4,5,6,7,8,10,11,12};

    assertTrue(solution.isPossible(arr));
  }

  @Test
  public void testFalse() {
    int[] arr = new int[] {3,4,4,5,6,7,8,10,11,12};

    assertFalse(solution.isPossible(arr));
  }

  @Test
  public void leet() {
    int[] arr = new int[] {1,2,3,3,4,4,5,5};

    assertTrue(solution.isPossible(arr));
  }

}