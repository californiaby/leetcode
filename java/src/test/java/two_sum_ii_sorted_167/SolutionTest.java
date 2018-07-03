package two_sum_ii_sorted_167;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void twoSum() {
    int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
    int[] ans = new int[] {3, 7};

    assertEquals(ans, solution.twoSum(arr, 10));
  }

  @Test
  public void test_leet() {
    int[] arr = new int[] {2,7,11,15};
    int[] ans = new int[] {1, 2};

    assertEquals(ans, solution.twoSum(arr, 9));
  }
}