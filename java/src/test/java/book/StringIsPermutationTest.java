package book;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringIsPermutationTest {

  StringProblem stringProblem = new StringProblem();

  @Test
  public void testPositive() {
    assertTrue(stringProblem.isPermutation("asd", "das"));
  };

  @Test
  public void testNegative() {
    assertFalse(stringProblem.isPermutation("zxc", "zxe"));
  }

  @Test
  public void testNull() {
    assertFalse(stringProblem.isPermutation(null, null));
  }

  @Test
  public void testEmpty() {
    assertTrue(stringProblem.isPermutation("", ""));
  }

}