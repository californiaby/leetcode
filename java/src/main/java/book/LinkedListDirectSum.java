package book;

import utils.ListNode;

public class LinkedListDirectSum {

  /**
   * Generates a ListNode representing a sum of two linked list (direct representation of a number)
   * @param l1 linked list 1 > 2 > 3
   * @param l2 linked list 4 > 5
   * @return 123 + 45 = 158 : 1 > 6 > 8
   */
  public ListNode sum(ListNode l1, ListNode l2) {

    // Get lists sizes
    int size1 = getListSize(l1);
    int size2 = getListSize(l2);
    int diff = Math.abs(size1 - size2);

    // Add zero nodes to smaller list
    for (int i = 0; i < diff; i++) {
      if (size1 < size2) {
        l1 = push(0, l1);
      } else {
        l2 = push(0, l2);
      }
    }

    // Get an obj representing sum of following nodes + potential carryover
    NodeSumObj obj = getNodeSumData(l1, l2);
    ListNode ans = new ListNode();

    // check if a new head needs to be generated for carryover
    if (obj.carry == 0) {
      ans = obj.node;
    } else {
      ans.val = obj.carry; // 1
      ans.next = obj.node; // old head
    }

    return ans;
  }

  /**
   * Calculates the linked list size.
   * @param n
   * @return
   */
  private int getListSize(ListNode n) {
    // TODO: handle looped linked list check
    int count = 0;
    while (n != null) {
      n = n.next;
      count++;
    }
    return count;
  }

  /**
   * Adds nodes with provided value before an existing ListNode.
   * @param x value of node to be added
   * @param node value of node to be added
   * @return updated linked list
   */
  private ListNode push(int x, ListNode node) {
    ListNode newNode = new ListNode(x);
    newNode.next = node;
    return newNode;
  }

  /**
   * Represents data passed from right part of listNode:
   * this.node - a node poining to list representing sum (right part)
   * this.carry - a value carried from right nodes sum
   */
  private class NodeSumObj {
    ListNode node;
    int carry;
  }

  private NodeSumObj getNodeSumData(ListNode l1, ListNode l2) {

    // end of lists > return ListNode null and 0 carry;
    if (l1 == null && l2 == null) {
      return new NodeSumObj();
    }

    // Get data from following nodes
    // sum contains a node that we'll need to point to and carry (possible)
    NodeSumObj sum = getNodeSumData(l1.next, l2.next);
    NodeSumObj current = new NodeSumObj();

    int valSum = l1.val + l2.val + sum.carry;
    current.carry = valSum / 10;
    current.node = new ListNode(valSum % 10);
    current.node.next = sum.node;

    return current;
  }

}


