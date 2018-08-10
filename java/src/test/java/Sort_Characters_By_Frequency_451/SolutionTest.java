package Sort_Characters_By_Frequency_451;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void frequencySort() {
    String s = "abacbccbdbc";
    String exp = "bbbbccccaad";

    assertEquals(exp, solution.frequencySort(s));
  }
}