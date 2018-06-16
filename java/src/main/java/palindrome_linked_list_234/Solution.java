package palindrome_linked_list_234;

import utils.ListNode;

public class Solution {

  public boolean isPalindrome(ListNode head) {

    // empty or single node > true
    if (head == null || head.next == null) return true;

    ListNode reverse = reverseAndClone(head);
    return isEqual(head, reverse);
  }

  private  ListNode reverseAndClone(ListNode node) {
    ListNode head = null;

    while (node != null) {
      ListNode newNode = new ListNode(node.val);
      newNode.next = head;
      head = newNode;
      node = node.next;
    }

    return head;
  }

  private boolean isEqual(ListNode one, ListNode two) {
    while (one != null || two != null) {
      if (one.val != two.val) return false;
      one = one.next;
      two = two.next;
    }

    return (one == null && two == null);
  }

}
