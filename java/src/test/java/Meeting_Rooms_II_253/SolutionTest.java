package Meeting_Rooms_II_253;

import org.junit.Test;
import utils.Interval;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void minMeetingRooms() {
    Interval[] times = new Interval[] {
            new Interval(10, 12),
            new Interval(9, 11),
            new Interval(8, 10),
            new Interval(15, 20),
            new Interval(12, 15)
    };

    assertEquals(2, solution.minMeetingRooms(times));
  }
}