package LRU_Cache_146;

import org.junit.Test;

import static org.junit.Assert.*;

public class LRUCacheTest {

  @Test
  public void get() {
    LRUCache cache = new LRUCache(3);
    cache.put(1, 10);;
    cache.put(2, 20);
    cache.put(3, 30);

    assertEquals(20, cache.get(2));
    assertEquals(10, cache.get(1));
    assertEquals(30, cache.get(3));

    cache.put(4, 40);

    assertEquals(10, cache.get(1));
    assertEquals(-1, cache.get(2));
    assertEquals(30, cache.get(3));
    assertEquals(40, cache.get(4));
  }

  /*
  Input:
["LRUCache","put","put","get","put","put","get"]
[[2],[2,1],[2,2],[2],[1,1],[4,1],[2]]
Output:
[null,null,null,1,null,null,-1]
Expected:
[null,null,null,2,null,null,-1]

   */

  @Test
  public void leet() {
    LRUCache cache = new LRUCache(2);

    cache.put(2, 1);
    cache.put(2, 2);
    assertEquals(2, cache.get(2));
    cache.put(1, 1);;
    cache.put(4, 1);;
    assertEquals(-1, cache.get(2));
  }
}