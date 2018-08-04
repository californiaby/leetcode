package Intersection_Of_Two_Linked_Lists_160;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void getIntersectionNode() {
    ListNode a = new ListNode(1).add(2).add(3).add(4);
    ListNode b = new ListNode(5);
    b.next = a.next.next;

    assertEquals(b.next, solution.getIntersectionNode(a, b));
  }

  @Test
  public void nope() {
    ListNode a = new ListNode(1).add(2).add(3).add(4);
    ListNode b = new ListNode(5).add(6);

    assertEquals(null, solution.getIntersectionNode(a, b));
  }

  @Test
  public void test_null() {
    ListNode a = null;
    ListNode b = new ListNode(5).add(6);

    assertEquals(null, solution.getIntersectionNode(a, b));
  }
}