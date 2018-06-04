package book;

import org.junit.Test;

import static org.junit.Assert.*;

public class StingOneWayTest {

  StringOneWay solution = new StringOneWay();

  @Test
  public void testReplacement () {
    assertTrue(solution.isOneWayEdit("test", "tezt"));
  }

  @Test
  public void testAddition () {
    assertTrue(solution.isOneWayEdit("test", "testo"));
  }

  @Test
  public void testRemoval () {
    assertTrue(solution.isOneWayEdit("test", "tes"));
  }

  @Test
  public void testAdditionMiddle () {
    assertTrue(solution.isOneWayEdit("test", "tespt"));
  }

  @Test
  public void testRemovalMiddle () {
    assertTrue(solution.isOneWayEdit("test", "tst"));
  }

  @Test
  public void testEmptyString () {
    assertTrue(solution.isOneWayEdit("", ""));
    assertTrue(solution.isOneWayEdit("", "1"));
    assertTrue(solution.isOneWayEdit("1", ""));
  }

  @Test
  public void testNegative () {
    assertFalse(solution.isOneWayEdit("test", "testaa"));
    assertFalse(solution.isOneWayEdit("test", "etst"));
  }

}