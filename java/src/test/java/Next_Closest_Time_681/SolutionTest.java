package Next_Closest_Time_681;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void nextClosestTime() {
    String time = "20:08";
    String exp = "20:20";

    assertEquals(exp, solution.nextClosestTime(time));
  }

  @Test
  public void mignight() {
    String time = "00:00";
    String exp = "00:00";

    assertEquals(exp, solution.nextClosestTime(time));
  }

  @Test
  public void afternoon() {
    String time = "12:00";
    String exp = "12:01";

    assertEquals(exp, solution.nextClosestTime(time));
  }

  @Test
  public void fiftynine() {
    String time = "23:59";
    String exp = "22:22";

    assertEquals(exp, solution.nextClosestTime(time));
  }
}