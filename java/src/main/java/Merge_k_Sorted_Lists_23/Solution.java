package Merge_k_Sorted_Lists_23;

import utils.ListNode;
import java.util.PriorityQueue;

public class Solution {
  public ListNode mergeKLists(ListNode[] lists) {

    if (lists == null || lists.length == 0) return null;

    int k = lists.length;
    PriorityQueue<ListNode> q = new PriorityQueue<>((a,b) -> a.val - b.val);
    ListNode fakeHead = new ListNode(0);
    ListNode curr = fakeHead;

    // Populate PriorityQueue with first nodes of each list
    for (int i = 0; i < k; i++) {
      if (lists[i] != null) q.add(lists[i]);
    }

    // Iterate through the queue, append min node and add next of processed node to queue
    while (!q.isEmpty()) {
      ListNode min = q.poll();                  // poll min node
      if (min.next != null) q.add(min.next);    // add min.next to q
      curr.next = min;                          // append min node to the curr node
      curr = curr.next;                         // move curr pointer forward
    }

    return fakeHead.next;
  }
}
