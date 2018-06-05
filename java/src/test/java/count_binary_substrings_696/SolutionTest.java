package count_binary_substrings_696;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void countBinarySubstrings() {
    assertEquals(5, solution.countBinarySubstrings("010101"));
  }

  @Test
  public void countBinarySubstringsTwo() {
    assertEquals(3, solution.countBinarySubstrings("000111"));
  }

  @Test
  public void countBinarySubstringsThree() {
    assertEquals(6, solution.countBinarySubstrings("000111000"));
  }

  @Test
  public void countBinarySubstringsSingle() {
    assertEquals(0, solution.countBinarySubstrings("1"));
  }

  @Test
  public void countBinarySubstringsNil() {
    assertEquals(0, solution.countBinarySubstrings(""));
  }
}