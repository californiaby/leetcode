package Intersection_Of_Two_Linked_Lists_160;

/*
Write a program to find the node at which the intersection of two singly linked lists begins.
For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗
B:     b1 → b2 → b3
begin to intersect at node c1.
- If the two linked lists have no intersection at all, return null.
- The linked lists must retain their original structure after the function returns.
- You may assume there are no cycles anywhere in the entire linked structure.
- Your code should preferably run in O(n) time and use only O(1) memory.
 */

import utils.ListNode;

public class Solution {

  // 1. On fly: use set, store parsed, compare on each iteration
  // 2. Simpler - iterate through each, get length, check that last is same
  //    iterate again (take length diff into account), once point to same > return

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    if (headA == null || headB == null) return null;
    if (headA == headB) return headA;

    // get tails and sizes
    ListNode a = headA;
    ListNode b = headB;
    int sizeA = 1;
    int sizeB = 1;

    while (a.next != null) {
      a = a.next;
      sizeA++;
    }

    while (b.next != null) {
      b = b.next;
      sizeB++;
    }

    // Check if the last node is the same
    if (a != b) return null;

    a = headA;
    b = headB;

    // If sizes are different - move longer X time forward
    if (sizeA > sizeB) {
      a = move(a, sizeA - sizeB);
    } else if (sizeA < sizeB) {
      b = move(b, sizeB - sizeA);
    }

    // iterate through lists, return node if match
    while (a != null && b != null) {
      if (a == b) return a;
      a = a.next;
      b = b.next;
    }

    // iterated to the end and didn't find a match - return null
    return null;

  }

  /**
   * Moves node x times forward.
   * @param node
   * @param n
   * @return
   */
  private ListNode move(ListNode node, int n) {
    for (int i = 0; i < n; i++) {
      node = node.next;
    }
    return node;
  }

}
