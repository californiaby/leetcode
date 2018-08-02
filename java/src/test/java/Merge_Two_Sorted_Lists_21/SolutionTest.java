package Merge_Two_Sorted_Lists_21;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void mergeTwoLists() {
    ListNode l1 = new ListNode(1).add(2).add(6);
    ListNode l2 = new ListNode(1).add(3).add(4);
    ListNode expected = new ListNode(1).add(1).add(2).add(3).add(4).add(6);

    assertEquals(expected.toString(), solution.mergeTwoLists(l1, l2).toString());
  }
}