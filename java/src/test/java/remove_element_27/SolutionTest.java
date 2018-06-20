package remove_element_27;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void removeElement() {
    int[] arr = new int[] {1, 2, 3, 1, 2, 1};
    int length = 3;

    assertEquals(length, solution.removeElement(arr, 1));
  }
}