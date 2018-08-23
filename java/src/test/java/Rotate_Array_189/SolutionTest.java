package Rotate_Array_189;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void rotate() {
    int[] nums = new int[] {0,1,2,3,4};
    int k = 2;
    int[] ans = new int [] {3,4,0,1,2};
    solution.rotate(nums, k);

    assertArrayEquals(ans, nums);
  }
}