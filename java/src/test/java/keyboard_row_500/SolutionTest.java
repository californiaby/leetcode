package keyboard_row_500;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test1() {
    String[] original = {"Alaska", "Hello", "Dad", "Peace"};
    String[] expected = {"Alaska", "Dad"};

    assertArrayEquals(solution.findWords(original), expected);
  }

  @Test
  public void testEmpty() {
    String[] original = new String[0];
    String[] expected = new String[0];

    assertArrayEquals(solution.findWords(original), expected);
  }

}