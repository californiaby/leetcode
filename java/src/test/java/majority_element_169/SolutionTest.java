package majority_element_169;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void majorityElement() {
    int[] arr = new int[] {1, 2, 3, 1, 3, 5, 5, 5, 5, 5};

    assertEquals(5, solution.majorityElement(arr));
  }
}