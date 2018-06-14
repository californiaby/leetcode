package book;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;

public class LinkedListSumTest {

  LinkedListSum solution = new LinkedListSum();

  @Test
  public void getSum() {
    ListNode l1 = new ListNode(7).add(1).add(6);
    ListNode l2 = new ListNode(8).add(4).add(5);
    ListNode exp = new ListNode(5).add(6).add(1).add(1);

    assertEquals(exp.toString(), solution.getSum(l1, l2).toString());
  }
}