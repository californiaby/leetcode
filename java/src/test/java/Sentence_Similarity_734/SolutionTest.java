package Sentence_Similarity_734;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void areSentencesSimilar() {
    String[] words1 = new String[] {"great", "acting", "skills"};
    String[] words2 = new String[] {"fine", "drama", "talent"};
    String[][] pairs = new String[][] {
            {"great", "fine"},
            {"acting", "drama"},
            {"skills", "talent"}
    };

    assertTrue(solution.areSentencesSimilar(words1, words2, pairs));
  }

  @Test
  public void sameWords() {
    String[] words1 = new String[] {"great"};
    String[] words2 = new String[] {"great"};
    String[][] pairs = new String[][] {};

    assertTrue(solution.areSentencesSimilar(words1, words2, pairs));
  }
}