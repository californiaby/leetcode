package Top_K_Frequent_Words_692;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void topKFrequent() {
    String[] s = new String[] {"hello", "world", "hello", "how", "are", "you", "how", "how"};
    List<String> exp = Arrays.asList("how", "hello");

    assertEquals(exp, solution.topKFrequent(s, 2));
  }

  @Test
  public void leet() {
    String[] s = new String[] {"i", "love", "leetcode", "i", "love", "coding"};
    List<String> exp = Arrays.asList("i", "love");

    assertEquals(exp, solution.topKFrequent(s, 2));
  }

}