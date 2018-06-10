package delete_node_in_a_linked_list_237;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void deleteNode() {
    ListNode node = new ListNode(1).add(2).add(3);
    ListNode exp = new ListNode(1).add(3);
    solution.deleteNode(node.next);

    assertEquals(exp.toString(), node.toString());
  }
}