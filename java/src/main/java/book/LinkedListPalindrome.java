package book;

import utils.ListNode;

public class LinkedListPalindrome {

  public boolean isPalindrome(ListNode node) {

    // null, or one node > true
    if (node == null || node.next == null) return true;

    // create a reverse copy
    ListNode reversed = reverseAndClone(node);
    return isEqual(reversed, node);
  }

  /**
   * Checks if two linked lists are equal (by values).
   * @param one
   * @param two
   * @return
   */
  private boolean isEqual(ListNode one, ListNode two) {
    while (one != null && two != null) {
      if (one.val != two.val) {
        return false;
      }
      one = one.next;
      two = two.next;
    }

    // if got to the end without errors > identical
    return one == null && two == null;
  }

  /**
   * Creates a Linked list which is a reverse clone of an original list.
   * @param node
   * @return
   */
  private ListNode reverseAndClone(ListNode node) {
    ListNode head = null;
    while (node != null) {
      ListNode n = new ListNode(node.val); // clone
      n.next = head;
      head = n;
      node = node.next;
    }

    return head;
  }

}
