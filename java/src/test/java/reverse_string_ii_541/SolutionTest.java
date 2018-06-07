package reverse_string_ii_541;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void reverseStr() {
    assertEquals("bacdfeq", solution.reverseStr("abcdefq", 2));
  }
}