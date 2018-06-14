package utils;

public class ListNode {
  public int val;
  public ListNode next;

  public ListNode () {
  }

  public ListNode (int x) {
    this.val = x;
  }

  public String toString() {
    String s = "";
    ListNode n = this;

    while (n != null) {
      s += (n.val + " ");
      n = n.next;
    }
    return s;
  }

  /**
   * Adds a new node to the end of Linked List.
   * @param x value of node to be added.
   * @return this
   */
  public ListNode add(int x) {
    ListNode end = new ListNode(x);
    ListNode n = this;
    while (n.next != null) {
      n = n.next;
    }
    n.next = end;
    return this;
  }

  /**
   * Deletes a node from linked list.
   * @param x value of node to be deleted
   * @return updated Linked List
   */
  public ListNode delete(int x) {
    ListNode n = this;

    if (n.val == x) {
      return n.next;
    }

    while (n.next != null) {
      if (n.next.val == x) {
        n.next = n.next.next;
        return this;
      }
      n = n.next;
    }
    return this;
  };
}
