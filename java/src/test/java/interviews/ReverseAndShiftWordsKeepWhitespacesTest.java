package interviews;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseAndShiftWordsKeepWhitespacesTest {

  ReverseAndShiftWordsKeepWhitespaces solution = new ReverseAndShiftWordsKeepWhitespaces();

  @Test
  public void test_reverseAndShift() {
    String test = "  olleh   dlrow ah    ";
    assertEquals("  ha   hello world    ", solution.reverseAndShift(test));
  }

  @Test
  public void test_no_leading_spaces() {
    String test = "hello there  ";
    assertEquals("ereht olleh  ", solution.reverseAndShift(test));
  }

  @Test
  public void test_no_trailing_spaces() {
    String test = "  heh oh";
    assertEquals("  ho heh", solution.reverseAndShift(test));
  }

  @Test
  public void test_empty_string() {
    String test = "";
    assertEquals("", solution.reverseAndShift(test));
  }

  @Test
  public void test_spaces_only() {
    String test = "   ";
    assertEquals("   ", solution.reverseAndShift(test));
  }

  @Test
  public void test_single_char() {
    String test = " a  b   c     ";
    assertEquals(" c  a   b     ", solution.reverseAndShift(test));
  }

  @Test
  public void test_one_word() {
    String test = " test  ";
    assertEquals(" tset  ", solution.reverseAndShift(test));
  }
}