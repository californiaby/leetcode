package odd_even_linked_list_328;

import utils.ListNode;

public class Solution {

  public ListNode oddEvenList(ListNode head) {

    if (head == null || head.next == null) return head;

    ListNode odd = head;
    ListNode even = head.next;
    ListNode headEven = even;

    while (even != null && even.next != null) {
      odd.next = odd.next.next; // or even.next
      odd = odd.next;
      even.next = even.next.next; // or odd.next
      even = even.next;
    }
    odd.next = headEven;

    return head;
  }

}
