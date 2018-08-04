package Linked_List_Cycle_II_142;

/*

Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
Note: Do not modify the linked list.
Follow up:Can you solve it without using extra space?

 */

import utils.ListNode;

public class Solution {

  /*
  Solution:
  1. Use Set to store the list of visited nodes. Once see already visited - it's the entrance to the cycle.
  Uses extra space.

  2. Slow / Fast pointers. Iterate until they meet. This spot is x steps away from the beginning of the cycle.
  1st node is also x steps away. Iterate 1-by-1 from meeting point and head until pointer meet.
  Does not use extra space.
   */

  public ListNode detectCycle(ListNode head) {

    if (head == null || head.next == null) return null;

    ListNode slow = head;
    ListNode fast = head;

    // check if there's intersection
    ListNode intersect = getIntersection(head);
    if (intersect == null) return null;

    // iterate from head and intersect nodes until pointers meet
    while (head != intersect) {
      head = head.next;
      intersect = intersect.next;
    }

    return head;
  }

  private ListNode getIntersection(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) return fast;
    }

    return null;
  }

}
