package split_linked_list_in_parts_725;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void splitListToParts() {
    ListNode node = new ListNode(1).add(2).add(3).add(4).add(5);
    ListNode[] ans = solution.splitListToParts(node, 3);
  }

  @Test
  public void splitLong() {
    ListNode node = new ListNode(1).add(2).add(3).add(4).add(5);
    ListNode[] ans = solution.splitListToParts(node, 2);
  }

  @Test
  public void splitshort() {
    ListNode node = new ListNode(1).add(2).add(3);
    ListNode[] ans = solution.splitListToParts(node, 5);
  }

  @Test
  public void splitOne() {
    ListNode node = new ListNode(1).add(2).add(3).add(4).add(5);
    ListNode[] ans = solution.splitListToParts(node, 1);
  }

  @Test
  public void splitNull() {
    ListNode node = null;
    ListNode[] ans = solution.splitListToParts(node, 3);
  }
}