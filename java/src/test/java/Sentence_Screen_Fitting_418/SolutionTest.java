package Sentence_Screen_Fitting_418;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void wordsTyping() {
    String[] sentence = new String[] {"a", "bc", "def", "g"};
    assertEquals(2, solution.wordsTyping(sentence, 5, 6));
  }
}