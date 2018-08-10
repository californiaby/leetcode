package Top_K_Frequent_Elements_347;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void topKFrequent() {
    int[] arr = new int[] {1, 2, 3, 1, 2, 1, 3, 1, 4, 4, 4, 4};
    List<Integer> ans = Arrays.asList(1, 4);

    assertEquals(ans, solution.topKFrequent(arr, 2));
  }

  @Test
  public void topKFrequentTreeMap() {
    int[] arr = new int[] {1, 2, 3, 1, 2, 1, 3, 1, 4, 4, 4, 4};
    List<Integer> ans = Arrays.asList(1, 4);

    assertEquals(ans, solution.topKFrequentHeap(arr, 2));
  }
}