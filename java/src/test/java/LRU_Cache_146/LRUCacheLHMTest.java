package LRU_Cache_146;

import org.junit.Test;

import static org.junit.Assert.*;

public class LRUCacheLHMTest {

  @Test
  public void get() {
    LRUCacheLHM cache = new LRUCacheLHM(3);
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

}