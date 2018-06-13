package book;

import utils.ListNode;

public class LinkedListPartition {

  // 3 > 5 > 8 > 5 > 10 > 2 > 1, 5
  // 3 > 2 > 1 > 5 > 8 > 5 > 10

  public ListNode doPartition(ListNode node, int x) {

    ListNode before = null;
    ListNode beforeHead = null;
    ListNode after = null;
    ListNode afterHead = null;

    while (node != null) {
      if (node.val < x) {
        /* Insert data in before linked list */
        if (before == null) {
          /* First node */
          before = new ListNode(node.val);
          beforeHead = before;
        } else {
          before.next = new ListNode(node.val);
          before = before.next;
        }
      } else {
        if (after == null) {
          after = new ListNode(node.val);
          afterHead = after;
        } else {
          after.next = new ListNode(node.val);
          after = after.next;
        }
      }
      node = node.next;
    }

    if (beforeHead == null) {
      return afterHead;
    }

    /* Merge before and after */
    before.next = afterHead;
    return beforeHead;
  }

}
