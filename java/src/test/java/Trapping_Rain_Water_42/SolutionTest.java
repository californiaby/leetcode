package Trapping_Rain_Water_42;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void trap() {
    int[] map = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};

    assertEquals(6, solution.trap(map));
  }
}