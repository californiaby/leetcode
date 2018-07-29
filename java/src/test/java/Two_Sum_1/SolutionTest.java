package Two_Sum_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void twoSum() {
    int[] arr = new int[] {2,7,11,15};
    int[] ans = new int[] {0,1};

    assertEquals(ans, solution.twoSum(arr, 9));
  }
}