package length_of_last_word_58;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void lengthOfLastWord() {
    String s = "Hello world!";
    assertEquals(6, solution.lengthOfLastWord(s));
  }

  @Test
  public void test_empty() {
    String s = "";
    assertEquals(0, solution.lengthOfLastWord(s));
  }

  @Test
  public void test_no_spaces() {
    String s = "zxc";
    assertEquals(3, solution.lengthOfLastWord(s));
  }

  @Test
  public void test_only_spaces() {
    String s = "   ";
    assertEquals(0, solution.lengthOfLastWord(s));
  }
}