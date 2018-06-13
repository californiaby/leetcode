package book;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;

public class LinkedListPartitionTest {

  LinkedListPartition solution = new LinkedListPartition();

  @Test
  public void doPartition() {
    // 3 > 5 > 8 > 5 > 10 > 2 > 1, 5
    ListNode n = new ListNode(3).add(5).add(8).add(5).add(10).add(2).add(1);
    ListNode exp = new ListNode(3).add(2).add(1).add(5).add(8).add(5).add(10);

    assertEquals(exp.toString(), solution.doPartition(n, 5).toString());
  }


  @Test
  public void same() {
    ListNode n = new ListNode(1).add(1).add(1);

    assertEquals(n.toString(), solution.doPartition(n, 3).toString());
  }

  @Test
  public void single() {
    ListNode n = new ListNode(1);

    assertEquals(n.toString(), solution.doPartition(n, 3).toString());
  }

}
