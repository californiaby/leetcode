package remove_nth_node_from_end_of_list_19;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test_middle() {
    ListNode node = new ListNode(1).add(2).add(3).add(4);
    ListNode exp = new ListNode(1).add(2).add(4);

    assertEquals(exp.toString(), solution.removeNthFromEnd(node, 2).toString());
  }

  @Test
  public void test_first() {
    ListNode node = new ListNode(1).add(2).add(3);
    ListNode exp = new ListNode(1).add(2);

    assertEquals(exp.toString(), solution.removeNthFromEnd(node, 1).toString());
  }

  @Test
  public void test_last() {
    ListNode node = new ListNode(1).add(2).add(3);
    ListNode exp = new ListNode(2).add(3);

    assertEquals(exp.toString(), solution.removeNthFromEnd(node, 3).toString());
  }

  @Test
  public void test_single() {
    ListNode node = new ListNode(1);

    assertEquals(null, solution.removeNthFromEnd(node, 1));
  }

  @Test
  public void test_null() {
    assertEquals(null, solution.removeNthFromEnd(null, 1));
  }
}