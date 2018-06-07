package ransom_note_338;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void canConstruct() {
    assertTrue(solution.canConstruct("aa", "zabga"));
  }

  @Test
  public void canConstruct_false() {
    assertFalse(solution.canConstruct("abc", "abd"));
  }

  @Test
  public void canConstruct_tooLong() {
    assertFalse(solution.canConstruct("abcc", "abcdd"));
  }
}