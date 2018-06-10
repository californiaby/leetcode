package utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListNodeTest {

  @Test
  public void test_createLinkedList() {
    ListNode node = new ListNode(1);

    assertEquals(1, node.val);
    assertEquals(null, node.next);
  }

  @Test
  public void test_addNodes() {
    ListNode node = new ListNode(1);
    node.add(4).add(5).add(8);

    assertEquals(1, node.val);
    assertEquals(4, node.next.val);
    assertEquals(5, node.next.next.val);
    assertEquals(8, node.next.next.next.val);
  }

  @Test
  public void test_deleteNodes() {
    ListNode node = new ListNode(1);
    node.add(4).add(5).add(8).delete(5).add(11);

    assertEquals(1, node.val);
    assertEquals(4, node.next.val);
    assertEquals(8, node.next.next.val);
    assertEquals(11, node.next.next.next.val);
  }
}