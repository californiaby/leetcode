package Copy_List_with_Random_Pointer_138;

import org.junit.Test;
import utils.RandomListNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void copyRandomList() {
    RandomListNode head = new RandomListNode(1);
    head.add(2).add(3);
    head.random = head.next.next;
    head.next.next.random = head.next;

    RandomListNode copy = solution.copyRandomList(head);
  }
}