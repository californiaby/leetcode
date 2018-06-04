package book;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUrlifyTest {

  StringUrlify solution = new StringUrlify();

  @Test
  public void testPositive() {
    assertEquals("Oh%20hi%20lol", solution.urlify("Oh hi lol    "));
  }

  @Test
  public void testPositiveTwo() {
    assertEquals("Hello%20my%20world", solution.urlify("Hello my world    "));
  }

  @Test
  public void testEmpty() {
    assertEquals(solution.urlify(""), "");
  }

}