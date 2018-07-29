package Add_Two_Numbers_2;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void addTwoNumbers() {
    ListNode l1 = new ListNode(1).add(2).add(3);
    ListNode l2 = new ListNode(5).add(6).add(7);
    ListNode exp = new ListNode(6).add(8).add(0).add(1);

    assertEquals(exp.toString(), solution.addTwoNumbers(l1, l2).toString());
  }
}