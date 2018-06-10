package book;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;

public class LinkedListReturnKthToLastTest {

  LinkedListReturnKthToLast solution = new LinkedListReturnKthToLast();

  @Test
  public void getElement() {
    ListNode n = new ListNode(1).add(2).add(3).add(4).add(5);
    ListNode tail = solution.getElement(n, 2);
    ListNode exp = new ListNode(4).add(5);

    assertEquals(exp.toString(), tail.toString());
  }

  @Test
  public void test_Null() {
    ListNode n = new ListNode(1).add(2);

    assertNull(solution.getElement(n, 3));
  }
}