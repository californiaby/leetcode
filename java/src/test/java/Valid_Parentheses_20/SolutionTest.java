package Valid_Parentheses_20;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test_valid() {
    String s = "{{[[(())]]}}";
    assertTrue(solution.isValid(s));
  }

  @Test
  public void valid_sequence() {
    String s = "{}()[(){{}}]";
    assertTrue(solution.isValid(s));
  }

  @Test
  public void test_wrong_order() {
    String s = "{[}]";
    assertFalse(solution.isValid(s));
  }

  @Test
  public void test_non_equal() {
    String s = "{{{()}}";
    assertFalse(solution.isValid(s));
  }

  @Test
  public void test_empty() {
    String s = "";
    assertTrue(solution.isValid(s));
  }

  @Test
  public void starts_with_closing() {
    String s = "}{";
    assertFalse(solution.isValid(s));
  }
}