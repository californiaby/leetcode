package Maximum_Product_Subarray_152;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void one_negative() {
    int[] arr = new int[] {2,3,-2,4};
    assertEquals(6, solution.maxProduct(arr));
  }

  @Test
  public void two_negatives() {
    int[] arr = new int[] {2,3,-2,4};
    assertEquals(6, solution.maxProduct(arr));
  }

  @Test
  public void zero() {
    int[] arr = new int[] {-2,0,-1};
    assertEquals(0, solution.maxProduct(arr));
  }
}