package Permutation_in_String_567;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void checkInclusion() {
    String s1 = "ab";
    String s2 = "zzzazzbzab";

    assertTrue(solution.checkInclusion(s1, s2));
  }
}