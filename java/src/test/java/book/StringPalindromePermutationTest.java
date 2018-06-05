package book;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringPalindromePermutationTest {

  StringPalindromePermutation solution = new StringPalindromePermutation();

  @Test
  public void palindromePermutation() {
    assertTrue(solution.isPermutation("asdas"));
  }

  @Test
  public void palindromePermutationFalse() {
    assertFalse(solution.isPermutation("asd"));
  }

  @Test
  public void palindromePermutationEmpty() {
    assertTrue(solution.isPermutation(""));
  }
}