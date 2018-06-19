package remove_nth_node_from_end_of_list_19;

/*

Given a linked list, remove the n-th node from the end of list and return its head.
Example:
1->2->3->4->5, and n = 2.
After removing the second node from the end: 1->2->3->5.

Note:
Given n will always be valid.

Follow up:
Could you do this in one pass?

=======
Solution:
- one pass > recursion
- meaning function will have to return count from the end
- once we found the node > move back one more time so that link from previous can be updated
- modification is simple: prev. next = next.next
 */

import utils.ListNode;

import javax.xml.soap.Node;

public class Solution {

  public ListNode removeNthFromEnd(ListNode head, int n) {

    if (head == null) return null;

    // use fakeHead in case if head will be deleted
    ListNode fakeHead = new ListNode(-1);
    fakeHead.next = head;
    recursiveDelete(fakeHead, n);

    return fakeHead.next;
  }

  private int recursiveDelete(ListNode front, int n) {

    // end of list
    if (front == null) {
      return 0;
    }

    // get count from following nodes
    int tail = recursiveDelete(front.next, n);

    // if match - delete
    if (tail == n) {
      front.next = front.next.next;
    }

    // return increased count
    return tail + 1;
  }

}
