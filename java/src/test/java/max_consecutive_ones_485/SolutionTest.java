package max_consecutive_ones_485;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void findMaxConsecutiveOnes() {
    int[] arr = new int[] {1,1,1,0,0,1,0,0,1,1,0};
    assertEquals(3, solution.findMaxConsecutiveOnes(arr));
  }

  @Test
  public void test_empty() {
    int[] arr = new int[] {};
    assertEquals(0, solution.findMaxConsecutiveOnes(arr));
  }

  @Test
  public void test_zero() {
    int[] arr = new int[] {0};
    assertEquals(0, solution.findMaxConsecutiveOnes(arr));
  }

  @Test
  public void test_ones() {
    int[] arr = new int[] {1,1,1};
    assertEquals(3, solution.findMaxConsecutiveOnes(arr));
  }
}