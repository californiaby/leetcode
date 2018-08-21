package String_to_Integer_atoi_8;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void myAtoi() {
    String s = "+";
    assertEquals(0, solution.myAtoi(s));
  }
}