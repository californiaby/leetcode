package Longest_Substring_Without_Repeating_Characters_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void lengthOfLongestSubstring() {
    String s = "abcbdeabca";

    assertEquals(6, solution.lengthOfLongestSubstring(s));
  }

  @Test
  public void mine() {
    String s = "abcbdeabca";

    assertEquals(5, solution.mine(s));
  }

  @Test
  public void leet() {
    String s = "aab";

    assertEquals(2, solution.mine(s));
  }
}