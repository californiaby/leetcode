package first_unique_character_in_string_387;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void firstUniqChar() {
    assertEquals(0, solution.firstUniqChar("leetcode"));
  }

  @Test
  public void firstUniqCharAgain() {
    assertEquals(3, solution.firstUniqChar("aadchd"));
  }

  @Test
  public void none() {
    assertEquals(-1, solution.firstUniqChar("qweqwe"));
  }
}