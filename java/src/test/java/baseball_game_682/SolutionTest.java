package baseball_game_682;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void calPoints() {
    String[] arr = new String[] {"5","2","C","D","+"};
    int ans = solution.calPoints(arr);
    assertEquals(30, ans);
  }
}