package book;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;

public class LinkedListDirectSumTest {

  LinkedListDirectSum solution = new LinkedListDirectSum();

  @Test
  public void sum() {
    ListNode l1 = new ListNode(1).add(2).add(3);
    ListNode l2 = new ListNode(4).add(5);
    ListNode exp = new ListNode(1).add(6).add(8);

    assertEquals(exp.toString(), solution.sum(l1, l2).toString());
  }

  @Test
  public void sum_with_carry() {
    ListNode l1 = new ListNode(7).add(0).add(6);
    ListNode l2 = new ListNode(5).add(9).add(4);
    ListNode exp = new ListNode(1).add(3).add(0).add(0);

    assertEquals(exp.toString(), solution.sum(l1, l2).toString());
  }
}