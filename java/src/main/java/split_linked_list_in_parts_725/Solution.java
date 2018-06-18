package split_linked_list_in_parts_725;

/*
  Split linked list into k sublists.
  Sublists should have length as close to equal as possible.
  If list has not enough nodes - null are valid sublists
 */

import utils.ListNode;

public class Solution {

  public ListNode[] splitListToParts(ListNode root, int k) {

    // get length
    int l = 0;
    ListNode node = root;
    while (node != null) {
      node = node.next;
      l++;
    }

    // calculate base length of each sublist and number of sublists with extra length
    ListNode[] ans = new ListNode[k];
    int baseLength = l / k;
    int bonus = l % k;

    // move pointer back to root
    node = root;
    ListNode head = node;

    // iterate through list
    for (int i = 0; i < k; i++) {

      // get length of current sublist
      int sublistLength = baseLength + (i < bonus ? 1 : 0);

      // move pointer x nodes forward
      for (int j = 0; j < sublistLength - 1; j++) {
        if (node != null) node = node.next;
      }

      // node is the last element in sublist
      if (node != null) {
        // Add to array, break link, move head pointer
        ans[i] = head;
        head = node.next;
        node.next = null;
        node = head;
      } else {
        ans[i] = null;
      }
    }

    return ans;
  }

}
