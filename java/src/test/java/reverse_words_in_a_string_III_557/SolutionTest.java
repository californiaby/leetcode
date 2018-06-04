package reverse_words_in_a_string_III_557;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test1() {
    assertEquals(solution.reverseWords(("Hello world")), "world Hello");
  }

}