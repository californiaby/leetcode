package reverse_linked_list_206;

import utils.ListNode;

public class Solution {

  //                        t   h
  //        1 > 2 > 3 > 4 > 5 > NULL
  // null < 1 < 2 < 3 < 4 < 5
  //                        n

  public ListNode reverseList(ListNode head) {

    ListNode tail = null;

    while (head != null) {

      // Create a new object or `next` will be a reference to existing object
      ListNode next = new ListNode(head.val);
      next.next = tail;
      head = head.next;
      tail = next;
    }

    return tail;
  }

}
