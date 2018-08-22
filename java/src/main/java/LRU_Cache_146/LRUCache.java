package LRU_Cache_146;

/*
Design and implement a data structure for Least Recently Used (LRU) cache.
It should support the following operations: get and put.

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity,
it should invalidate the least recently used item before inserting a new item.

Follow up:
Could you do both operations in O(1) time complexity?
 */

import java.util.HashMap;

/**
 * Implementation of LRU Cache with HashMap (data) and doubly-linked List (quick access and removal).
 * HashMap<Integer, Node> is used to store keys and Nodes with values. Gives O(1) access to get / add data.
 * `Node` is a doubly linked list. We store head and tail to allow O(1) access to removing oldest node, and adding new
 * nodes to the head.
 */
public class LRUCache {

  private class Node {
    int key, val;
    Node prev, next;

    Node(int key, int val) {
      this.key = key;
      this.val = val;
    }

    Node() {
      this(0, 0);
    }

    public String toString() {
      return String.valueOf(this.val);
    }
  }

  private final int CAPACITY;
  private HashMap<Integer, Node> map;
  private Node head, tail;

  public LRUCache(int capacity) {
    this.CAPACITY = capacity;
    this.map = new HashMap<>();
    head = new Node();
    tail = new Node();
    head.next = tail;
    tail.next = head;
  }

  /**
   * Gets key's value from the map.
   * Also, modifies node's position in the List, moving it to the beginning (so that it's most requested).
   * @param key
   * @return
   */
  public int get(int key) {
    Node n = map.get(key);
    if (n == null) {
      return -1;
    } else {
      moveInTheList(n);
      return n.val;
    }
  }

  /**
   * Adds new value to the map.
   * Also, checks if map size has grown more than CAPACITY. If it did - removes the oldest node from both list and map.
   * @param key
   * @param value
   */
  public void put(int key, int value) {
    Node n = map.get(key);

    if (n == null) {
      // Key does not exist in the map. Create new node, put in map, add to list
      n = new Node(key, value);
      map.put(key, n);
      addToListHead(n);
    } else {
      // Key exists. Modify the value, move to list head
      n.val = value;
      moveInTheList(n);
    }

    // CAPACITY overflow: remove last node from the list and delete corresponding entry from the map
    if (map.size() > CAPACITY) {
      Node oldest = tail.prev;
      removeFromList(oldest);
      map.remove(oldest.key);
    }
  }

  /**
   * Updates a node on request.
   * Removes node from its current location in the list and adds to the beginning (after head).
   * @param n
   */
  private void moveInTheList(Node n) {
    removeFromList(n);
    addToListHead(n);
  }

  /**
   * Removes node from the list.
   * Updates links between n.prev and n.next to point to each other.
   * @param n
   */
  private void removeFromList(Node n) {
    Node prev = n.prev;
    Node next = n.next;

    prev.next = next;
    next.prev = prev;
  }

  /**
   * Adds node to the head.
   * Modifies head and head.next to point to n between them.
   * @param n
   */
  private void addToListHead(Node n) {
    Node prev = head;
    Node next = head.next;

    prev.next = n;
    n.prev = prev;
    n.next = next;
    next.prev = n;
  }

}
