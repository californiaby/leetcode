package reverse_string_344;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test1() {
    assertEquals(solution.reverseString("hello"), "olleh");
  }

  @Test
  public void testPointer() {
    assertEquals(solution.reversePointer("hello"), "olleh");
  }

  @Test
  public void testInplace() {
    assertEquals(solution.reverseInplace("hello"), "olleh");
  }

  @Test
  public void testRecursive() {
    assertEquals(solution.reverseRecursive("hello"), "olleh");
  }

}