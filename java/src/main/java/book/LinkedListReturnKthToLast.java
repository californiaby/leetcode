package book;

import utils.ListNode;

public class LinkedListReturnKthToLast {

  /**
   * Returns Kth from end element of Linked List.
   * @param n head node
   * @param k number of element from end to return
   * @return node
   */
  public ListNode getElement(ListNode n ,int k) {
    ListNode slow = n;
    ListNode fast = n;
    int diff = 0;

    while (fast != null) {
      if (diff < k) {
        fast = fast.next;
        diff++;
      } else {
        fast = fast.next;
        slow = slow.next;
      }
    }
    if (diff == k) {
      return slow;
    } else {
      return null;
    }
  }

}
