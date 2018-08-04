package Linked_List_Cycle_II_142;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void detectCycle() {
    ListNode loop = new ListNode(1).add(2).add(3);
    loop.next.next.next = loop.next;

    assertEquals(loop.next, solution.detectCycle(loop));
  }

  @Test
  public void doesntHave() {
    ListNode noloop = new ListNode(1).add(2).add(3);

    assertEquals(null, solution.detectCycle(noloop));
  }
}