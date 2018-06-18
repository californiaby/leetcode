package linked_list_cycle_141;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void hasCycle() {
    ListNode loop = new ListNode(1).add(2).add(3);
    loop.next.next.next = loop.next;

    assertTrue(solution.hasCycle(loop));
  }

  @Test
  public void doesntHave() {
    ListNode noloop = new ListNode(1).add(2).add(3);

    assertFalse(solution.hasCycle(noloop));
  }
}