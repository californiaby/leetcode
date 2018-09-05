package Minimum_Window_Substring_76;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void minWindow() {
    String s = "ADOBECODEBANC";
    String t = "ABC";
    String ans = "BANC";

    assertEquals(ans, solution.minWindow(s, t));
  }
}