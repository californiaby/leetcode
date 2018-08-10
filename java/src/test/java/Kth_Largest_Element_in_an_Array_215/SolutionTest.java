package Kth_Largest_Element_in_an_Array_215;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void findKthLargest() {
    int[] arr = new int[] {3,2,1,5,6,4};
    int k = 2;

    assertEquals(5, solution.findKthLargest(arr, k));
  }
}