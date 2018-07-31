package Reverse_Linked_List_206;

import utils.ListNode;

public class Solution {

  //                        t   h
  //        1 > 2 > 3 > 4 > 5 > NULL
  // null < 1 < 2 < 3 < 4 < 5
  //                        temp

  public ListNode reverseList(ListNode head) {

    ListNode tail = null;

    while (head != null) {
       ListNode temp = head.next;
       head.next = tail;
       tail = head;
       head = temp;
    }

    return tail;
  }

  public ListNode reverseListRecursive(ListNode head) {

    if (head == null || head.next == null) return head;

    ListNode p = reverseListRecursive(head.next);
    head.next.next = head;
    head.next = null;
    return p;
  }

}
