package remove_linked_list_elements_203;

import utils.ListNode;

public class Solution {

  public ListNode removeElements(ListNode head, int val) {

    // Create a listNode that contains new head as a 'next' reference
    ListNode fakeHead = new ListNode(-1);
    fakeHead.next = head;

    // Create two listNodes that point to current (reading) and prev (editing)
    ListNode prev = fakeHead;

    while (head != null) {
      if (head.val == val) {
        // move prev.next pointer to skip the current (matching) node
        prev.next = head.next;
      } else {
        prev = prev.next;
      }
      head = head.next;
    }
    return fakeHead.next;
  }

  public ListNode removeElementsRecursive(ListNode head, int val) {
    if (head == null) return null;
    head.next = removeElementsRecursive(head.next, val);

    return head.val == val ? head.next : head;
  }

}
