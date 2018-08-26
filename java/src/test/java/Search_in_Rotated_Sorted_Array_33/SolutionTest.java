package Search_in_Rotated_Sorted_Array_33;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void search() {
    int[] arr = new int[] {8,9,1,2,3,4,5,6,7};
    assertEquals(3, solution.search(arr, 2));
  }

  @Test
  public void leet() {
    int[] arr = new int[] {4,5,6,7,0,1,2};
    assertEquals(-1, solution.search(arr, 3));
  }
}
