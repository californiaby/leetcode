package book;

import utils.ListNode;

public class LinkedListSum {

  /**
   * Gets sum of two linked lists that represent REVERSE number.
   * @param l1 6 > 2 > 3: 326
   * @param l2 7 > 3 > 1: 137
   * @return sum: 326 + 127 == 453 : 3 > 5 > 4
   */
  public ListNode getSum(ListNode l1, ListNode l2) {

    // 7 > 1 > 6 : 617
    // 8 > 4 > 5 : 548
    // 5 > 6 > 1 > 1 : 1165

    ListNode ansHead = sumLists(l1, l2, 0);

    return ansHead;
  }

  private ListNode sumLists(ListNode l1, ListNode l2, int carry) {

    // end of lists and no carry
    if (l1 == null && l2 == null && carry == 0) {
      return null;
    }

    int value = carry;

    if (l1 != null) {
      value += l1.val;
    }
    if (l2 != null) {
      value += l2.val;
    }

    ListNode result = new ListNode(value % 10);

    /* Recurse */
    if (l1 != null || l2 != null) {
      ListNode more = sumLists(l1 == null ? null : l1.next,
                               l2 == null ? null : l2.next,
                               value > 9 ? 1 : 0 );
      result.next = more;
    }

    return result;
  }

}
