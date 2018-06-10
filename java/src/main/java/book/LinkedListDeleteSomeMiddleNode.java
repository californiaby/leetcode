package book;

import utils.ListNode;

public class LinkedListDeleteSomeMiddleNode {

  // 1 > 2 > 3
  // 1 > 2 > 3 > 4

  /**
   * Deletes a node that some node in the middle (neither start, nor end), given access only to this node.
   * @param n ListNoddeleteSomeMiddlee
   */
  public void deleteSomeMiddle(ListNode n) {
    // x > | a > y
    // x > | y
    // As we don't have access to previous node, solution is to copy val of next node to current and update links.

    n.val = n.next.val;
    n.next = n.next.next;
  }

}
