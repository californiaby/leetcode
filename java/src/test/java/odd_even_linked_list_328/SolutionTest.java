package odd_even_linked_list_328;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void oddEvenList() {
    ListNode node = new ListNode(1).add(2).add(3);
    ListNode exp = new ListNode(1).add(3).add(2);

    assertEquals(exp.toString(), solution.oddEvenList(node).toString());
  }
}