package rotated_digits_788;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void rotatedDigits() {
    assertEquals(4, solution.rotatedDigits(10));
  }

  @Test
  public void rotate25() {
    assertEquals(12, solution.rotatedDigits(25));
  }
}