package Merge_k_Sorted_Lists_23;

import utils.ListNode;
import java.util.PriorityQueue;

public class Solution {
  public ListNode mergeKLists(ListNode[] lists) {
    return mergeKListsPriorityQueue(lists);
    // return mergeKListsDivideAndConquer(lists);
  }

  private ListNode mergeKListsPriorityQueue(ListNode[] lists) {
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

  private ListNode mergeKListsDivideAndConquer(ListNode[] lists) {
    if (lists == null || lists.length == 0) return null;

    int k = lists.length;
    int interval = 1;

    while (interval < k) {
      for (int i = 0; i < k - interval; interval = interval * 2) {
        lists[i] = mergeTwoLists(lists[i], lists[i + interval]);
      }
    }

    return lists[0];
  }

  private ListNode mergeTwoLists(ListNode a, ListNode b) {
    if (a == null) return b;
    if (b == null) return a;

    ListNode fakehead = new ListNode(-1);
    ListNode curr = fakehead;

    while (a != null && b != null) {
      if (a.val < b.val) {
        curr.next = a;
        a = a.next;
      } else {
        curr.next = b;
        b = b.next;
      }
      curr = curr.next;
    }

    // Append tail
    if (a != null) curr.next = a;
    if (b != null) curr.next = b;

    return fakehead.next;
  }
}
