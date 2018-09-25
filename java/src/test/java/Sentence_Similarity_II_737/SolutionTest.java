package Sentence_Similarity_II_737;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void areSentencesSimilarTwo() {
    String[] words1 = new String[] {"great", "acting", "skills"};
    String[] words2 = new String[] {"fine", "drama", "talent"};
    String[][] pairs = new String[][] {
            {"great", "good"},
            {"fine", "good"},
            {"acting", "drama"},
            {"skills", "talent"}
    };

    assertTrue(solution.areSentencesSimilarTwo(words1, words2, pairs));

  }
}