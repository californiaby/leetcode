package Product_of_Array_Except_Self_238;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void productExceptSelf() {
    int[] arr = new int[] {1,2,3,4};
    int[] ans = new int[] {24,12,8,6};

    assertArrayEquals(ans, solution.productExceptSelf(arr));
  }
}