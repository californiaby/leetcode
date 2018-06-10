package string_compression_443;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void compress() {
    assertEquals(6, solution.compress(new char[] {'a', 'a', 'b', 'b', 'b', 'c', 'd'}));
  }
}