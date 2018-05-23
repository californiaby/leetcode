package unique_morse_code_words_804;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test1() {
    String[] original = new String[] {"a", "gin", "zen", "gig", "msg"};
    int expected = 3;

    assertEquals(solution.uniqueMorseRepresentations(original), expected);
  };

}