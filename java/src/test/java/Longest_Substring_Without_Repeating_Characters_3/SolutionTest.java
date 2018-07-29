package Longest_Substring_Without_Repeating_Characters_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void lengthOfLongestSubstring() {
    String s = "abcaabcbassbdjhjsgdk";

    assertEquals(6, solution.lengthOfLongestSubstring(s));
  }
}