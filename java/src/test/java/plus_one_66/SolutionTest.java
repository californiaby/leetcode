package plus_one_66;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void plusOne() {
    int[] arr = new int[] {1,0,1};
    int[] ans = new int[] {1,0,2};
    assertEquals(ans, solution.plusOne(arr));
  }

  @Test
  public void nine() {
    int[] arr = new int[] {9};
    int[] ans = new int[] {1,0};
    assertEquals(ans, solution.plusOne(arr));
  }
}