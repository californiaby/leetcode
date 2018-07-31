package Reverse_Linked_List_206;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void reverseList() {
    ListNode list = new ListNode(1).add(2).add(3);
    ListNode exp = new ListNode(3).add(2).add(1);

    assertEquals(exp.toString(), solution.reverseList(list).toString());
  }
}