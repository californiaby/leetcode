package book;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;

public class LinkedListRemoveDupsTest {

  LinkedListRemoveDups solution = new LinkedListRemoveDups();

  @Test
  public void deleteDups() {
    ListNode n = new ListNode(1).add(2).add(3).add(2).add(1);
    solution.deleteDups(n);

    ListNode expected = new ListNode(1).add(2).add(3);

    assertEquals(expected.toString(), n.toString());
  }
}