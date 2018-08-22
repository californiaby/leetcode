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

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Implementation of LRU Cache using LinkedHashMap.
 * LinkedHashMap allows O(1) access to data but also maintains an order of entries.
 * - If initialized as `new LinkedHashMap<>();` it keeps the insertion order.
 * - If initialized as `new LinkedHashMap<>(capacity, .75f, true);` it maintains the access order (3rd param).
 * - Method `removeEldestEntry` can be overridden to implement custom capacity management mechanism.
 */
public class LRUCacheLHM {
  LinkedHashMap<Integer, Integer> data;
  private final int CAPACITY;

  public LRUCacheLHM(int capacity) {

    this.data = new LinkedHashMap(capacity, .75f, true) {
      protected boolean removeEldestEntry(Map.Entry eldest) {
        return this.size() > CAPACITY;
      }
    };

    this.CAPACITY = capacity;
  }

  public int get(int key) {
    return data.getOrDefault(key, -1);
  }

  public void put(int key, int value) {
    data.put(key, value);
  }

}
