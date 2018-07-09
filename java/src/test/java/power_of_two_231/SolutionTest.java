package power_of_two_231;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void isPowerOfTwo() {
    assertTrue(solution.isPowerOfTwo(8));
  }

  @Test
  public void negative() {
    assertFalse(solution.isPowerOfTwo(7));
  }

  @Test
  public void zero() {
    assertFalse(solution.isPowerOfTwo(0));
  }
}