package longest_uncommon_subsequence_521;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void testLongAndShort() {
    assertEquals(3, solution.findLUSlength("asd", "zx"));
  }

  @Test
  public void testSameLength() {
    assertEquals(5, solution.findLUSlength("qwert", "asdfg"));
  }

  @Test
  public void testEqual() {
    assertEquals(0, solution.findLUSlength("zxc", "zxc"));
  }

  @Test
  public void testEmpty() {
    assertEquals(3, solution.findLUSlength("", "ppp"));
  }

}