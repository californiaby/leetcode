package utils;

public class RandomListNode {
  public int val;
  public RandomListNode next;
  public RandomListNode random;

  public RandomListNode() {}

  public RandomListNode(int x) {
    this.val = x;
  }

  public String toString() {
    return this.val + "";
  }

  /**
   * Adds a new node linked via `next` to the end of current List.
   * @param x
   * @return
   */
  public RandomListNode add(int x) {
    RandomListNode end = new RandomListNode(x);
    RandomListNode n = this;

    while (n.next != null) {
      n = n.next;
    }

    n.next = end;
    return this;
  }

  /**
   * Adds a new node linked via `random` to tne end of current List.
   * @param x
   * @return
   */
  public RandomListNode addRandom(int x) {
    RandomListNode end = new RandomListNode(x);
    RandomListNode n = this;

    while (n.next != null) {
      n = n.next;
    }

    n.random = end;
    return this;
  }

  /**
   * Deletes a node with given value.
   * NOT IMPLEMENTED.
   * @param x
   * @return
   */
  public RandomListNode delete(int x) {
    RandomListNode n = this;

    return null;
  }

//  public boolean equals(RandomListNode n) {
//    RandomListNode o = this;
//
//    while (o != null && n != null) {
//
//      // compare values
//      if (o.val != n.val) return false;
//
//      if (o.next == n.next && o.random == n.random) {
//        if (o.next == null ||)
//      } return false;
//      o = o.next;
//      n = n.next;
//    }
//
//    return (o == null && n == null);
//  }
}
