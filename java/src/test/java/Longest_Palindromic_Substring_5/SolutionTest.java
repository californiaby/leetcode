package Longest_Palindromic_Substring_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void longestPalindrome() {
    String s = "babad";
    String exp = "bab";

    assertEquals(exp, solution.longestPalindrome(s));
  }

  @Test
  public void empty() {
    String s = "";
    String exp = "";

    assertEquals(exp, solution.longestPalindrome(s));
  }

  @Test
  public void nullvalue() {
    String s = null;
    String exp = "";

    assertEquals(exp, solution.longestPalindrome(s));
  }

  @Test
  public void one() {
    String s = "bac";
    String exp = "b";

    assertEquals(exp, solution.longestPalindrome(s));
  }

  @Test
  public void inTheEnd() {
    String s = "aaabbbbcbbb";
    String exp = "bbbcbbb";

    assertEquals(exp, solution.longestPalindrome(s));
  }
}