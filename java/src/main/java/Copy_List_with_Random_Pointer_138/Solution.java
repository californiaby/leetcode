package Copy_List_with_Random_Pointer_138;

/*
A linked list is given such that each node contains an additional
random pointer which could point to any node in the list or null.
Return a deep copy of the list.
 */

import utils.RandomListNode;

import java.util.HashMap;

public class Solution {
  public RandomListNode copyRandomList(RandomListNode head) {

    // iterate through the original list and build a copy with `next` links
    // store a hashmap of new nodes with val as a key and object as a value - this will make linking faster
    // iterate through the original list and build a copy with `random` links

    // we assume that each node is accessible through `next` and each node has an unique value

    if (head == null) return null;

    // map for quick reference to copy's nodes by value
    HashMap<Integer, RandomListNode> map = new HashMap<>();

    RandomListNode fakeHead = new RandomListNode(-1);
    fakeHead.next = head;
    head = fakeHead;

    RandomListNode fakeCopyHead = new RandomListNode(-1);
    RandomListNode copy = fakeCopyHead;

    // iterate through original list and create a copy with `next` links and map of copy's nodes
    while (head.next != null) {
      // create a copy with `next link
      copy.next = new RandomListNode(head.next.val);

      // put next node to map as value : object
      map.put(copy.next.val, copy.next);

      // move forward
      head = head.next;
      copy = copy.next;
    }

    head = fakeHead;
    copy = fakeCopyHead;

    while (head != null) {

      // check if node has a `random` link
      if (head.random != null) {
        copy.random = map.get(head.random.val);
      }

      head = head.next;
      copy = copy.next;
    }

    return fakeCopyHead.next;

  }
}
