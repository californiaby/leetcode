package number_of_segments_in_a_string_434;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void countSegments() {
    assertEquals(5, solution.countSegments("Hello, my, name is Jack!"));
  }
}