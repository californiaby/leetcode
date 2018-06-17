package remove_linked_list_elements_203;

import org.junit.Test;
import utils.ListNode;
import utils.ListNodeTest;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void removeElements() {
    ListNode node = new ListNode(1).add(2).add(1).add(3).add(1);
    ListNode exp = new ListNode(2).add(3);

    assertEquals(exp.toString(), solution.removeElements(node, 1).toString());
  }

  @Test
  public void fullMatch() {
    ListNode node = new ListNode(1).add(1).add(1).add(1).add(1);

    assertEquals(null, solution.removeElements(node, 1));
  }

  @Test
  public void testRecursive() {
    ListNode node = new ListNode(1).add(2).add(1).add(3).add(1);
    ListNode exp = new ListNode(2).add(3);

    assertEquals(exp.toString(), solution.removeElementsRecursive(node, 1).toString());
  }

  @Test
  public void testRecursiveMatch() {
    ListNode node = new ListNode(1).add(1).add(1).add(1).add(1);

    assertEquals(null, solution.removeElementsRecursive(node, 1));
  }
}