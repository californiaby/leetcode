package remove_duplicates_from_sorted_list_83;

import utils.ListNode;

public class Solution {

  public ListNode deleteDuplicates(ListNode head) {

    ListNode n = head;

    while (n != null && n.next != null) {
      if (n.val == n.next.val) {
        n.next = n.next.next;
      } else {
        n = n.next;
      }

    }

    return head;
  }

}
