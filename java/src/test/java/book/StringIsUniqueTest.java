package book;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringIsUniqueTest {

  StringProblem stringProblem = new StringProblem();

  @Test
  public void testPositive() {
    assertTrue(stringProblem.isUnique("qwerty"));
  };

  @Test
  public void testNegative() {
    assertFalse(stringProblem.isUnique("ada"));
  }

  @Test
  public void testNull() {
    assertFalse(stringProblem.isUnique(null));
  }

  @Test
  public void testEmpty() {
    assertFalse(stringProblem.isUnique(""));
  }

}