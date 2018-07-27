package Moving_Average_from_Data_Stream_346;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovingAverageTest {

  @Test
  public void next() {
    MovingAverage solution = new MovingAverage(2);
    assertEquals(1.00, solution.next(1), 0);
    assertEquals(1.50, solution.next(2), 0);
    assertEquals(2.50, solution.next(3), 0);
    assertEquals(3.50, solution.next(4), 0);
  }
}