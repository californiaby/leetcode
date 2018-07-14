package Valid_Anagram_242;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void isAnagram() {

    String s = "asdfg";
    String t = "asgfd";

    assertTrue(solution.isAnagram(s, t));
  }

  @Test
  public void first() {

    String s = "aasdf";
    String t = "sdada";

    assertFalse(solution.isAnagram(s, t));
  }

  @Test
  public void last() {

    String s = "";
    String t = "asgfd";

    assertFalse(solution.isAnagram(s, t));
  }
}