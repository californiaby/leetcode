package swap_nodes_in_pairs_24;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test_five() {
    ListNode node = new ListNode(1).add(2).add(3).add(4).add(5);
    ListNode exp = new ListNode(2).add(1).add(4).add(3).add(5);

    assertEquals(exp.toString(), solution.swapPairs(node).toString());
  }

  @Test
  public void test_four() {
    ListNode node = new ListNode(1).add(2).add(3).add(4);
    ListNode exp = new ListNode(2).add(1).add(4).add(3);

    assertEquals(exp.toString(), solution.swapPairs(node).toString());
  }

  @Test
  public void test_two() {
    ListNode node = new ListNode(1).add(2);
    ListNode exp = new ListNode(2).add(1);

    assertEquals(exp.toString(), solution.swapPairs(node).toString());
  }

  @Test
  public void test_one() {
    ListNode node = new ListNode(1);
    ListNode exp = new ListNode(1);

    assertEquals(exp.toString(), solution.swapPairs(node).toString());
  }

  @Test
  public void test_null() {
    ListNode node = null;

    assertEquals(null, solution.swapPairs(node));
  }
}