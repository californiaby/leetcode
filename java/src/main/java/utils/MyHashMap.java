package utils;

/**
 * Implementation of HashMap.
 * According to requirements, it should be able to store up to 1,000,000 pairs.
 * Straightforward solution would be to initialize an array for 1,000,000 elements. However, it's not memory-wise.
 * Instead, we initialize a smaller array and use `Integer.hashCode(key) % buckets.length` to find key's hashcode.
 * Each value of array is a Bucket - i.e. a LinkedList of key/value pairs.
 * List begins with head (-1, -1) and points to the next _real_ key/value pair (1, 10);
 * If we add an element with the same hash of the key, we check if such bucket already exists.
 * If it does - we iterate through the list of elements until current node is the last one.
 * Then we add the new node to the end.
 *
 * To iterate through the list we use method `find(buckets[i], key)`
 *
 */
public class MyHashMap {

  final Bucket[] buckets = new Bucket[10000];

  public void put(int key, int value) {
    int i = idx(key);
    if (buckets[i] == null)
      buckets[i] = new Bucket();
    MyListNode prev = find(buckets[i], key);
    if (prev.next == null)
      prev.next = new MyListNode(key, value);
    else prev.next.val = value;
  }

  public int get(int key) {
    int i = idx(key);
    if (buckets[i] == null)
      return -1;
    MyListNode node = find(buckets[i], key);
    return node.next == null ? -1 : node.next.val;
  }

  public void remove(int key) {
    int i = idx(key);
    if (buckets[i] == null) return;
    MyListNode prev = find(buckets[i], key);
    if (prev.next == null) return;
    prev.next = prev.next.next;
  }

  int idx(int key) { return Integer.hashCode(key) % buckets.length;}

  MyListNode find(Bucket bucket, int key) {
    MyListNode node = bucket.head, prev = null;
    while (node != null && node.key != key) {
      prev = node;
      node = node.next;
    }
    return prev;
  }
}

class Bucket {
  final MyListNode head = new MyListNode(-1, -1);
}

class MyListNode {
  int key, val;
  MyListNode next;

  MyListNode(int key, int val) {
    this.key = key;
    this.val = val;
  }
}