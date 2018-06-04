package jewels_and_stones_711;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  @Test
  public void getJewelsCount() {
    assertEquals(new Solution().getJewelsArray("zxc", "asdzsasdc"), 2);
  }
}