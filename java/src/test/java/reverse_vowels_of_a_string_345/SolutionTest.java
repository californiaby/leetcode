package reverse_vowels_of_a_string_345;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test() {
    assertEquals("holle", solution.reverseVowels("hello"));
  }

  @Test
  public void testOdd() {
    assertEquals("abdei", solution.reverseVowels("ibdea"));
  }

  @Test
  public void testOne() {
    assertEquals("zxcvbnmik", solution.reverseVowels("zxcvbnmik"));
  }

}