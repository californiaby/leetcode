package Add_Two_Numbers_2;

/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */

import utils.ListNode;

public class Solution {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    // Check if one of lists is empty
    if (l1 == null) return l2;
    if (l2 == null) return l1;

    // Create dummyHead which will point to real head as next
    ListNode dummyHead = new ListNode(-1);
    ListNode current = dummyHead;
    int carry = 0;

    // Iterate through lists
    while (l1 != null || l2 != null) {

      // Get values of current nodes and sum
      int a = l1 != null ? l1.val : 0;
      int b = l2 != null ? l2.val : 0;
      int sum = a + b + carry;

      // Create new node with sum, move pointer and update carry
      carry = sum / 10;
      current.next = new ListNode(sum % 10);
      current = current.next;

      // Iterate, double check that there's next
      if (l1 != null) l1 = l1.next;
      if (l2 != null) l2 = l2.next;
    }

    // If end of lists reached but there's still a carry - add one more node
    if (carry > 0) current.next = new ListNode(carry);

    return dummyHead.next;
  }

}
