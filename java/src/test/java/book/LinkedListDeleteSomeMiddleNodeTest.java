package book;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;

public class LinkedListDeleteSomeMiddleNodeTest {

  LinkedListDeleteSomeMiddleNode solution = new LinkedListDeleteSomeMiddleNode();

  @Test
  public void deleteSomeMiddle() {
    ListNode n = new ListNode(1).add(2). add(3);
    solution.deleteSomeMiddle(n.next);
    ListNode exp = new ListNode(1).add(3);

    assertEquals(exp.toString(), n.toString());
  }
}