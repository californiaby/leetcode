package most_common_word_819;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test_helloWorld() {
    assertEquals("hello", solution.mostCommonWord("Hello my friend, of my hello my!", new String[] {"my"}));
  }
}