package Bulls_and_Cows_299;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void getHint() {

    String s1 = "1122";
    String s2 = "2211";
    String ans = "0A2B";

    assertEquals(ans, solution.getHint(s1, s2));
  }
}