package book;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringRotationTest {

  StringRotation solution = new StringRotation();

  @Test
  public void testPositive () {
    assertTrue(solution.isRotation("qwerty", "ertyqw"));
  }

  @Test
  public void testNegative() {
    assertFalse(solution.isRotation("asd", "asc"));
  }

  @Test
  public void testEmpty() {
    assertTrue(solution.isRotation("", ""));
  }

  @Test
  public void testDiffLength() {
    assertFalse(solution.isRotation("asd", "asdf"));
  }

}