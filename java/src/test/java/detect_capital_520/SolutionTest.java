package detect_capital_520;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void testUSA() {
    assertTrue(solution.detectCapitalUse("USA"));
  }

  @Test
  public void testleet() {
    assertTrue(solution.detectCapitalUse("leet"));
  }

  @Test
  public void testGoogle() {
    assertTrue(solution.detectCapitalUse("Google"));
  }

  @Test
  public void testNopE() {
    assertFalse(solution.detectCapitalUse("NopE"));
  }

  @Test
  public void testInverse() {
    assertFalse(solution.detectCapitalUse("iNVERSE"));
  }
}