package swap_nodes_in_pairs_24;

import utils.ListNode;

/*
Given a linked list, swap every two adjacent nodes and return its head.
Example:
Given 1->2->3->4, you should return the list as 2->1->4->3.
Note:

Your algorithm should use only constant extra space.
You may not modify the values in the list's nodes, only nodes itself may be changed.

===

Solution
- smaller problem - swapping one pair. Needs to be done only if both != null, otherwise return single not-null node.
- for swapping two nodes we need to handle 3 links: prev > one > two > two.next
- after swapping - move all 3 pointers forward. make sure to check that new one isn't null (i.e. has link to new two)
- keep in mind that st pair doesn't have a real 'prev', we can add fakehead for that
 */

public class Solution {

  public ListNode swapPairs(ListNode head) {

    // Check if empty or single node
    if (head == null || head.next == null) return head;

    // Create fake head, link to head
    ListNode fakeHead = new ListNode(-1);
    fakeHead.next = head;

    // Get initial pointers - prev, one, and two
    ListNode prev = fakeHead;
    ListNode one = head;
    ListNode two = head.next;

    while (one != null) {
      // Check that both nodes are not null
      if (two != null) {
        // swap nodes
        // prev > one > two > two.next
        one.next = two.next;
        two.next = one;
        prev.next = two;
      }
      // move pointers
      prev = one;
      one = one.next;
      two = one == null ? null : one.next;
    }

    return fakeHead.next;
  }
}
