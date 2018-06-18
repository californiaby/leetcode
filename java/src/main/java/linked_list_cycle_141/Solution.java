package linked_list_cycle_141;

import utils.ListNode;

/*
Given a linked list, determine if it has a cycle in it.
Follow up:
Can you solve it without using extra space?
 */

public class Solution {

  public boolean hasCycle(ListNode head) {

    // slow + fast pointers. If they meet == cycle, if point to null == no cycle
    ListNode slow = head;
    ListNode fast = head;

    // make sure that calling next and next.next doesn't cause NPE
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) return true;
    }

    // while has ended - meaning we've achieved end of list
    return false;
  }

}
