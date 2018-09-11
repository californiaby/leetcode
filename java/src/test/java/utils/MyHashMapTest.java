package utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashMapTest {

  @Test
  public void test() {
    MyHashMap map = new MyHashMap();

    map.put(1, 10);
    map.put(10001, 20);
    map.get(2);
    map.put(2, 40);
    map.remove(10001);
    map.get(2);
  }


  @Test
  public void put() {
  }

  @Test
  public void get() {
  }

  @Test
  public void remove() {
  }

  @Test
  public void idx() {
  }

  @Test
  public void find() {
  }
}