package book;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressionTest {

  StringCompression solution = new StringCompression();

  @Test
  public void testCom () {
    assertEquals("a2b1c5a3", solution.compress("aabcccccaaa"));
  }

  @Test
  public void testSameLetters () {
    assertEquals("a3b3c3", solution.compress("aaabbbccc"));
  }

  @Test
  public void testEmpty () {
    assertEquals("", solution.compress(""));
  }

  @Test
  public void testOneLetter() {
    assertEquals("a1", solution.compress("a"));
  }

}