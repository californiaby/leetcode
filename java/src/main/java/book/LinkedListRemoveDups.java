package book;

import utils.ListNode;

import java.util.HashSet;

public class LinkedListRemoveDups {

  // 0 > 1 > 4 > 2 > 1 > 2
  // Duplicate - same value
  // Use Set to store already processed values

  public void deleteDups(ListNode n) {
    HashSet<Integer> set = new HashSet<>();
    ListNode previous = null;

    while (n != null) {
      if (set.contains(n.val)) {
        previous.next = n.next;
      } else {
        set.add(n.val);
        previous = n;
      }
      n = n.next;
    }
  }

}
