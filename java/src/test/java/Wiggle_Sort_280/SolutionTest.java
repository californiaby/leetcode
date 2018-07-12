package Wiggle_Sort_280;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void wiggleSort() {
    int[] arr = new int[] {3,5,2,1,6,4};
    int[] exp = new int[] {3,5,1,6,2,4};

    solution.wiggleSort(arr);

    assertEquals(exp, arr);
  }
}