package Course_Schedule_207;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void canFinish() {
    int k = 3;
    int[][] pre = new int[][] {
            {1,2},
            {2,0}
    };

    assertTrue(solution.canFinish(k, pre));
  }
}