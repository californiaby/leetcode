package Merge_k_Sorted_Lists_23;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void mergeKLists() {
    ListNode[] arr = new ListNode[] {
            new ListNode(1).add(4).add(8),
            new ListNode(2).add(3).add(10),
            new ListNode(5).add(6)
    };

    ListNode ans = new ListNode(1).add(2).add(3).add(4).add(5).add(6).add(8).add(10);

    assertEquals(ans, solution.mergeKLists(arr));
  }

  @Test
  public void leet() {
    ListNode[] arr = new ListNode[] { null };

    assertEquals(null, solution.mergeKLists(arr));
  }
}